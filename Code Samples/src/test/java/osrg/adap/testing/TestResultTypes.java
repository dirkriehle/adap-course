package osrg.adap.testing;

import org.junit.Test;
import static org.junit.Assert.fail;

public class TestResultTypes {

    @Test
    public void succeedingTest() {
        return;
    }

    @Test
    public void failingTest() {
        fail();
    }

    @Test
    public void executionError() {
        throw new IllegalStateException();
    }
}
