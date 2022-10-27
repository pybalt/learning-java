public class App {
    public static void main(String[] args) throws Exception {
        Coupe porsche911 = new Coupe("gasoline", "ABC 1234 ARG");
        System.out.println(porsche911.licensePlateNumber);
        System.out.println(porsche911.getNumberOfDoors());
    }
}
abstract class Vehicle{
    private int maxSpeed;
    private String fuel;
    /**
     * @return int return the maxSpeed
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    /**
     * @param maxSpeed the maxSpeed to set
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    /**
     * @return String return the fuel
     */
    public String getFuel() {
        return fuel;
    }
    
    /**
     * @param fuel the fuel to set
     */
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}

class Car extends Vehicle{
    private int numberOfDoors;
    String licensePlateNumber;
    /**
     * @return int return the numberOfDoors
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    /**
     * @param numberOfDoors the numberOfDoors to set
     */
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