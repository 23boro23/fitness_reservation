package cz.marek_b.fitness_reservation.service;

import cz.marek_b.fitness_reservation.bean.GymClassBean;
import cz.marek_b.fitness_reservation.core.dao.GymClassDao;
import cz.marek_b.fitness_reservation.core.dao.GymDao;
import cz.marek_b.fitness_reservation.core.dao.TrainerDao;
import cz.marek_b.fitness_reservation.core.data.GymClass;
import cz.marek_b.fitness_reservation.core.util.DateFormatter;
import cz.marek_b.fitness_reservation.web.form.bean.GymClassFormBean;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GymClassServiceImpl implements GymClassService {

    @Autowired
    private GymClassDao gymClassDao;
    @Autowired
    private TrainerDao trainerDao;
    @Autowired
    private GymDao gymDao;

    @Override
    @Transactional
    public void saveGymClass(GymClassFormBean gymClassFormBean) throws ParseException {
        GymClass gymClass = new GymClass();
        gymClass.setStart(DateFormatter.getDateTime(gymClassFormBean.getStart()));
        gymClass.setEnd(DateFormatter.getDateTime(gymClassFormBean.getEnd()));
        gymClass.setTrainer(trainerDao.findById(gymClassFormBean.getTrainer()));
        gymClass.setGym(gymDao.findById(gymClassFormBean.getGym()));

        gymClassDao.create(gymClass);
    }

    @Override
    public List<GymClassBean> findAll(Date dateStart) {
        final GymClassBean gc1 = new GymClassBean(1L, "24.02.2015 14:00", 4);
        //final GymClassBean gc2 = new GymClassBean(2L, "24.02.2015 14:00", 4);
        //final GymClassBean gc3 = new GymClassBean(3L, "24.02.2015 14:00", 4);
        //final GymClassBean gc4 = new GymClassBean(4L, "24.02.2015 14:00", 4);
        
        return new ArrayList<GymClassBean>() {{
            add(gc1); //add(gc2); add(gc3); add(gc4);
        }};
    }

    @Override
    public Map<String, GymClassBean> findAll2(Date dateStart) {
        final GymClassBean gc1 = new GymClassBean(1L, "24.02.2015 14:00", 4);
        final GymClassBean gc2 = new GymClassBean(2L, "24.02.2015 18:00", 8);
        final GymClassBean gc3 = new GymClassBean(3L, "25.02.2015 07:00", 6);
        final GymClassBean gc4 = new GymClassBean(4L, "26.02.2015 10:00", 4);
        
        return new HashMap<String, GymClassBean>() {{
            put(gc1.getStart(), gc1);
            put(gc2.getStart(), gc2);
            put(gc3.getStart(), gc3);
            put(gc4.getStart(), gc4);
        }};
    }

}
