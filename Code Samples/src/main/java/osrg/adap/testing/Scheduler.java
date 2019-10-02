package osrg.adap.testing;


import java.util.Date;

public class Scheduler {

    public void setMode(String mode) {
        // just for demonstration purposes
    }

    public void start() {
        // just for demonstration purposes
    }

    public void stop() {
        // just for demonstration purposes
    }


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