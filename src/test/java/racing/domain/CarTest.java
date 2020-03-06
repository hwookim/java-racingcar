package racing.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class CarTest {
    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("A");
    }

    @Test
    @DisplayName("자동차 생성 테스트")
    void initTest() {
        assertThatCode(() -> new Car("A"))
                .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("전진 테스트")
    void moveTest() {
        car.move(0);

        assertThat(car.getPosition()).isEqualTo(0);

        car.move(4);

        assertThat(car.getPosition()).isEqualTo(1);
    }
}
