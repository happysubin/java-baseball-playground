package challenge;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    List<Ball> balls;

    public Balls(List<Integer> numbers) {
        this.balls = makeBalls(numbers);
    }

    private List<Ball> makeBalls(List<Integer> numbers) {
        List<Ball> result = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            result.add(new Ball(numbers.get(i), i));
        }

        return result;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public BallStatus play(Ball attemptBall) {
        return balls.stream()
                .map(ball -> ball.play(attemptBall))
                .filter(ballStatus -> ballStatus != BallStatus.OUT)
                .findFirst()
                .orElse(BallStatus.OUT);

    }
}
