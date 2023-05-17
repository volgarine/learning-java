/*In Java, the Vector class is a part of the Java Collections Framework and is used to create dynamic arrays
        that can grow or shrink in size as needed. It is similar to the ArrayList class, but unlike ArrayList,
        Vector is synchronized, meaning it is thread-safe and can be accessed by multiple threads simultaneously.*/

import java.util.Vector;
public class Vector2FruitsAddRemove {
    public static void main(String[] args) {

    // Create a new Vector
    Vector<String> fruits = new Vector<>();

    // Add elements to the Vector
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

    // Get the size of the Vector
    int size = fruits.size();
        System.out.println("Size of Vector: " + size);

    // Access elements in the Vector
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Second fruit: " + fruits.get(1));

    // Remove an element from the Vector
        fruits.remove(0);
        System.out.println("Updated Vector: " + fruits);

    // Iterate over the Vector
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

/*In this example, we first create a new Vector named fruits. We then use the add() method to add three fruit names ("Apple", "Banana", and "Orange") to the Vector.

        We retrieve the size of the Vector using the size() method and print it to the console.

        We access elements in the Vector using the get() method, passing the index of the element we want to retrieve.
        In this case, we print the first and second fruits using fruits.get(0) and fruits.get(1).

        We remove an element from the Vector using the remove() method and passing the index of the element we want to remove.
        In this case, we remove the third fruit.

        Finally, we iterate over the Vector using a for-each loop and print each fruit to the console.

        Note that the Vector class has been present in Java for a long time, but since Java 1.2,
        it is recommended to use ArrayList instead, unless you specifically need the synchronized behavior provided by Vector.
        */

