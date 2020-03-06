package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CarTest {
    @Test
    @DisplayName("자동차 생성 테스트")
    void initTest() {
        assertThatCode(() -> new Car("A"))
                .doesNotThrowAnyException();
    }
}
