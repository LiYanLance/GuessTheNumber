public class CompareNumber {

    public String compare(String answer, String input){
        String result = "";
        int rightPosition = 0, rightNumber = 0;
        for (int i = 0; i < answer.length(); i++) {
            if(input.charAt(i) == answer.charAt(i)){
                rightPosition++;
            }else{
                for (int j = 0; j < answer.length(); j++) {
                    if(input.charAt(i) == answer.charAt(j)){
                        rightNumber++;
                        break;
                    }
                }
            }
        }
        return rightPosition + "A" + rightNumber + "B";
    }

}
