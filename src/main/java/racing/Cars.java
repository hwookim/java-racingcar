package racing;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {
    List<Car> cars;

    public Cars(List<String> names) {
        validateNameDuplication(names);

    }

    private void validateNameDuplication(List<String> names) {
        Set<String> duplication = new HashSet<>(names);
        if (names.size() != duplication.size()) {
            throw new IllegalArgumentException("중복된 이름이 있습니다.");
        }
    }
}
