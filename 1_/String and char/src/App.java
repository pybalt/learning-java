/* 
╔════════════════════════════════════════════════════════════════════════╗
║ Strings and characters.                                                ║
║ There are two types of char.                                           ║
║ Char are declared with simple quotes, while strings with doble quotes. ║
╠═════════╦════════════════════════════════════╦═════════════════════════╣
║ char    ║ 'a', 'b', 'c', '1', '2', '%', '&'  ║ char initial = 'L'      ║
╠═════════╬════════════════════════════════════╬═════════════════════════╣
║ string  ║ "Hello world!", "How are you?"     ║ String name = "Leonel"  ║
╚═════════╩════════════════════════════════════╩═════════════════════════╝
*/


public class App {
    public static void main(String[] args) throws Exception {
        testChar();
        testString();
        concatenation();
    }
    public static void testChar(){
        char initial =  'L';
        System.out.println(String.format(
            "My initial is %s", initial
            ));   
    }
    public static void testString(){
        String name = "Leonel";
        System.out.println(String.format("My \tname\t is %s\n", name));
        /* You can also use escape sequences inside the strings.
         * A few examples:
         * \t TAB
         * \n ENTER
         */
    }
    public static void concatenation() {
        String name = "Leonel";
        String explanation = """
                The last line has been concatenated. 
                On the other hand,
                this is a multiline string.
                """;
        System.out.println("\nHello, my name is " + name + "\n");
        System.out.println(explanation);
    }
}
