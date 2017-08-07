class Car {
    private String name;
    private String engine;
    private int cylinders;
    private int wheels;
    private int doors;

    public Car(String name, String engine, int cylinders, int wheels, int doors){
        this.name = name;
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
        this.doors = doors;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }
}

public class Main {
    public static void main(String[] args) {
        Car mycar = new Car("tom","stuff",0,1,2);


    }
}
