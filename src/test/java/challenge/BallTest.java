package challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BallTest {

    @Test
    void createBall() {
        Ball ball = new Ball(1, 3);
        Assertions.assertThat(ball.getPosition()).isEqualTo(3);
        Assertions.assertThat(ball.getValue()).isEqualTo(1);
    }
}
