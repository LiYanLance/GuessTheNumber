import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnswerGeneratorTest {

    @Test
    public void shouldReturn4WhenGetLengthOfAnswer(){
        AnswerGenerator answerGenerator = new AnswerGenerator();
        String answer = answerGenerator.generateFourDigitsWithNonRepetitve();
        assertThat(answer.length(),is(4));
    }

    @Test
    public void shouldReturnTrueWhenAnswerContainsFourDigits(){
        AnswerGenerator answerGenerator = new AnswerGenerator();
        String answer = answerGenerator.generateFourDigitsWithNonRepetitve();
        assertThat(answer.matches("\\d{4}"),is(true));
    }

    @Test
    public void shouldReturnFalseWhenNoRepetitionInAnswer(){
        AnswerGenerator answerGenerator = new AnswerGenerator();
        String answer = answerGenerator.generateFourDigitsWithNonRepetitve();
        boolean result = false;
        for (int i = 0; i < answer.length() - 1; i++) {
            for (int j = i + 1; j < answer.length(); j++) {
                if(answer.charAt(i) == answer.charAt(j)){
                    result = true;
                    break;
                }
            }
        }
        assertThat(result,is(false));
    }
}
