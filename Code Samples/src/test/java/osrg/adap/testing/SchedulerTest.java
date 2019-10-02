package osrg.adap.testing;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class SchedulerTest {

    @Test
    public void calculateExecutionDateFromFutureDate() {
        Date futureDate = new Date(new Date().getTime() + 60000);

        Scheduler scheduler = new Scheduler();
        Date calculatedDate = scheduler.calculateExecutionDate(futureDate, 1000L);

        assertEquals(futureDate, calculatedDate);
    }

    @Test
    public void calculateExecutionDateFromPastDate() {
        Date pastDate = new Date(new Date().getTime() - 1000);

        Scheduler scheduler = new Scheduler();
        Date calculatedDate = scheduler.calculateExecutionDate(pastDate, 60000L);

        assertEquals(pastDate.getTime() + 60000, calculatedDate.getTime());
    }

}