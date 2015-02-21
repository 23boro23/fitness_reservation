package cz.marek_b.fitness_reservation.core.dao;

import cz.marek_b.fitness_reservation.core.data.Settings;
import java.util.List;

public interface SettingsDao extends GenericDao<Settings, Long> {
    
    Settings findByKey(String key);
    List<Settings> findAll();
    
}
