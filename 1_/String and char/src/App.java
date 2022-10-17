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
    }
    public static void testChar(){
        char initial =  'L';
        System.out.println(String.format(
            "My initial is %s", initial
            ));   
    }
    public static void testString(){
        String name = "Leonel";
        System.out.println(String.format("My name is %s", name));
    }
}
