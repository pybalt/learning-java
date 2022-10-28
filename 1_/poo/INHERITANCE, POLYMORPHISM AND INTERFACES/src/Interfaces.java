
public class Interfaces {
    public static void main(String[] args) {
        System.out.println("Explanation of Interfaces");
        GoldenTerrier golden = new GoldenTerrier();
        golden.bark();
    }
}
/*
 * Implementing an interface allows a class to become
 *  more formal about the behavior it promises to provide.

 * Interfaces form a contract between the class and the outside world,
 *  and this contract is enforced at build time by the compiler.

 * If your class claims to implement an interface,
 *  all methods defined by that interface must appear 
 *      in its source code before the class will successfully compile.
 */

/**
 * Every animals is HETEROTROPIC and eat. 
 * So every animals must have this property(HETEROTROPIC) and behavior(eat)
 */
interface Animals {
    final boolean HETEROTROPHIC = true; 
    // String reproductionMethod
        // This can't be done because interface variables are finals.
        // and finals must be initialized.
    /* Ex: Oviparity, Viviparity */
    void eat();
}

abstract class Dog implements Animals{
    private final String REPRODUCTION_METHOD = "Viviparity";
    void bark(){
        System.out.println("Woof! Woof!");
    }
    String getReproductionMethod(){
        return this.REPRODUCTION_METHOD;
    }
}

class GoldenTerrier extends Dog{
    final private String FUR_COLOR = "YELLOW";
    public void eat(){
        System.out.println("Nom nom");
    }
    GoldenTerrier(){
        System.out.println("A golden terrier has born!");
        System.out.printf("\nThe color of this dog is %s\n", getFurColor());
    }
    String getFurColor(){
        return this.FUR_COLOR;
    }
}