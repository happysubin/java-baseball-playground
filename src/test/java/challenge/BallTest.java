package challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BallTest {

//    @Test
//    void createBall() {
//        Ball ball = new Ball(1, 3);
//        Assertions.assertThat(ball.getPosition()).isEqualTo(3);
//        Assertions.assertThat(ball.getValue()).isEqualTo(1);
//    }

    @Test
    void strikeTest() {
        Ball ball = new Ball(1, 3);
        Ball ball2 = new Ball(1, 3);
        Assertions.assertThat(ball.play(ball2)).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ballTest() {
        Ball ball = new Ball(1, 2);
        Ball ball2 = new Ball(1, 3);
        Assertions.assertThat(ball.play(ball2)).isEqualTo(BallStatus.BALL);
    }

    @Test
    void outTest() {
        Ball ball = new Ball(2, 2);
        Ball ball2 = new Ball(1, 3);
        Assertions.assertThat(ball.play(ball2)).isEqualTo(BallStatus.OUT);
    }
}
