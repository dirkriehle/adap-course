package osrg.adap.testing;


import java.util.Date;

public class Scheduler {

    /***
     * ...... a lof of other Scheduler attributes and methods
     ***/

    public Date calculateExecutionDate(Date givenExecutionDate, long interval) {
        Date now = new Date();

        if (givenExecutionDate.after(now)) {
            return givenExecutionDate;
        }

        long offset = (now.getTime() - givenExecutionDate.getTime()) % interval;
        return new Date(now.getTime() + interval - offset);
    }
}