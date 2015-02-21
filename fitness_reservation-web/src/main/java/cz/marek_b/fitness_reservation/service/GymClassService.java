package cz.marek_b.fitness_reservation.service;

import cz.marek_b.fitness_reservation.core.data.GymClass;
import cz.marek_b.fitness_reservation.web.form.bean.GymClassFormBean;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface GymClassService {
    
    void saveGymClass(GymClassFormBean gymClassFormBean) throws ParseException;
    List<GymClass> findAll(Date dateStart);
    
}
