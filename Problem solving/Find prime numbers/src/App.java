import java.util.Scanner; // To read user input

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This program calculates number primes. How many do you want?");

        int encounteredPrimeNumbers = 0;
        int[] primeNumbers;
        int index = 0;

        /* Scanners needs to be closed. This is sugar syntax. 👇 */
        try (Scanner scanner = new Scanner(System.in)) {

            int primeNumbersToFind = scanner.nextInt();
            primeNumbers = new int[primeNumbersToFind];
            for (int i = 1; primeNumbersToFind > encounteredPrimeNumbers; i++) {

                if (isPrime(i)) {
                    encounteredPrimeNumbers++;
                    primeNumbers[index] = i;
                    index++;
                }

            }

        }
        System.out.print("[ ");
        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.print(" " + primeNumbers[i] + " ");
        }
        System.out.print(" ]");
    }

    static boolean isPrime(int i) {
        int multiples = 0;
        for (int j = 1; j < i; j++) {
            if (i % j == 0) {
                multiples++;
            }
            if (multiples > 1) {
                return false;
            }
        }
        return true;
    }
}