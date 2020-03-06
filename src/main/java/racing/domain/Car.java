package racing.domain;

public class Car {
    CarName name;
    CarPosition position;

    public Car(String name, int position) {
        this.name = new CarName(name);
        this.position = new CarPosition(position);
    }

    public Car(String name) {
        this(name, 0);
    }

    public void move(int no) {
        position.move(no);
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position.getPosition();
    }
}
