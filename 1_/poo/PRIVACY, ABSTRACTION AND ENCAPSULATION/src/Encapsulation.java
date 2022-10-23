package src;
/**
 * 
 * Encapsulation means we protect some data or methods to work within their own class.
 * To retrieve them and make usable to other class, we must add getters and setters.
 */
public class Encapsulation {


    public static void main(String[] args) {
        System.out.println(ThisIsEncapsulation.byeBye);
        OtherClass myClass = new OtherClass();
        myClass.example();
    }
}

class ThisIsEncapsulation{
    final static private String HELLO = "Hello";

    public static String byeBye = "Bye";

    /*
    * Added getter 
    */

    /**
     * Retrieve the 'hello' private constant.
     */
    static String getHello(){
        return HELLO;
    }
}

class OtherClass{
    String bye = ThisIsEncapsulation.byeBye;
    /*
    * 
    * 
    * 
    ! String hello = ThisIsEncapsulation.hello;
    ? This is impossible because 'hello' is encapsulated. It is only accessed within is own class, unless
    ? We add a getter to the class. 
    * 
    */
    void example(){
        System.out.println(ThisIsEncapsulation.getHello());
        /* Here we are using a getter to retrieve the HELLO constant of the ThisIsEncapsulation class */
    }
}