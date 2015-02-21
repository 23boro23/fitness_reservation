package cz.marek_b.fitness_reservation.core.dao;

public interface GenericDao<E, PK> {
    
    E create(E e);
    E update(E e);
    void delete(E e);
    E findById(PK pk);
    
}
