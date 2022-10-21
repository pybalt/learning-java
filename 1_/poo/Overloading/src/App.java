public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Car car = new Car();
        System.out.printf("Number of doors: %d\n\n", car.doors);

        Car porsche = new Car(2, 240);
        System.out.printf("Number of doors: %s\n\n", porsche.doors);
    }
}
class Car{
    int doors;
    int weigth;
    int maxSpeed;
    final int WHEELS = 4;
    
    /* Constructor */
    Car(){
        System.out.println("Constructor without parameters.");
        this.doors = 4;
        this.maxSpeed = 180;
    }
    
    /* Overloaded constructor */
    Car(int doors, int maxSpeed){
        System.out.println("Constructor with parameters.");
        this.doors = doors;
        this.maxSpeed = maxSpeed;
    }
}