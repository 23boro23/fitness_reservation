package cz.marek_b.fitness_reservation.service;

import cz.marek_b.fitness_reservation.core.dao.GymClassTypeDao;
import cz.marek_b.fitness_reservation.core.data.GymClassType;
import cz.marek_b.fitness_reservation.web.form.bean.GymClassTypeFormBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GymClassTypeServiceImpl implements GymClassTypeService {

    @Autowired
    private GymClassTypeDao gymClassTypeDao;
    
    @Override
    public void addGymClassType(GymClassTypeFormBean formBean) {
        GymClassType gymClassType = new GymClassType();
        gymClassType.setClassName(formBean.getName());
        
        gymClassTypeDao.create(gymClassType);
    }

    @Override
    public List<GymClassType> findAll() {
        return gymClassTypeDao.findAll();
    }
    
}
