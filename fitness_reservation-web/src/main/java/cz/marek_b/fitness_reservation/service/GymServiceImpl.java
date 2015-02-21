package cz.marek_b.fitness_reservation.service;

import cz.marek_b.fitness_reservation.core.dao.GymDao;
import cz.marek_b.fitness_reservation.core.data.Gym;
import cz.marek_b.fitness_reservation.web.form.bean.GymFormBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GymServiceImpl implements GymService {

    @Autowired
    private GymDao gymDao;
    
    @Override
    @Transactional
    public void save(GymFormBean formBean) {
        Gym gym = new Gym();
        gym.setName(formBean.getName());
        gym.setCapacity(formBean.getCapacity());
                
        gymDao.create(gym);
    }

    @Override
    public List<Gym> findAll() {
        return gymDao.findAll();
    }
    
}
