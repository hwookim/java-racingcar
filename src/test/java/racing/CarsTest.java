package racing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class CarsTest {
    List<Car> cars;

    @BeforeEach
    void setUp() {
        cars = Arrays.asList(
                new Car("A", 24),
                new Car("B", 0),
                new Car("C", 7)
        );
    }

    @Test
    @DisplayName("Cars 생성 테스트")
    void initTest() {
        assertThatCode(() -> new Cars(cars))
                .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("전체 차량 이동, 정지 테스트")
    void playRoundTest() {
        Cars cars = new Cars(this.cars);

        //이동
        cars.playRound(new MoveNumberGenerator());
        assertThat(cars.getCars().get(0).getPosition()).isEqualTo(25);
        assertThat(cars.getCars().get(1).getPosition()).isEqualTo(1);
        assertThat(cars.getCars().get(2).getPosition()).isEqualTo(8);

        //정지
        cars.playRound(new StopNumberGenerator());
        assertThat(cars.getCars().get(0).getPosition()).isEqualTo(25);
        assertThat(cars.getCars().get(1).getPosition()).isEqualTo(1);
        assertThat(cars.getCars().get(2).getPosition()).isEqualTo(8);
    }
}
