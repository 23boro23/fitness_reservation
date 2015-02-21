package cz.marek_b.fitness_reservation.core.dao.impl;

import cz.marek_b.fitness_reservation.core.dao.Dao;
import cz.marek_b.fitness_reservation.core.dao.GymDao;
import cz.marek_b.fitness_reservation.core.data.Gym;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class GymDaoImpl extends Dao<Gym, Long> implements GymDao {

    @Override
    public List<Gym> findAll() {
        return em.createNamedQuery("Gym.findAll", Gym.class).getResultList();
    }
    
}
