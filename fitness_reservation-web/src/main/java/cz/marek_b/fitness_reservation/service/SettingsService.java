package cz.marek_b.fitness_reservation.service;

import cz.marek_b.fitness_reservation.core.data.Settings;
import cz.marek_b.fitness_reservation.web.form.bean.SettingsFormBean;
import java.util.List;

public interface SettingsService {
    
    List<Settings> findAll();
    void save(SettingsFormBean formBean);
    
}
