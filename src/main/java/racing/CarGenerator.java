package racing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarGenerator {
    private static final String SEPARATOR = ",";
    private static final String BLANK = "";

    public static List<String> split(String input) {
        return Arrays.stream(input.split(SEPARATOR))
                .filter(name -> !BLANK.equals(name))
                .collect(Collectors.toList());
    }
}
