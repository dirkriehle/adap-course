package osrg.adap.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SimpleSetupTearDown {

    private Scheduler schedulerUnderTest;

    @Before
    public void setupScheduler() {
        schedulerUnderTest = new Scheduler();
        schedulerUnderTest.setMode("BEST_EFFORT");
        schedulerUnderTest.start();
    }

    @After
    public void teardownScheduler() {
        schedulerUnderTest.stop();
    }

    @Test
    public void testSchedulerDryrun() {
        // for demonstation purposes
    }
}
