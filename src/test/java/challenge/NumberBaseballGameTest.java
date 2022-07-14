package challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class NumberBaseballGameTest {

    @Test
    void create() {
        //given
        Balls balls = new Balls(Arrays.asList(1, 2, 3));

        //when
        NumberBaseballGame game = new NumberBaseballGame(){
            @Override
            public List<Integer> getRandomList() {
                return Arrays.asList(1, 2, 3);
            }
        };
        Balls answer = game.getAnswer();

        //then
        assertThat(answer.play(balls.getBalls().get(0))).isEqualTo(BallStatus.STRIKE);
        assertThat(answer.play(balls.getBalls().get(1))).isEqualTo(BallStatus.STRIKE);
        assertThat(answer.play(balls.getBalls().get(2))).isEqualTo(BallStatus.STRIKE);


    }
}
