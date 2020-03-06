package racing;

public class Car {
    CarName name;
    CarPosition position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new CarPosition(0);
    }
}
