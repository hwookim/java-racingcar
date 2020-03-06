package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarsTest {
    @Test
    @DisplayName("Cars 생성 테스트")
    void initTest() {
        List<String> input = Arrays.asList("A", "B", "C");

        assertThatCode(() -> new Cars(input))
                .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("이름 중복 체크")
    void validateNameDuplication() {
        List<String> input = Arrays.asList("A", "A");

        assertThatThrownBy(() -> new Cars(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("중복");
    }
}
