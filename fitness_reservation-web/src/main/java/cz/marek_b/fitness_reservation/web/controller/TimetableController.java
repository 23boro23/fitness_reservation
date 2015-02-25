package cz.marek_b.fitness_reservation.web.controller;

import cz.marek_b.fitness_reservation.service.GymClassService;
import cz.marek_b.fitness_reservation.service.TimetableService;
import java.util.Date;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/timetable")
public class TimetableController {
    
    @Autowired
    private TimetableService timetableService;
    @Autowired
    private GymClassService gymClassService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String page(Model model) {
        model.addAttribute("times", timetableService.getTimes(6, 22));
        model.addAttribute("dates", timetableService.getWeek(new Date()));
        Map c = gymClassService.findAll(new Date());
        model.addAttribute("classes", gymClassService.findAll(new Date()));
        
        return "timetable";
    }
    
}
