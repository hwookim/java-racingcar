package racing.domain;

public class CarPosition {
    private static final int MOVE_PIVOT = 4;
    int position;

    public CarPosition(int position) {
        this.position = position;
    }

    public void move(int no) {
        if (no >= MOVE_PIVOT) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }
}
