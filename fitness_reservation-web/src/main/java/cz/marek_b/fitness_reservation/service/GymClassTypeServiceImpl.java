package cz.marek_b.fitness_reservation.service;

import cz.marek_b.fitness_reservation.core.dao.GymClassTypeDao;
import cz.marek_b.fitness_reservation.core.data.GymClassType;
import cz.marek_b.fitness_reservation.web.form.bean.ClassTypeFormBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GymClassTypeServiceImpl implements GymClassTypeService {

    @Autowired
    private GymClassTypeDao gymClassTypeDao;
    
    @Override
    @Transactional
    public void addGymClassType(ClassTypeFormBean formBean) {
        GymClassType gymClassType = new GymClassType();
        gymClassType.setClassName(formBean.getName());
        gymClassType.setClassColor(formBean.getColor());
        
        gymClassTypeDao.create(gymClassType);
    }

    @Override
    public List<GymClassType> findAll() {
        return gymClassTypeDao.findAll();
    }
    
}
