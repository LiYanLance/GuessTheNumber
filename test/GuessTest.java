import org.junit.Test;

public class GuessTest {

    @Test
    public void guessNumberTest(){
        Guess guess = new Guess();
        guess.guessNumber("1234");
    }
}
