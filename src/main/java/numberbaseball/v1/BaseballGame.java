package numberbaseball.v1;

import java.util.ArrayList;

public class BaseballGame {

    private Player player;
    private Computer computer;

    public BaseballGame(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
    }

    public void start() {
        ArrayList<Integer> answer = computer.generateAnswer();

        for (Integer integer : answer) {
            System.out.println("integer = " + integer);
        }

        Hint hint;

        do{
            ArrayList<Integer> attemptedAnswer = player.createAttemptedAnswer();
            hint = computer.comparedWithAnswer(attemptedAnswer, answer);

        } while (computer.isNotAnswer(hint));

        System.out.println(hint.getMessage());

        int decision = player.choiceGamerReStartOrStop();

        if(decision == 1){
            finishGame();
        }
        else if(decision == 2){
            restartGame();
        }

        throw new RuntimeException("1과 2중에서 입력하세요.");
    }

    public void restartGame(){
        start();
    }

    public void finishGame(){
        System.out.println("게임을 종료합니다");
    }
}
