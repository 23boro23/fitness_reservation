package cz.marek_b.fitness_reservation.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/welcome")
public class WelcomeController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String welcomePage() {
        return "welcome";
    }
    
}
