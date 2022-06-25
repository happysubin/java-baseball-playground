package numberbaseball.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

    public ArrayList<Integer> generateAnswer() {
        ArrayList<Integer> answer = new ArrayList<>(3);
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; answer.size() < 3; i++) {
            addAnswer(numbers, answer, i);
        }
        return answer;
    }

    private void addAnswer(int[] numbers, List<Integer> answer,int num){
        Random random = new Random();
        int temp = random.nextInt(numbers.length);
        if(numbers[temp] != -1){
            answer.add(numbers[temp]);
            numbers[temp] = -1;
        }
    }

    public Hint comparedWithAnswer(ArrayList<Integer> attemptedAnswer, ArrayList<Integer> answer){
        int strikeCount = 0;
        int ballCount = 0;

        for(int i = 0; i < 3; i++) {
            strikeCount = makeStrikeCount(attemptedAnswer, answer, strikeCount, i);
            ballCount = makeBallCount(attemptedAnswer, answer, ballCount, i);
        }

        Hint hint = Hint.createHint(strikeCount, ballCount);
        return hint;
    }

    private int makeStrikeCount(ArrayList<Integer> attemptedAnswer, ArrayList<Integer> answer, int strikeCount, int num) {
        if(attemptedAnswer.get(num) == answer.get(num)){
            strikeCount++;
        }
        return strikeCount;
    }

    private int makeBallCount(ArrayList<Integer> attemptedAnswer, ArrayList<Integer> answer, int ballCount, int num) {
        if(answer.contains(attemptedAnswer.get(num)) & answer.get(num) != attemptedAnswer.get(num)){
            ballCount++;
        }
        return ballCount;
    }

    public boolean isNotAnswer(Hint hint){
        if(hint.getMessage().equals("ANSWER")) return false;
        System.out.println(hint.getMessage());
        return true;
    }
}
