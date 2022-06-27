package numberbaseball.tdd.v1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallTest {

    @Test
    @DisplayName("스트라이크인지 테스트")
    void strikeTest(){
        Ball ball = new Ball(1, 2);
        BallStatus status = ball.play();


    }
}
