/* STRINGS
 * Strings represents a combination of characters.
 * Characters -> [a-zA-Z0-9] + Symbols [^, $, &, ...]
 * Strings has methods associated with them.
 */

/*
 * METHODS
 * substring(startIndex, endIndex) -> substract a string from start to end inclusive.
 * contains(charSequence) -> Boolean. Returns boolean if match, or doesn't, the charSequence.
 * split(regex) -> Array. Returns an array of strings splitted by the regex.
 * toUpperCase() -> String
 * toLowerCase() -> String
 * trim() -> String. Returns a copy of the string with trailings or leading spaces omitted.
 * concat(str) -> String. Concatenates the specified string to the end of this string.
 * String.format("String %s... %s", var 1, ..., var n) -> String. 
    Returns a formatted string using the specified format string and arguments.

    ... and many more!

    __doc__

    https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

 */

public class App {
    public static void main(String[] args) throws Exception {
        String d = "abcdefg".substring(3, 4);
        System.out.println(d + " This is a substring.");


        CharSequence sequence = "\s";
        String myExampleString = """
                Hello World! This is an example of a multiline string,
                It contains numbers: 1,2,3
                and symbols:
                # @ % &&
                """;
        boolean verify = myExampleString.contains(sequence);
        System.out.println(verify + " The secuence contains \s -> spaces");


        String[] filteredWithRegex = myExampleString.split("\s");
        for(String i : filteredWithRegex){
            System.out.println(i);
        }

        String lowerOrUpperCase = "  ThIs WiLl bE lOwER oR uPPer  ";

        System.out.println(lowerOrUpperCase.toLowerCase());

        System.out.println(lowerOrUpperCase.toUpperCase());

        System.out.println(lowerOrUpperCase.trim());

        System.out.println(String.format("\n**%s**", lowerOrUpperCase.trim().toLowerCase()));
    }
}
