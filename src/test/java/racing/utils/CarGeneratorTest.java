package racing.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarGeneratorTest {
    @Test
    @DisplayName("쉼표(,)로 구분 테스트")
    void generateTest() {
        String input = "a,b,,c,d,,";
        List<String> expect = Arrays.asList("a", "b", "c", "d");

        assertThat(CarGenerator.split(input)).isEqualTo(expect);
    }

    @Test
    @DisplayName("이름 중복 테스트")
    void generateFailTest() {
        String input = "a,a";

        assertThatThrownBy(() -> CarGenerator.generate(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("중복");
    }
}
