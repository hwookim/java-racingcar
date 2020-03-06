package racing.domain;

import racing.utils.NumberGenerator;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void playRound(NumberGenerator numberGenerator) {
        cars.forEach(car -> car.move(numberGenerator.getNumber()));
    }

    public String findWinner() {
        int winnerPosition = findWinnerPosition();

        return cars.stream()
                .filter(car -> car.getPosition() == winnerPosition)
                .map(Car::getName)
                .collect(Collectors.joining(","));
    }

    private int findWinnerPosition() {
        return cars.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElse(0);
    }

    public List<Car> getCars() {
        return cars;
    }
}
