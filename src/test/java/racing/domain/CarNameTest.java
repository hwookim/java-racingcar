package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNameTest {
    @Test
    @DisplayName("자동차이름 생성 실패 테스트")
    void initFailTest() {
        assertThatThrownBy(() -> new CarName("ABCDEF"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
