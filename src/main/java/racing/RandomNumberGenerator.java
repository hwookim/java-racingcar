package racing;

import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {
    private static final int RANDOM_MAX = 9;

    @Override
    public int getNumber() {
        Random random = new Random();
        return random.nextInt(RANDOM_MAX);
    }
}
