package cz.marek_b.fitness_reservation.service;

import cz.marek_b.fitness_reservation.bean.GymClassBean;
import cz.marek_b.fitness_reservation.web.form.bean.GymClassFormBean;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface GymClassService {
    
    void saveGymClass(GymClassFormBean gymClassFormBean) throws ParseException;
    List<GymClassBean> findAll(Date dateStart);
    Map<String, GymClassBean> findAll2(Date dateStart);
    
}
