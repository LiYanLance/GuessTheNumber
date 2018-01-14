public class Guess {

    public void guessNumber(String input){
        AnswerGenerator answerGenerator = new AnswerGenerator();
        String answer = answerGenerator.generateFourDigitsWithNonRepetitve();
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare(answer, input);
        System.out.print(result);
    }
}
