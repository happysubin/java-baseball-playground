package numberbaseball.tdd.v1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallTest {

    @Test
    @DisplayName("스트라이크인지 테스트")
    void strikeTest(){
        Ball ball = new Ball(1, 2);
        Ball answer = new Ball(1,2);
        BallStatus status = ball.play(answer);

        //스트라이크인지 검증
        Assertions.assertThat(status).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    @DisplayName("볼인지 테스트")
    void ballTest(){
        Ball ball = new Ball(1, 2);
        Ball answer = new Ball(1,3);
        BallStatus status = ball.play(answer);

        //스트라이크인지 검증
        Assertions.assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    @DisplayName("야웃인지 테스트")
    void outTest(){
        Ball ball = new Ball(3, 3);
        Ball answer = new Ball(1,3);
        BallStatus status = ball.play(answer);

        //스트라이크인지 검증
        Assertions.assertThat(status).isEqualTo(BallStatus.OUT);
    }
}
