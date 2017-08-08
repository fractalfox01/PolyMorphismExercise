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

    public void startEngine(){
        System.out.println("Engine on " + name + " is being started");
    }
    public void accelerate(){
        System.out.println(name + " is accelerating");
    }
    public void brake(){
        System.out.println(name + " is braking");
    }
}

class Taurus extends Car{
    public Taurus(){
        super("Taurus", false, 6,4);
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
    @Override
    public void startEngine(){
        if(!getEngine()){
            System.out.println("oops, No engine in " + getName());
            System.out.println("Engine is " + getEngine());
        }
        else{
            System.out.println("Starting engine on " + getName());
        }
    }
}

class Jeep extends Car{
    public Jeep(){
        super("Jeep", true, 6,2);
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
        taurus.startEngine();

        System.out.println();

        Car jeep = new Jeep();
        System.out.println(jeep.getName());
        jeep.startEngine();

        System.out.println();

        Car ram = new Ram1500();
        System.out.println(ram.getName());
        ram.startEngine();
    }
}
