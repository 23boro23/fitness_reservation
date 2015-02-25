package cz.marek_b.fitness_reservation.service;

import cz.marek_b.fitness_reservation.core.data.GymClassType;
import cz.marek_b.fitness_reservation.web.form.bean.ClassTypeFormBean;
import java.util.List;

public interface GymClassTypeService {
    
    void addGymClassType(ClassTypeFormBean formBean);
    List<GymClassType> findAll();
    
}
