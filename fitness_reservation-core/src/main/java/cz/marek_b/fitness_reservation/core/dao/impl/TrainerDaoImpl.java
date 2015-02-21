package cz.marek_b.fitness_reservation.core.dao.impl;

import cz.marek_b.fitness_reservation.core.dao.Dao;
import cz.marek_b.fitness_reservation.core.dao.TrainerDao;
import cz.marek_b.fitness_reservation.core.data.Trainer;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class TrainerDaoImpl extends Dao<Trainer, Long> implements TrainerDao {

    @Override
    public List<Trainer> findAll() {
        return em.createNamedQuery("Trainer.findAll", Trainer.class).getResultList();
    }
    
}
