package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberBaseballGame {

    private Balls answer;

    public NumberBaseballGame() {
        this.answer = makeAnswer();
    }


    private Balls makeAnswer() {
        return new Balls(getRandomList());
    }

    public List<Integer> getRandomList() {
        List<Integer> answer = new ArrayList<>(3);
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; answer.size() < 3; i++) {
            addAnswer(numbers, answer);
        }
        return answer;
    }

    private void addAnswer(int[] numbers, List<Integer> answer){
        Random random = new Random();
        int temp = random.nextInt(numbers.length);
        if(numbers[temp] != -1){
            answer.add(numbers[temp]);
            numbers[temp] = -1;
        }
    }


    public Balls getAnswer() {
        return answer;
    }
}
