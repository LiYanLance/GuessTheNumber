import java.util.Random;

public class AnswerGenerator {

    public String generateFourDigitsWithNonRepetitve(){
        StringBuilder stringBuilder = new StringBuilder();
        boolean[] hasBeenUsed = new boolean[10];
        Random random = new Random();
        while(stringBuilder.length() < 4){
            int digit = random.nextInt(10);
            if(!hasBeenUsed[digit]){
                stringBuilder.append(digit);
                hasBeenUsed[digit] = true;
            }
        }
        return stringBuilder.toString();
    }
}
