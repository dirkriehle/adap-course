package osrg.adap.testing;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import java.io.File;
import java.io.IOException;
import static org.junit.Assert.assertTrue;

public class TmpDirTest {

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void testTmpFolder() throws IOException {
        File file = folder.newFile("testfile.txt");
        assertTrue(file.exists());
    }
}
