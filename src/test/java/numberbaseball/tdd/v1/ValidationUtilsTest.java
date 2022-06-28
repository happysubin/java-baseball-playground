package numberbaseball.tdd.v1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ValidationUtilsTest {

    @Test
    @DisplayName("숫자 야구 값 범위에 대해 확인하는 테스트")
    void validateRangeTest(){
        assertThat(ValidationUtils.validateRange(0)).isTrue();
        assertThat(ValidationUtils.validateRange(9)).isTrue();
        assertThat(ValidationUtils.validateRange(-1)).isFalse();
        assertThat(ValidationUtils.validateRange(10)).isFalse();
    }

    @Test
    @DisplayName("중복 되는 숫자가 있는지 체크")
    void validateDuplicatedTest(){
        assertThat(ValidationUtils.validateDuplicate(1, 2, 3)).isTrue();
        assertThat(ValidationUtils.validateDuplicate(3, 2, 3)).isFalse();
        assertThat(ValidationUtils.validateDuplicate(3, 3, 3)).isFalse();
    }

    @Test
    @DisplayName("3자리 수인지 체크")
    void validatePositionTest(){
        assertThat(ValidationUtils.validatePosition(1, 2, 3)).isTrue();
        assertThat(ValidationUtils.validatePosition(3, 2, 3)).isFalse();
        assertThat(ValidationUtils.validatePosition(3, 3, 3)).isFalse();
    }


}
