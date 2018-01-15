import java.util.Scanner;

public class Client {

    public static void main(String[] args){
        AnswerGenerator answerGenerator = new AnswerGenerator();
        String answer = answerGenerator.generateFourDigitsWithNonRepetitve();
        CompareNumber compareNumber = new CompareNumber();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println();
        int countDown = 6;
        while (countDown > 0){
            System.out.println("Please input your number(" + countDown + "):");
            String input = scanner.nextLine();
            if(IsRepeated(input)){
                System.out.println("Cannot input duplicate numbers!");
                continue;
            }
            String result = compareNumber.compare(answer, input);
            if("4A0B".equals(result)){
                System.out.println("Congratulations!");
                return;
            }else {
                System.out.println(result);
            }
            countDown--;
        }
        System.out.println("Game Over");
    }

    private static boolean IsRepeated(String input) {
        boolean result = false;
        for (int i = 0; i < input.length() - 1; i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if(input.charAt(i) == input.charAt(j)){
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
