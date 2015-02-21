package cz.marek_b.fitness_reservation.core.dao.impl;

import cz.marek_b.fitness_reservation.core.dao.Dao;
import cz.marek_b.fitness_reservation.core.dao.SettingsDao;
import cz.marek_b.fitness_reservation.core.data.Settings;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class SettingsDaoImpl extends Dao<Settings, Long> implements SettingsDao {

    @Override
    public Settings findByKey(String key) {
        return em.createNamedQuery("Settings.findByKey", Settings.class).getSingleResult();
    }
    
    @Override
    public List<Settings> findAll() {
        return em.createNamedQuery("Settings.findAll", Settings.class).getResultList();
    }
    
}
