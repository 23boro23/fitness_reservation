package cz.marek_b.fitness_reservation.core.dao;

import cz.marek_b.fitness_reservation.core.data.GymClass;
import java.util.Date;
import java.util.List;

public interface GymClassDao extends GenericDao<GymClass, Long> {

    List<GymClass> findAll(Date start, Date end);
    
}
