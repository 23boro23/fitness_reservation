package cz.marek_b.fitness_reservation.service;

import java.util.Date;
import java.util.List;

public interface TimetableService {
    
    public List<String> getWeek(Date start);
    
}
