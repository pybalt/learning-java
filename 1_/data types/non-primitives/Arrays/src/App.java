/*
 * An array is a container object that holds a fixed number of values of a single type.
 * The length of an array is established when the array is created.
 *  After creation, its length is fixed.
 *  We have an example of array in the main function.
 *              ... main(String[] args) th...
 * 
 */

/*
 * METHODS
 * binarySearch -> get the index of specific value
 * equals -> check if two arrays are equal or not
 * fill -> fill an array with a value at each index
 * sort -> sort into ascending order
 *              -> sequentially == sort()
 *              -> concurrently == parallelSort()
 * stream -> A stream is an object that contains a sequence
             of elements. It contains several methods. stream() method
             creates a stream using an array as source.
 * toString -> convert an array to string to make it more readable.
                String makeReadable = Array.toString(myArray);
                System.out.println(makeReadable);
            out     -> `[1, 2, 3, 4]`
 */


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("In File: App.java, Line: 4");

        // Ways of declaring an array
/*
 * First way
 */
        int[] array;

        array = new int[4];

        // I'm creating an array of 4 elements, they're all ints.

        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        System.out.println(array);
        // This will show a strange sintax -> [I@4617c264
        for(int i : array){
            System.out.println(i);
            // We must iterate over the elements to print them.
        };

/*
 * Second way
 */
        int[] anotherArray = {0, 1, 2, 4, 5, 6};
        for(int i: anotherArray){
            System.out.println(i);
        }
/*
 * You can also declare an array using another array length.
 */
        boolean[] wasThatTrue; // Instanciating my new array
        wasThatTrue = new boolean[anotherArray.length+1]; // Fixing their size with anotherArray.length property.
        for (int i : anotherArray){
            if(i >= 2){
                wasThatTrue[i] = true;
            }
            else{
                wasThatTrue[i] = false;
            }
            System.out.println(wasThatTrue[i]);
        }
        /*
         * By the way, this is mapping. This can be achievable with other methods.
         */
        System.out.println(wasThatTrue);
        wasThatTrue = new boolean[anotherArray.length - 2];
        System.out.println(wasThatTrue.length);

    }
}
