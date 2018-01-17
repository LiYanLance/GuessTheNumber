public class Guess {

    public String guessNumber(String input){
        AnswerGenerator answerGenerator = new AnswerGenerator();
        String answer = answerGenerator.generateFourDigitsWithNonRepetitve();
        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare(answer, input);
        return result;
    }

}
