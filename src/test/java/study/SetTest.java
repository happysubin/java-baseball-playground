package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void firstRequestProblem(){
        assertThat(numbers.size()).isEqualTo(3);
    }

    //아래 코드를 사용해 중복 코드를 제거.
    @ParameterizedTest
    @ValueSource(ints = {1,2,3 })
    void secondRequestProblem(int num){
        assertThat(numbers.contains(num)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
    void ThirdRequestProblem(int input, boolean expected){ // :를 기준으로 잘려서 들어온다.

        System.out.println("input = " + input);
        System.out.println("actualValue = " + expected);

        assertThat(numbers.contains(input)).isEqualTo(expected);
    }
}
