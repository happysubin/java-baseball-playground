package numberbaseball.tdd.v1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ValidationUtilsTest {

    @Test
    @DisplayName("숫자 야구 값 범위에 대해 확인하는 테스트")
    void validationRangeTest(){
        assertThat(ValidationUtils.validateRange(0)).isTrue();
        assertThat(ValidationUtils.validateRange(9)).isTrue();
        assertThat(ValidationUtils.validateRange(-1)).isFalse();
        assertThat(ValidationUtils.validateRange(10)).isFalse();
    }

}
