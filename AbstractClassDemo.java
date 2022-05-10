package day4;
abstract class Vehicle {        //abstract class
            public abstract void start();
            public abstract void stop();
            public void musicPlayer(){
                System.out.println("Music is being played");
            }
}
 class Car extends Vehicle {     //concrete class
    @Override
    public void start() {
        System.out.println("Car Started");
    }

     @Override
     public void stop() {
         System.out.println("Car Stopped");
     }

     @Override
    public void musicPlayer() {
        System.out.println("Music is being played");
    }
}
class Hyundai extends  Car {

    @Override
    public void stop() {

    }
}
class Bike extends Vehicle {

    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
}
public class AbstractClassDemo {

    public static void main(String[] args) {

      //  Vehicle v = new Vehicle();
        //Cannot create an object of abstract class
        System.out.println("###1. Creating two objects Bike and Car");

        Bike b = new Bike();
        b.start();
        b.stop();

        Car c = new Car();
        c.start();
        c.stop();
        c.musicPlayer();

        System.out.println("###2. Using one object");

        Vehicle v = new Bike();
        v.start();
        v.stop();

        v = new Car();
        v.start();
        v.stop();
        v.musicPlayer();

        //actually helping the GC
        b = null;
        c=null;
        v=null;
    }
}
