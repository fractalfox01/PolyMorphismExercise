/*
We are going to go back to the car analogy.
Create a base class called car
it should have a few fields that would be appropriate for a generic car class.
engine, cylinders, wheels, etc.
Constructors should initialize cylinders (number of) and name, and set wheels to 4
and engine to true. cylinders and names would be passed parameters.

Create some methods like startEngine, accelerate, and brake

show a message for each in the base class
Now create 3 sub classes for your favorite vehicles.
Override the appropriate methods to demonstrate polymorphism in use.
put all classes in the one java file (this one).
 */
class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;

    public Car(String name, int cylinders){
        this.name = name;
        this.engine = engine = true;
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

    public String startEngine(){
        return ("Car --> Engine on " + name + " is being started");
    }

    public String accelerate(){
        return ("Car --> " + name + " is accelerating");
    }

    public String brake(){
        return ("Car --> " + name + " is braking");
    }
}

class Taurus extends Car{
    public Taurus(){
        super("Taurus", 6);
    }

    @Override
    public String getName() {
        return "Taurus";
    }
}

class Ram1500 extends Car{
    public Ram1500(){
        super("Ram1500", 8);
    }

    @Override
    public String getName() {
        return "Ram1500";
    }
    @Override
    public String startEngine(){
        if(!getEngine()){
            return ("oops, No engine in " + getName() + "Engine is " + getEngine());
        }
        else{
            return ("Ram1500 --> Starting engine on " + getName());
        }
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " --> accelerating";
    }
}

class Jeep extends Car{
    public Jeep(){
        super("Jeep", 6);
    }

    @Override
    public String getName() {
        return "Jeep";
    }
}
public class Main {
    public static void main(String[] args) {

        Car taurus = new Taurus();
        System.out.println(taurus.getName());
        System.out.println(taurus.startEngine());

        System.out.println();

        Car jeep = new Jeep();
        System.out.println(jeep.getName());
        System.out.println(jeep.startEngine());

        System.out.println();

        Car ram = new Ram1500();
        System.out.println(ram.getName());
        System.out.println(ram.startEngine());
        System.out.println(ram.accelerate());
    }
}
