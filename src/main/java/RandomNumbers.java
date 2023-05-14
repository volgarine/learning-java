// In Java, the java.util.Random class can be used to generate random numbers.
// The class provides several methods for generating random numbers of different data types.

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        // Example 1
        Random random = new Random();
        System.out.println("Random numbers generated:");
        System.out.println("Example 1 (between 0 to 6): "+random.nextInt(7));

        //Example 2
        int randomNum = random.nextInt(10) + 1;
        System.out.println("Example 2 (between 1 and 10): " + randomNum);

        // Example 3
        int min = 5;
        int max = 10;
        int NumberGenerator = min + random.nextInt(max - min + 1);
        System.out.println("Example 3 (between 5 to 10): " + NumberGenerator);
        // NumberGenerator = 5 + Something between 0 and (10 - 5 + 1), that is, add to 5 => something between 0 and 5
    }
}