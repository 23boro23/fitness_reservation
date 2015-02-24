package cz.marek_b.fitness_reservation.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class TimetableServiceImpl implements TimetableService {

    private Calendar calendar;
    private SimpleDateFormat sdf;
    
    @PostConstruct
    public void init() {
        calendar = Calendar.getInstance();
        sdf = new SimpleDateFormat("dd.MM.yyyy");
    }
    
    @Override
    public List<String> getWeek(Date start) {
        List<String> ret = new ArrayList<>(7);
        ret.add(sdf.format(start));
        
        calendar.setTime(start);
        
        for (int i=1; i<7; i++) {
            calendar.add(Calendar.DATE, 1);
            ret.add(sdf.format(calendar.getTime()));
        }
        
        return ret;
    }

    @Override
    //TODO refactor
    public List<String> getTimes(int start, int end) {
        List<String> ret = new ArrayList<>((end - start) * 4);
        
        for (int i=start; i<=end; i++) {
            ret.add((i < 10 ? ("0" + i) : i) + ":00");
            ret.add((i < 10 ? ("0" + i) : i) + ":15");
            ret.add((i < 10 ? ("0" + i) : i) + ":30");
            ret.add((i < 10 ? ("0" + i) : i) + ":45");
        }
        
        return ret;
    }
    
}
