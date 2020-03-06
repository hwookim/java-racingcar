package racing.utils;

import racing.domain.Car;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CarGenerator {
    private static final String SEPARATOR = ",";
    private static final String BLANK = "";

    public static List<Car> generate(String input) {
        List<String> carNames = split(input);
        validateNameDuplication(carNames);
        return carNames.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public static List<String> split(String input) {
        return Arrays.stream(input.split(SEPARATOR))
                .filter(name -> !BLANK.equals(name))
                .collect(Collectors.toList());
    }

    private static void validateNameDuplication(List<String> names) {
        Set<String> duplication = new HashSet<>(names);
        if (names.size() != duplication.size()) {
            throw new IllegalArgumentException("중복된 이름이 있습니다.");
        }
    }
}
