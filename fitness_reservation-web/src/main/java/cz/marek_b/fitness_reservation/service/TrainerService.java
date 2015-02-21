package cz.marek_b.fitness_reservation.service;

import cz.marek_b.fitness_reservation.core.data.Trainer;
import cz.marek_b.fitness_reservation.web.form.bean.TrainerFormBean;
import java.util.List;


public interface TrainerService {
    
    List<Trainer> findAllTrainers();
    void addTrainer(TrainerFormBean trainerFormBean);
    void removeTrainer(long id);
    
}
