package racing;

public class Car {
    CarName name;
    CarPosition position;

    public Car(String name) {
        this.name = new CarName(name);
        this.position = new CarPosition(0);
    }

    public void move(int no) {
        position.move(no);
    }

    public int getPosition() {
        return position.getPosition();
    }

}
