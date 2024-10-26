package dz10;

public class Car {
    private String color;
    private String engine;
    private int doorCount;

    public Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class CarTest {
    public static void changeDoorCount(Car car, int newDoorCount) {
        car.setDoorCount(newDoorCount);
    }

    public static void swapColor(Car car1, Car car2) {
        String temp = car1.getColor();
        car1.setColor(car2.getColor());
        car2.setColor(temp);
    }

    public static void main(String[] args) {
        Car car1 = new Car("red", "V8", 5);
        System.out.println(car1.getColor());

        Car car2 = new Car("blue", "V6", 3);
        System.out.println(car2.getColor());

        System.out.println();

        swapColor(car1, car2);
        System.out.println(car1.getColor());
        System.out.println(car2.getColor());

        System.out.println();

        Car car3 = new Car("red", "V8", 2);
        System.out.println(car3.getDoorCount());
        changeDoorCount(car3, 5);
        System.out.println(car3.getDoorCount());
    }
}