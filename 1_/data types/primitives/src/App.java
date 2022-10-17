/*
 * Primitive data types.
 * Primitive types are the most basic data types available within the Java language.
 * They don't have neither objects or methods associated with them.
 */
/*
* ╔═══════════════════════════════════════════════════════════════════════════════════╗
* ║ Primitive types are the most basic data types available within the Java language. ║
* ║ They don't have either objects or methods associated with them.                   ║
* ╠═════════════════╦══════════════╦══════════════════════════════════════════════════╣
* ║ Data Type       ║ Size         ║ Description                                      ║
* ╠═════════════════╬══════════════╬══════════════════════════════════════════════════╣
* ║ byte            ║ 1 byte       ║ Stores whole numbers from -128 to 127            ║
* ╠═════════════════╬══════════════╬══════════════════════════════════════════════════╣
* ║ short           ║ 2 bytes      ║ Stores whole numbers from -32,768 to 32,767      ║
* ╠═════════════════╬══════════════╬══════════════════════════════════════════════════╣
* ║ int             ║ 4 bytes      ║ Stores whole numbers                             ║
* ║                 ║              ║ from                                             ║
* ║                 ║              ║ -2,147,483,648                                   ║
* ║                 ║              ║ to                                               ║
* ║                 ║              ║ 2,147,483,647                                    ║
* ╠═════════════════╬══════════════╬══════════════════════════════════════════════════╣
* ║ long            ║ 8 bytes      ║ Stores whole numbers                             ║
* ║                 ║              ║ from                                             ║
* ║                 ║              ║                                                  ║
* ║                 ║              ║ -9,223,372,036,854,775,808                       ║
* ║                 ║              ║                                                  ║
* ║                 ║              ║ to                                               ║
* ║                 ║              ║                                                  ║
* ║                 ║              ║  9,223,372,036,854,775,807                       ║
* ╠═════════════════╬══════════════╬══════════════════════════════════════════════════╣
* ║ float           ║ 4 bytes      ║ Stores fractional numbers. Sufficient            ║
* ║                 ║              ║ for storing 7 decimal digits.                    ║
* ╠═════════════════╬══════════════╬══════════════════════════════════════════════════╣
* ║ double          ║ 8 bytes      ║ Stores fractional numbers. Sufficient            ║
* ║                 ║              ║ for storing 15 decimal digits.                   ║
* ╠═════════════════╬══════════════╬══════════════════════════════════════════════════╣
* ║ boolean         ║ 1 bit        ║ Stores true or false                             ║
* ╠═════════════════╬══════════════╬══════════════════════════════════════════════════╣
* ║ char            ║ 2 bytes      ║ Stores a single character/letter or ASCII        ║
* ║                 ║              ║ values                                           ║
* ╚═════════════════╩══════════════╩══════════════════════════════════════════════════╝
 */
public class App {
    public static void main(String[] args) throws Exception {
        bytes();
        shorts();
        ints();
        longs();
        floats();
        doubles();
        booleans();
        chars();
    }

    public static void bytes() {
        byte myByte = 127;
        
        System.out.println(String.format("\n--> %s,\n\tThis number is a byte!", myByte));
    }

    public static void shorts() {
        short myShort = 32767;
        System.out.println(String.format("\n--> %s,\n\tThis number is a short!", myShort));
    }

    public static void ints() {
        int myInt = 2147483647;
        System.out.println(String.format("\n--> %s,\n\tThis number is a int!", myInt));
    }

    public static void longs() {
        long myLong = 9223372036854775806L;
        /*
         * Note: By default, numbers are interpreted as int. So if we must use long numbers
         * We need to put an 'L' at the end of the number.
         * 
         * 132 -> int
         * 
         * 132L -> long
         * 
         * The same goes for float numbers.
         * 
         * 132  -> int      ==  132
         * 132f -> float    ==  132.0
         */
        System.out.println(String.format("\n--> %s,\n\tThis enormous number is a LONG!", myLong));
    }

    public static void floats() {
        float myFloat = 0.0000001f;
        System.out.println(String.format("\n--> %s,\n\tThis small number is a FLOAT!", myFloat));
    }

    public static void doubles() {
        double myDouble = 0.200000000000005d;
        System.out.println(String.format("\n--> %s,\n\tDoubly tiny number, this is a DOUBLE!", myDouble));
    }

    public static void booleans() {
        boolean myBoolean = true;
        System.out.println(String.format("\n--> %s,\n\tyes, it's true, this is a boolean!", myBoolean));
    }

    public static void chars() {
        char myChar = 'a';
        System.out.println(String.format("\n--> %s,\n\tThis simple letter is a character!", myChar));
    }
}
