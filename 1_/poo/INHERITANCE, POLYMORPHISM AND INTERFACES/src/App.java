
public class App {
    public static void main(String[] args) throws Exception {
        Coupe porsche911 = new Coupe("gasoline", "ABC 1234 ARG");
        System.out.println(porsche911.licensePlateNumber);
        System.out.println(porsche911.getNumberOfDoors());
        
        /*
         * Differents objects have the same method but differents behaviors.
         * This is polymorphism.
         */
        
        offRoad vochoBaja = new offRoad("gasoline", "DEF 4321 MEX");
        System.out.println(vochoBaja.licensePlateNumber);
        System.out.println(vochoBaja.getNumberOfDoors());

    }
}
abstract class Vehicle{
    private int maxSpeed;
    private String fuel;

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public String getFuel() {
        return fuel;
    }
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
class Car extends Vehicle{
    /*
     * className __extends__ anotherClassName
     * 
     * This is the sintax of inheritance 👆
     */
    private int numberOfDoors;
    String licensePlateNumber;
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public boolean checkLicensePlateNumber(String license){
        return (this.licensePlateNumber == license);
    }
}
class Coupe extends Car{
    Coupe(String fuel, String licensePlateNumber){
        setNumberOfDoors(2);
        setMaxSpeed(300);
        setFuel(fuel);
        this.licensePlateNumber = licensePlateNumber;
    }
}
class offRoad extends Car{
    offRoad(String fuel, String licensePlateNumber){
        setNumberOfDoors(5);
        setMaxSpeed(180);
        setFuel(fuel);
        this.licensePlateNumber = licensePlateNumber;
    }
}