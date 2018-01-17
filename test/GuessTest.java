import junit.extensions.RepeatedTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isOneOf;

public class GuessTest extends TestCase{

    public GuessTest(String name) {
        super(name);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new RepeatedTest(new GuessTest("whenGuessResultIsOneOfArrayElements_thenCorrect"), 10000));
        return suite;
    }

    public void whenGuessResultIsOneOfArrayElements_thenCorrect(){
        Guess guess = new Guess();
        String result = guess.guessNumber("1234");
        String[] allResults = { "4A0B", "3A0B", "2A2B", "2A1B", "2A0B",
                "1A3B", "1A2B", "1A1B", "1A0B", "0A0B", "0A4B", "0A3B", "0A2B", "0A1B"};
        assertThat(result, isOneOf(allResults));
    }


}
