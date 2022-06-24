package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void firstRequestProblem(){
        String str = "1,2";
        String s = "1";

        String[] split1 = str.split("");
        String[] split2 = s.split("");

        assertThat(split1).contains("1","2");
        assertThat(split2).containsExactly("1");
    }

    @Test
    void secondRequestProblem(){
        String str = "(1,2)";
        str = str.substring(1,4);

        System.out.println("str = " + str);

        assertThat(str).isEqualTo("1,2");
    }

    @Test
    void ThirdRequestProblem(){
        String str = "abc";
        assertThatThrownBy(()->{
            str.charAt(4);
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }
}
