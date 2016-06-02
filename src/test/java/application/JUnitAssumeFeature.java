package application;

import com.riz.log.RizSlf4JLogging;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

public class JUnitAssumeFeature {

    private RizSlf4JLogging rizSlf4JLogging;

    @Before
    public void setUp() throws Exception {
        rizSlf4JLogging = new RizSlf4JLogging();
        Assume.assumeTrue(false);
    }

    @Test
    public void testPrintPersonWithSlf4J() throws Exception {
        rizSlf4JLogging.printPersonWithSlf4J();
        throw new NullPointerException("null exception");
    }

    @Test
    public void testDoNotRun() throws Exception {
        rizSlf4JLogging.printPersonWithSlf4J();
        fail();
    }
}