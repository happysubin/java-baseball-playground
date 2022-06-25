package numberbaseball.v1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HintTest {

    @Test
    void firstRightHintTest(){
        //given
        Hint hint = Hint.createHint(1, 2);

        //when
        String message = hint.getMessage();

        //
        Assertions.assertThat(message).isEqualTo("1 strike 2 ball");
    }

    @Test
    void secondRightHintTest(){
        //given
        Hint hint = Hint.createHint(3, 0);

        //when
        String message = hint.getMessage();

        //
        Assertions.assertThat(message).isEqualTo("ANSWER");
    }

    @Test
    void thirdRightHintTest(){
        //given
        Hint hint = Hint.createHint(0, 0);

        //when
        String message = hint.getMessage();

        //
        Assertions.assertThat(message).isEqualTo("OUT");
    }
}