class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;

    public Car(String name, boolean engine, int cylinders, int doors){
        this.name = name;
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = doors;
    }

    public String getName() {
        return name;
    }

    public boolean getEngine() {
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

class Taurus extends Car{
    public Taurus(){
        super("Taurus", true, 6,4);
    }

    @Override
    public String getName() {
        return "Taurus";
    }
}

class Ram1500 extends Car{
    public Ram1500(){
        super("Ram1500", true,8,2);
    }

    @Override
    public String getName() {
        return "Ram1500";
    }
}

class Jeep extends Car{
    public Jeep(){
        super("Vehicle", true, 6,2);
    }

    @Override
    public String getName() {
        return "Jeep";
    }
}
public class Main {
    public static void main(String[] args) {
        Car mycar = new Car("tom",true,0,1);

        Car taurus = new Taurus();
        System.out.println(taurus.getName());

        System.out.println();

        Car jeep = new Jeep();
        System.out.println(jeep.getName());
        System.out.println(jeep.getDoors());
        System.out.println(jeep.getName().toUpperCase());

    }
}
