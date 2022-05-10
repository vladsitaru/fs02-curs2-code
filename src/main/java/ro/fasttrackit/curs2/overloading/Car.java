package ro.fasttrackit.curs2.overloading;

public class Car {

    private final int speed;

    public Car() {
        this(1);
    }

    public Car(int speed) {
        this.speed = speed;
    }

    private void drive() {
        drive(10);
    }

    private void drive(int speed) {
        drive(speed, 1);
    }

    private void drive(int speed, int direction) {
        System.out.println("Driving with %s speed and direction %s".formatted(speed, direction));
    }
}
