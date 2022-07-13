package challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class InputViewTest {

    @Test
    @DisplayName("InputView로 받은 값 검증 성공 테스트")
    void inputViewValidationSuccessTest(){
        String numbers = "123";
        boolean result = InputView.validate(numbers);
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("InputView로 받은 값 검증 실패 테스트")
    void inputViewValidationFailTest(){
        assertThatThrownBy(() -> {
            String numbers = "www";
            String numbers1 = "1234";
            boolean resul1 = InputView.validate(numbers1);
            boolean result = InputView.validate(numbers);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
