package cz.marek_b.fitness_reservation.web.controller;

import cz.marek_b.fitness_reservation.service.GymClassService;
import cz.marek_b.fitness_reservation.service.GymService;
import cz.marek_b.fitness_reservation.service.TrainerService;
import cz.marek_b.fitness_reservation.web.form.bean.GymClassFormBean;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin/gymClass")
public class GymClassController {
    
    @Autowired
    private GymClassService gymClassService;
    @Autowired
    private TrainerService trainerService;
    @Autowired
    private GymService gymService;
 
    @RequestMapping(method = RequestMethod.GET)
    public String gymClassPage(Model model) {
        model.addAttribute("gymClassFormBean", new GymClassFormBean());
        model.addAttribute("trainers", trainerService.findAllTrainers());
        model.addAttribute("gyms", gymService.findAll());
        
        return "admin/create_class";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String gymClassSubmit(Model model, @ModelAttribute GymClassFormBean formBean, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("gymClassFormBean", formBean);
                  
            return "admin/create_class";
        }
        
        try {
            gymClassService.saveGymClass(formBean);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return "admin/create_class";
    }
    
}
