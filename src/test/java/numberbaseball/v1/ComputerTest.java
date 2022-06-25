package numberbaseball.v1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

class ComputerTest {

    @Test
    @DisplayName("랜덤한 숫자 3개를 잘 생성하는지 테스트")
    void generateAnswerSizeTest(){
        //given
        Computer computer = new Computer();

        //when
        ArrayList<Integer> answer = computer.generateAnswer();

        //then
        assertThat(answer.size()).isEqualTo(3);

        for (Integer num : answer) {
            System.out.println("num = " + num);
        }
    }

    @Test
    @DisplayName("랜덤한 숫자를 겹치지 않게 잘 생성하는지 테스트")
    void generateRightAnswerTest(){
        //given
        Computer computer = new Computer();

        //when
        ArrayList<Integer> answer = computer.generateAnswer();

        //then
        int num1 = answer.get(0);
        int num2 = answer.get(1);
        int num3 = answer.get(2);

        assertThat(num1).isNotEqualTo(num2);
        assertThat(num2).isNotEqualTo(num3);
        assertThat(num3).isNotEqualTo(num1);
    }

    @Test
    @DisplayName("답을 시도한 것과 답이 맞는지 검증")
    void comparedWithAnswer(){
        ArrayList<Integer> attemptedAnswer = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
    }

    //엄연히 말하면 통합 테스트..
    @Test
    @DisplayName("답을 시도한 것과 답이 맞는지 검증")
    void comparedWithAnswerTest() {
        ArrayList<Integer> attemptedAnswer = new ArrayList<>();
        attemptedAnswer.add(1);
        attemptedAnswer.add(2);
        attemptedAnswer.add(3);

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(3);
        answer.add(2);
        answer.add(1);
        

        Computer computer = new Computer();

        //when
        Hint hint = computer.comparedWithAnswer(attemptedAnswer, answer);

        //then
        assertThat(hint.getMessage()).isEqualTo("1 strike 2 ball");
    }
}

//https://lannstark.tistory.com/52 좋은 정보 글