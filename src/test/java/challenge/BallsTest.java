package challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class BallsTest {

    @Test
    void create() {
        Balls balls = new Balls(Arrays.asList(1,2,3));
        List<Ball> list = balls.getBalls();

        assertThat(list.get(0).makeBallStatus(new Ball(1,0))).isEqualTo(BallStatus.STRIKE);
        assertThat(list.get(1).makeBallStatus(new Ball(2,1))).isEqualTo(BallStatus.STRIKE);
        assertThat(list.get(2).makeBallStatus(new Ball(3,2))).isEqualTo(BallStatus.STRIKE);
    }
}
