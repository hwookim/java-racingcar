package racing;

import java.util.List;

public class Cars {
    List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void playRound(NumberGenerator numberGenerator) {
        cars.forEach(car -> car.move(numberGenerator.getNumber()));
    }

    public List<Car> getCars() {
        return cars;
    }
}
