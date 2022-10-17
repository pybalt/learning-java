/* Interfaces
 * An interface is kind of contract you firm.
 * The interface specifies the behavior of a class.
 * So once you implement an interface, you must obey with
 * their specifications.
 */

/**
 * Animal interface
 */
interface IAnimal {
    void eat();
    void breath();
    void sound();    
}

class Dog implements IAnimal{
    @Override
    public void eat() {
        System.out.println("Nom nom nom");
    }
    @Override
    public void sound() {
        System.out.println("Woof woof!");
    }
    @Override
    public void breath() {
        System.out.println("I'm breathing.");
    }
}

class Bird implements IAnimal{
    @Override
    public void eat() {
        System.out.println("Nom nom nom");
    }
    @Override
    public void sound() {
        System.out.println("Pio pio pio");
    }
    @Override
    public void breath() {
        System.out.println("I'm breathing");
    }
}

/**
 * IBicycle
 */
interface IBicycle {
    //  wheel revolutions per minute
    void changeCadence(int newValue);
    void changeGear(int newValue);
    void speedUp(int increment);
    void applyBrakes(int decrement);
}
class Bycicle implements IBicycle{
    private int speed = 0;
    private int rpm;
    private int gear;
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println(String.format("Wooloo! Speed at %s kph!", speed));
    }
    @Override
    public void changeCadence(int newValue) {
        rpm = newValue;
        System.out.println(String.format("The wheel is making %s revolutions per minute!", rpm));
    }
    @Override
    public void changeGear(int newValue) {
        gear = newValue;
        System.out.println(String.format("Right now on the %s gear!", gear));
    }
    @Override
    public void applyBrakes(int decrement) {
        speed -= decrement;
        System.out.println(String.format("Brakes applied! Right now cycling at %s kpm!", speed)); 
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Dog tuque = new Dog();
        tuque.breath();
        tuque.sound();
        tuque.eat();
        Bird birdo = new Bird();
        birdo.sound();
        Bycicle cycle = new Bycicle();
        cycle.speedUp(25);
    }
}
