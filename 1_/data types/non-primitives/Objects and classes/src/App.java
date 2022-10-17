/* Classes in Java 
*  1. Class is a set of object which shares common
*       characteristics/behavior and common properties/attributes.
*  2. Class is not a real world entity. 
*       It is just a template or blueprint or prototype from which objects are created.
*  3. Class does not occupy memory.
*  4. Class is a group of variables of different data types and group of methods.
*/

/* A class in java can contain:
*   • data member
*   • method
*   • constructor
*   • nested class and
*   • interface
*/

/* ***===============*** */
/* Objects in Java
 * It is a basic unit of Object-Oriented Programming and represents real life entities. 
 *       A typical Java program creates many objects, 
 *       which as you know, interact by invoking methods. An object consists of : 

* State: It is represented by attributes of an object. 
*        It also reflects the properties of an object.
* Behavior: It is represented by methods of an object. 
*        It also reflects the response of an object with other objects.
* Identity: It gives a unique name to an object and enables one object to interact with other objects.
 */
public class App {
    public static void main(String[] args) throws Exception {
        SomeClass myFirstObject = new SomeClass();
        System.out.println(myFirstObject.helloWorld());
    }
}
class SomeClass{
    String helloWorld(){
        return "Hello world!";
    }
}