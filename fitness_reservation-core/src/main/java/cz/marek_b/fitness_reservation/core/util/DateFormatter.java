package cz.marek_b.fitness_reservation.core.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateFormatter {

    private static SimpleDateFormat sdf;
    
    private DateFormatter() {}
    
    public static Date getDateTime(String dateTimeStr) throws ParseException {
        sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");        
        return sdf.parse(dateTimeStr);
    }
    
}
