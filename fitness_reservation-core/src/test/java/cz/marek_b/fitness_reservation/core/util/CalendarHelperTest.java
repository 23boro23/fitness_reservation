package cz.marek_b.fitness_reservation.core.util;

import java.util.Calendar;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalendarHelperTest {

    private final Date expected;
    private final Date actualDate;
    private Calendar calendar;
    
    public CalendarHelperTest(Date expected, Date actualDate) {
        this.expected = expected;
        this.actualDate = actualDate;        
    }
    
    @Before
    public void init() {
        calendar = Calendar.getInstance();
    }
    
    //TODO parameters
    
    //TODO test
    @Test
    public void findNearestPrevMondayTest() {
        
    }

}
