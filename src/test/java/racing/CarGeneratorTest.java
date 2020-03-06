package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarGeneratorTest {
    @Test
    @DisplayName("쉼표(,)로 구분 테스트")
    void splitTest() {
        String input = "a,b,,c,d,,";
        List<String> expect = Arrays.asList("a", "b", "c", "d");

        assertThat(CarGenerator.split(input)).isEqualTo(expect);
    }
}
