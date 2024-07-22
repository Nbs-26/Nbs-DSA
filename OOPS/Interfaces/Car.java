package OOPS.Interfaces;

public class Car implements Brakes,Engine,MediaPlayer{

    String model="SUV";

    @Override
    public void start() {
        System.out.println("Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Engine stopped");
    }

    @Override
    public void acc() {
        System.out.println("Engine accelareted");
    }

    @Override
    public void brake() {
        System.out.println("Brakes applied");
    }    
}
