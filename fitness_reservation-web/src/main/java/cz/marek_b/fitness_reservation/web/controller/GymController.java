package cz.marek_b.fitness_reservation.web.controller;

import cz.marek_b.fitness_reservation.service.GymService;
import cz.marek_b.fitness_reservation.web.form.bean.GymFormBean;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin/gym")
public class GymController {
    
    @Autowired
    private GymService gymService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String page(Model model) {
        model.addAttribute("gyms", gymService.findAll());
        model.addAttribute("gymFormBean", new GymFormBean());
        
        return "admin/create_gym";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String save(Model model, @Valid GymFormBean formBean, BindingResult result) {
        gymService.save(formBean);
        
        return "redirect:gym";
    }
    
}
