package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberBaseballGame {

    private Balls answer;

    public NumberBaseballGame() {
        this.answer = makeAnswer();
    }

    public Balls makeAnswer() {
        List<Integer> answer = new ArrayList<>(3);
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; answer.size() < 3; i++) {
            addAnswer(numbers, answer);
        }
        return new Balls(answer);
    }

    private void addAnswer(int[] numbers, List<Integer> answer){
        Random random = new Random();
        int temp = random.nextInt(numbers.length);
        if(numbers[temp] != -1){
            answer.add(numbers[temp]);
            numbers[temp] = -1;
        }
    }

    public void playGame(){
        String result = "";
        do{
            Balls attemptedAnswer = new Balls(InputView.getBalls());
            result = playBaseBall(answer, attemptedAnswer);
            System.out.println(result);
        } while(!result.equals("Answer"));

        System.out.println("정답. 게임을 종료합니다.");
    }

    public String playBaseBall(Balls answer, Balls attemptedAnswer){
        GameResult result = new GameResult();
        for (int i = 0; i < 3; i++) {
            BallStatus status = answer.play(attemptedAnswer.getBalls().get(i));
            result.makeResult(status);
        }
        return result.getResult();
    }

    public Balls getAnswer() {
        return answer;
    }
}
