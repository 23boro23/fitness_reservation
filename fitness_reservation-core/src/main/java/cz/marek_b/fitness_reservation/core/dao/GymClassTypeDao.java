package cz.marek_b.fitness_reservation.core.dao;

import cz.marek_b.fitness_reservation.core.data.GymClassType;
import java.util.List;

public interface GymClassTypeDao extends GenericDao<GymClassType, Long> {
    
    List<GymClassType> findAll();
    
}
