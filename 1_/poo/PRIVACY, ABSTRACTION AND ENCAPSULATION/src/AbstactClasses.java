package src;
public class AbstactClasses {
    // ! This will throw an error because abstract classes cannot be instantiated.
    // Animal animal = new Animal();
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.noise();
        Human hooman = new Human();
        hooman.noise();
        dog.breathe();
        hooman.breathe();
        InterfaceAndInheritanceClass weird = new InterfaceAndInheritanceClass();
        weird.someUnunderstableMethod();
        weird.isInstanciated();
    }
}
abstract class Animal{
    void breathe(){
        System.out.println("I'm breathing");
    }
    abstract void noise();
}

class Dog extends Animal{
    void noise(){
        System.out.println("Woof woof!");
    }
}

class Human extends Animal{
    void noise(){
        System.out.println("I can talk");
    }
}
/**
 * SomeInterface
 */
interface SomeInterface {
    void noise();
    boolean isInstanciated();
    void delete();
}
interface AnotherInterface{
    final int CONSTANT = 3;
    public int someVar = 55;
    static double someDouble = 33.5d;
    void someWeirdStuff();
    // ...
    String someUnunderstableMethod();
}


/*
 * Interfaces and abstract class are different things.
 * Differences are in the README.md
 * This is a toy class to see how it works.
 */

class InterfaceAndInheritanceClass extends Animal 
    implements SomeInterface, AnotherInterface{

/*
 * sintax: 
 *      * modifier: access
 *      * class keyword
 *      * class name
 *      * Superclass: extends ParentClass
 *      * Interfaces: implements FirstInterface, SecondInterface...
 *      * Body: surrounded by braces {}
 * 
 *      ex:
 ?      public class NameOfTheClass extends ParentClass implement FirstInterface{
 ?                  ___body___
 ?      }
 */



    private boolean instanciated = false;

    InterfaceAndInheritanceClass(){
        this.instanciated = true;
    }
    public boolean isInstanciated(){
        return this.instanciated;
    }
    public void delete(){
        /* Programmer stuff */
        System.out.println("Deleted");
    }
    public void noise(){
        System.out.println("Informatic noise");
    }
    public void someWeirdStuff(){
        System.out.println("Weeeeird... Annoyingly weird.");
    }
    public String someUnunderstableMethod(){
        return "I don't understand what I'm writing. Just pay me!";
    };
    public static String inheritedVariables(){
        return String.format("%d %s %z", CONSTANT, someVar, someDouble);
    }
}
