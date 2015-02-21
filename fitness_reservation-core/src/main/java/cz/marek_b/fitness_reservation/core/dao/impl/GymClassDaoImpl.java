package cz.marek_b.fitness_reservation.core.dao.impl;

import cz.marek_b.fitness_reservation.core.dao.Dao;
import cz.marek_b.fitness_reservation.core.dao.GymClassDao;
import cz.marek_b.fitness_reservation.core.data.GymClass;
import java.util.Date;
import java.util.List;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

@Repository
public class GymClassDaoImpl extends Dao<GymClass, Long> implements GymClassDao {

    @Override
    public List<GymClass> findAll(Date start, Date end) {
        TypedQuery<GymClass> query = em.createNamedQuery("GymClass.findAll", GymClass.class);
        query.setParameter(1, start);
        query.setParameter(2, end);
        
        return query.getResultList();
    }
    
}
