package racing;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Cars {
    List<Car> cars;

    public Cars(List<String> names) {
        validateNameDuplication(names);
        this.cars = createCars(names);
    }

    private List<Car> createCars(List<String> names) {
        return names.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    private void validateNameDuplication(List<String> names) {
        Set<String> duplication = new HashSet<>(names);
        if (names.size() != duplication.size()) {
            throw new IllegalArgumentException("중복된 이름이 있습니다.");
        }
    }
}
