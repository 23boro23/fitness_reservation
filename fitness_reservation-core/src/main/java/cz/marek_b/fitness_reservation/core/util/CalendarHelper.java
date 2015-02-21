package cz.marek_b.fitness_reservation.core.util;

import java.util.Calendar;
import java.util.Date;

public final class CalendarHelper {

    private static Calendar calendar;
    
    private CalendarHelper() {
        calendar = Calendar.getInstance();
    }
    
    public static Date findNearestPrevMonday(Date actual) {
        calendar.setTime(actual);
        
        while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
            calendar.add(Calendar.DATE, -1);
        }        
        
        return calendar.getTime();
    }
    
}
