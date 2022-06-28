package numberbaseball.tdd.v1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class BallsTest {

    @Test
    @DisplayName("스트라이크와 볼을 테스트")
    void strikeAndBallTest(){
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 2, 1);
        Balls balls = new Balls(list1);
        Balls answer = new Balls(list2);

        GameResult result = answer.play(balls);
        assertThat(result.ballCount).isEqualTo(2);
        assertThat(result.strikeCount).isEqualTo(1);
    }
}
