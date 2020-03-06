package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RoundCountTest {
    @ParameterizedTest
    @DisplayName("RoundNumber 생성 실패 테스트")
    @ValueSource(strings = {"-1", "0", "a"})
    void initFailTest(String input) {
        assertThatThrownBy(() -> new RoundCount(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("횟수");
    }
}
