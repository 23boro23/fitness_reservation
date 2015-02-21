package cz.marek_b.fitness_reservation.core.dao;

import cz.marek_b.fitness_reservation.core.aspect.Loggable;
import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class Dao<E, PK> implements GenericDao<E, PK>  {

    @PersistenceContext(unitName = "fitness-reservation-pu")
    protected EntityManager em;
    
    protected Class<E> entityClass;
    
    public Dao() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<E>) genericSuperclass.getActualTypeArguments()[1];        
    }
    
    @Override
    @Loggable(message = "Saving object to database")
    public E create(E e) {
        em.persist(e);
        
        return e;
    }

    @Override
    public E update(E e) {
        em.merge(e);
        em.flush();
        
        return e;
    }

    @Override
    public void delete(E e) {
        em.remove(e);
        em.flush();
    }

    @Override
    public E findById(PK pk) {        
       return em.find(entityClass, pk);
    }
    
}
