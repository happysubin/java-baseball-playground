package challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class BallsTest {

    @Test
    void create() {
        Balls balls = new Balls(Arrays.asList(1,2,3));
        List<Ball> list = balls.getBalls();

        assertThat(list.get(0).play(new Ball(1,0))).isEqualTo(BallStatus.STRIKE);
        assertThat(list.get(1).play(new Ball(2,1))).isEqualTo(BallStatus.STRIKE);
        assertThat(list.get(2).play(new Ball(3,2))).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    @DisplayName("Balls Status 판정")
    void makeBallsStatus(){
        Balls answer = new Balls(Arrays.asList(1,2,3));
        Ball ball = new Ball(1, 0);
        Ball ball2 = new Ball(2, 2);
        Ball ball3 = new Ball(4, 2);

        BallStatus play = answer.play(ball);
        BallStatus play2 = answer.play(ball2);
        BallStatus play3 = answer.play(ball3);

        assertThat(play).isEqualTo(BallStatus.STRIKE);
        assertThat(play2).isEqualTo(BallStatus.BALL);
        assertThat(play3).isEqualTo(BallStatus.OUT);

    }
}
