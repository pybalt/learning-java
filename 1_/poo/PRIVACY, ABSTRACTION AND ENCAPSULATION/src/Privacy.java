package src;
public class Privacy {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        MyPrivacy myPrivateClass = new MyPrivacy();
        /* You can't do this because privateInt is set as private.
         * The compiler will throw "The field Privacy.privateInt is not visible."
         * 👇
         */
        // ! myPrivateClass.privateInt = 5;

        /*
        * There is functions which their only responsability is to get or set a 
        * private property of the class. Their names are 'setters' or 'getters', respectively.
        * They're in encapsulation.java file
        */

    }
}


class MyPrivacy {
    private int privateInt;
    private int anotherPrivateInt;
    // ! Exception: Booleans getters.
    private boolean hidden;
    private static Integer myPrivateStatic;
    protected String myPrivatePublic;
    /*
     * The private modifier specifies that the member can only be accessed in its own class.
     * The protected modifier specifies that the member can only be accessed within
     *       its own package (as with package-private) and,
     *       in addition,
     *       by a subclass of its class in another package.
     * ...
     */
    /*
    *  ╔══════════════════════════════════════════════════╗
    *  ║                   Access levels                  ║
    *  ╠═════════════╦═══════╦═════════╦══════════╦═══════╣
    *  ║   Modifier  ║ Class ║ Package ║ Subclass ║ World ║
    *  ╠═════════════╬═══════╬═════════╬══════════╬═══════╣
    *  ║    public   ║   Y   ║    Y    ║     Y    ║   Y   ║
    *  ╠═════════════╬═══════╬═════════╬══════════╬═══════╣
    *  ║  protected  ║   Y   ║    Y    ║     Y    ║   N   ║
    *  ╠═════════════╬═══════╬═════════╬══════════╬═══════╣
    *  ║ no modifier ║   Y   ║    Y    ║     N    ║   N   ║
    *  ╠═════════════╬═══════╬═════════╬══════════╬═══════╣
    *  ║   private   ║   Y   ║    N    ║     N    ║   N   ║
    *  ╚═════════════╩═══════╩═════════╩══════════╩═══════╝
    */

    public Integer howTallAmI = 192;
}