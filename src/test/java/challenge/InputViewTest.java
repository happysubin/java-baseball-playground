package challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputViewTest {

    @Test
    @DisplayName("InputView로 받은 값 검증 성공 테스트")
    void inputViewValidationSuccessTest(){
        String numbers = "123";
        boolean result = InputView.validate(numbers);
        Assertions.assertThat(result).isTrue();
    }
}
