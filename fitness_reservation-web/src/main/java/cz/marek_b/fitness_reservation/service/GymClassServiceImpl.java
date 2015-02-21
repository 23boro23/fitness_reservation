package cz.marek_b.fitness_reservation.service;

import cz.marek_b.fitness_reservation.core.dao.GymClassDao;
import cz.marek_b.fitness_reservation.core.dao.GymDao;
import cz.marek_b.fitness_reservation.core.dao.TrainerDao;
import cz.marek_b.fitness_reservation.core.data.GymClass;
import cz.marek_b.fitness_reservation.core.util.DateFormatter;
import cz.marek_b.fitness_reservation.web.form.bean.GymClassFormBean;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
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
    public List<GymClass> findAll(Date dateStart) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateStart);
        cal.add(Calendar.DATE, 7);
        
        //return gymClassDao.findAll(dateStart, cal.getTime());
        
        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.YEAR, 2015);
        cal1.set(Calendar.MONTH, 1);
        cal1.set(Calendar.DAY_OF_MONTH, 10);
        cal1.set(Calendar.HOUR_OF_DAY, 7);
        cal1.set(Calendar.MINUTE, 00);
        
        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.YEAR, 2015);
        cal2.set(Calendar.MONTH, 1);
        cal2.set(Calendar.DAY_OF_MONTH, 10);
        cal2.set(Calendar.HOUR_OF_DAY, 11);
        cal2.set(Calendar.MINUTE, 15);
        
        final GymClass gc1 = new GymClass();
        gc1.setId(1L);
        gc1.setCapacity(10);
        gc1.setStart(cal1.getTime());
        cal1.add(Calendar.HOUR, 1);
        gc1.setEnd(cal1.getTime());
        
        final GymClass gc2 = new GymClass();
        gc2.setId(2L);
        gc2.setCapacity(20);
        gc2.setStart(cal2.getTime());
        cal2.add(Calendar.HOUR, 2);
        gc2.setEnd(cal2.getTime());
        
        return new ArrayList<GymClass>() {{
            add(gc1); add(gc2);
        }};
    }

}
