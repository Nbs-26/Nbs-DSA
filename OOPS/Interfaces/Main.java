package OOPS.Interfaces;

public class Main {
    public static void main(String[] args) {
        // Car car=new Car();
        // MediaPlayer car=new Car();
        // car.start();
        // car.stop();
        // car.acc();
        // car.brake();
        // System.out.println(car.model);


        NiceCar car=new NiceCar();
        car.start();
        car.startMusic(); 
        car.upgradeEngine();
        car.start();
    }
} 