package cz.marek_b.fitness_reservation.core.dao;

import cz.marek_b.fitness_reservation.core.data.Gym;
import java.util.List;

public interface GymDao extends GenericDao<Gym, Long> {
    
    List<Gym> findAll();
    
}
