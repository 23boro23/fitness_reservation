package cz.marek_b.fitness_reservation.core.dao.impl;

import cz.marek_b.fitness_reservation.core.dao.Dao;
import cz.marek_b.fitness_reservation.core.dao.GymClassTypeDao;
import cz.marek_b.fitness_reservation.core.data.GymClassType;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class GymClassTypeDaoImpl extends Dao<GymClassType, Long> implements GymClassTypeDao {
    
    @Override
    public List<GymClassType> findAll() {
        return em.createNamedQuery("GymClassType.findAll", GymClassType.class).getResultList();
    }
    
}
