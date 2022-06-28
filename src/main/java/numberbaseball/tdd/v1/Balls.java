package numberbaseball.tdd.v1;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    List<Ball> balls = new ArrayList<>();

    public Balls(List<Integer> numbers) {
        this.balls = createBalls(numbers);
    }

    private List<Ball> createBalls(List<Integer> numbers){
        List<Ball> newBalls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            newBalls.add(new Ball(numbers.get(i), i));
        }
        return newBalls;
    }

    public GameResult play(Balls userBalls){
        GameResult result = new GameResult();
        for (int i = 0; i < 3; i++) {
            BallStatus play = userBalls.play(balls.get(i));
            result.makeResult(play);
        }
        return result;
    }

    public BallStatus play(Ball userBall) {
        return  balls.stream()
                .map(ball -> ball.play(userBall))
                .filter(status -> status != BallStatus.OUT)
                .findFirst()
                .orElse(BallStatus.OUT);
    }
}
