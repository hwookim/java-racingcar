package racing.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.utils.MoveNumberGenerator;
import racing.utils.StopNumberGenerator;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class CarsTest {
    List<Car> input;

    @BeforeEach
    void setUp() {
        input = Arrays.asList(
                new Car("A", 24),
                new Car("B", 0),
                new Car("C", 7),
                new Car("D", 24)
        );
    }

    @Test
    @DisplayName("Cars 생성 테스트")
    void initTest() {
        assertThatCode(() -> new Cars(input))
                .doesNotThrowAnyException();
    }

    @Test
    @DisplayName("전체 차량 이동, 정지 테스트")
    void playRoundTest() {
        Cars cars = new Cars(input);

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

    @Test
    @DisplayName("우승자 탐색")
    void findWinnerTest() {
        Cars cars = new Cars(input);

        assertThat(cars.findWinner()).contains("A");
        assertThat(cars.findWinner()).contains("D");
        assertThat(cars.findWinner()).doesNotContain("B");
        assertThat(cars.findWinner()).doesNotContain("C");
    }
}
