package cz.marek_b.fitness_reservation.core.dao;

import cz.marek_b.fitness_reservation.core.data.Trainer;
import java.util.List;

public interface TrainerDao extends GenericDao<Trainer, Long> {
    
    List<Trainer> findAll();
    
}
