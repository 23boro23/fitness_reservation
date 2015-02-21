package cz.marek_b.fitness_reservation.service;

import cz.marek_b.fitness_reservation.core.dao.TrainerDao;
import cz.marek_b.fitness_reservation.core.data.Contact;
import cz.marek_b.fitness_reservation.core.data.Trainer;
import cz.marek_b.fitness_reservation.web.form.bean.TrainerFormBean;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TrainerServiceImpl implements TrainerService {

    @Autowired
    private TrainerDao trainerDao;
    
    @Override
    public List<Trainer> findAllTrainers() {
        return trainerDao.findAll();
    }

    @Override
    @Transactional
    public void addTrainer(TrainerFormBean trainerFormBean) {
        Contact contact = new Contact();
        contact.setEmail(trainerFormBean.getContactFormBean().getEmail());
        contact.setPhoneNo(trainerFormBean.getContactFormBean().getPhoneNo());
        
        Trainer trainer = new Trainer();
        trainer.setName(trainerFormBean.getFullName());
        trainer.setContact(contact);
        
        trainerDao.create(trainer);
    }

    @Override
    @Transactional
    public void removeTrainer(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
