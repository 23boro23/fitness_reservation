package cz.marek_b.fitness_reservation.service;

import cz.marek_b.fitness_reservation.core.data.Gym;
import cz.marek_b.fitness_reservation.web.form.bean.GymFormBean;
import java.util.List;

public interface GymService {
    
    void save(GymFormBean formBean);
    List<Gym> findAll();
    
}
