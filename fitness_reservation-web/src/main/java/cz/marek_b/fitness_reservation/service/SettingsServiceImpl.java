package cz.marek_b.fitness_reservation.service;

import cz.marek_b.fitness_reservation.core.dao.SettingsDao;
import cz.marek_b.fitness_reservation.core.data.Settings;
import cz.marek_b.fitness_reservation.web.form.bean.SettingsFormBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SettingsServiceImpl implements SettingsService {

    @Autowired
    private SettingsDao settingsDao;
    
    @Override
    public List<Settings> findAll() {
        return settingsDao.findAll();
    }

    @Override
    public void save(SettingsFormBean formBean) {
        Settings settings = new Settings();
        settings.setKey("");
    }
    
}
