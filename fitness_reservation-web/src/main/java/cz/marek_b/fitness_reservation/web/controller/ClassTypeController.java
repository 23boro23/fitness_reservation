package cz.marek_b.fitness_reservation.web.controller;

import cz.marek_b.fitness_reservation.service.GymClassTypeService;
import cz.marek_b.fitness_reservation.web.form.bean.ClassTypeFormBean;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin/classType")
public class ClassTypeController {
    
    @Autowired
    private GymClassTypeService gymClassTypeService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String page(Model model) {
        model.addAttribute("classTypeFormBean", new ClassTypeFormBean());
        
        return "admin/create_class_type";
    }
    
    //TODO validation
    @RequestMapping(method = RequestMethod.POST)
    public String save(Model model, @Valid ClassTypeFormBean formBean, BindingResult result) {
        gymClassTypeService.addGymClassType(formBean);
        
        return "admin/create_class_type";
    }
    
}
