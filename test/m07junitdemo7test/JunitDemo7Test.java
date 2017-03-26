package m07junitdemo7test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import java.io.File;
import java.io.IOException;
import static org.junit.Assert.assertTrue;

/**
 * @author manuel y angel
 */

public class JunitDemo7Test {
    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testRule() throws IOException {
        File newFolder = tempFolder.newFolder("CarpetaTemporal");
        assertTrue(newFolder.exists());
    }
}
