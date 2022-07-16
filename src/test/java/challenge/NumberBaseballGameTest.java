package challenge;

import org.junit.jupiter.api.DisplayName;
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
            public Balls makeAnswer() {
                return new Balls(Arrays.asList(1, 2, 3));
            }
        };
        Balls answer = game.getAnswer();

        //then
        assertThat(answer.play(balls.getBalls().get(0))).isEqualTo(BallStatus.STRIKE);
        assertThat(answer.play(balls.getBalls().get(1))).isEqualTo(BallStatus.STRIKE);
        assertThat(answer.play(balls.getBalls().get(2))).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    @DisplayName("3자리 숫자로 생성되는지 테스트")
    void sizeTest() {
        //given

        //when
        NumberBaseballGame game = new NumberBaseballGame();

        //then
        Balls answer = game.getAnswer();
        assertThat(answer.getBalls().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("숫자야구 정답 테스트")
    void answerSuccessTest() {
        //given
        NumberBaseballGame game = new NumberBaseballGame(){
            @Override
            public Balls makeAnswer() {
                return new Balls(Arrays.asList(1, 2, 3));
            }
        };

        //when
        Balls attemptedAnswer = new Balls(Arrays.asList(1, 2, 3));

        //then
        String result = game.playBaseBall(game.getAnswer(), attemptedAnswer);
        assertThat(result).isEqualTo("Answer");
    }

    @Test
    @DisplayName("숫자야구 OUT 테스트")
    void OutSuccessTest() {
        //given
        NumberBaseballGame game = new NumberBaseballGame(){
            @Override
            public Balls makeAnswer() {
                return new Balls(Arrays.asList(4, 5, 7));
            }
        };

        //when
        Balls attemptedAnswer = new Balls(Arrays.asList(1, 2, 3));

        //then
        String result = game.playBaseBall(game.getAnswer(), attemptedAnswer);
        assertThat(result).isEqualTo("Out");
    }

    @Test
    @DisplayName("숫자야구 Strike, ball 테스트")
    void StrikeAndBallSuccessTest() {
        //given
        NumberBaseballGame game = new NumberBaseballGame(){
            @Override
            public Balls makeAnswer() {
                return new Balls(Arrays.asList(1, 2, 4));
            }
        };

        //when
        Balls attemptedAnswer = new Balls(Arrays.asList(1, 2, 3));

        //then
        String result = game.playBaseBall(game.getAnswer(), attemptedAnswer);
        assertThat(result).isEqualTo("2 Strike 0 Ball");
    }
}
