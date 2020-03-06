package racing;

public class CarName {
    public static final int NAME_MAX_LENGTH = 5;
    String name;

    public CarName(String name) {
        validateSize(name);
        this.name = name;
    }

    private void validateSize(String name) {
        if (name.length() > NAME_MAX_LENGTH) {
            throw new IllegalArgumentException();
        }
    }
}
