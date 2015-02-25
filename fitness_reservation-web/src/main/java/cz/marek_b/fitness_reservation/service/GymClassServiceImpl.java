package cz.marek_b.fitness_reservation.service;

import cz.marek_b.fitness_reservation.core.dao.GymClassDao;
import cz.marek_b.fitness_reservation.core.dao.GymClassTypeDao;
import cz.marek_b.fitness_reservation.core.dao.GymDao;
import cz.marek_b.fitness_reservation.core.dao.TrainerDao;
import cz.marek_b.fitness_reservation.core.data.GymClass;
import cz.marek_b.fitness_reservation.core.util.DateFormatter;
import cz.marek_b.fitness_reservation.web.form.bean.GymClassFormBean;
import java.text.ParseException;
import java.util.Calendar;
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
    @Autowired
    private GymClassTypeDao gymClassTypeDao;

    @Override
    @Transactional
    public void saveGymClass(GymClassFormBean gymClassFormBean) throws ParseException {
        GymClass gymClass = new GymClass();
        gymClass.setStart(DateFormatter.getDateTime(gymClassFormBean.getStart()));
        gymClass.setEnd(DateFormatter.getDateTime(gymClassFormBean.getEnd()));
        gymClass.setTrainer(trainerDao.findById(gymClassFormBean.getTrainer()));
        gymClass.setGym(gymDao.findById(gymClassFormBean.getGym()));
        gymClass.setClassType(gymClassTypeDao.findById(gymClassFormBean.getClassType()));

        gymClassDao.create(gymClass);
    }
    
    @Override
    public Map<String, GymClass> findAll(Date dateStart) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateStart);
        cal.add(Calendar.DATE, 7);
        Date dateEnd = cal.getTime();
        //final GymClass gc1 = new GymClass(1L, "24.02.2015 14:00", 4);
        
        List<GymClass> classes = gymClassDao.findAll(dateStart, dateEnd);
        Map<String, GymClass> ret = new HashMap<>(classes.size());
        
        for (GymClass c : classes) {
            ret.put(c.getStartFormatted(), c);
        }
        
        return ret;
    }

}
