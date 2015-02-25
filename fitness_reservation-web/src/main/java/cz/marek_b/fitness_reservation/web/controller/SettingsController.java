package cz.marek_b.fitness_reservation.web.controller;

import cz.marek_b.fitness_reservation.web.form.bean.SettingsFormBean;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin/openingHrs")
public class SettingsController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String page() {
        return "admin/settings";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String save(Model model, @Valid SettingsFormBean formBean, BindingResult result) {
        
        
        return "redirect:openingHrs";
    }
    
}
