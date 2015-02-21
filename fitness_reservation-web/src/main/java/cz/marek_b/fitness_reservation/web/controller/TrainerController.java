package cz.marek_b.fitness_reservation.web.controller;

import cz.marek_b.fitness_reservation.service.TrainerService;
import cz.marek_b.fitness_reservation.web.form.bean.TrainerFormBean;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin/trainer")
public class TrainerController {
    
    @Autowired
    private TrainerService trainerService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String page(Model model) {
        model.addAttribute("trainerFormBean", new TrainerFormBean());
        
        return "admin/create_trainer";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String save(Model model, @Valid TrainerFormBean formBean, BindingResult result) {
        if (result.hasErrors()) {
            return "";
        }
        
        trainerService.addTrainer(formBean);
        
        return "redirect:trainer";
    }
    
}
