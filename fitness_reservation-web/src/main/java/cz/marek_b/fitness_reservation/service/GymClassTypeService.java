package cz.marek_b.fitness_reservation.service;

import cz.marek_b.fitness_reservation.core.data.GymClassType;
import cz.marek_b.fitness_reservation.web.form.bean.GymClassTypeFormBean;
import java.util.List;

public interface GymClassTypeService {
    
    void addGymClassType(GymClassTypeFormBean formBean);
    List<GymClassType> findAll();
    
}
