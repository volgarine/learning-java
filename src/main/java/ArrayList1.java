/*
In Java, ArrayList is a class that is part of the Java Collections Framework and provides a dynamic array-like structure.
        It allows you to create resizable arrays, which can grow or shrink in size as needed. Unlike regular arrays,
        ArrayList can store objects and provides various methods for manipulating and accessing the elements.
        The ArrayList class provides many other useful methods for manipulating and accessing elements,
        such as add, remove, contains, indexOf, sort, and more.
        It offers flexibility and convenience when working with collections of objects in Java.
*/

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Print ArrayList
        System.out.println("ArrayList: " + fruits);

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of ArrayList: " + size);

        // Access elements in the ArrayList
        System.out.println("First fruit (0): " + fruits.get(0));
        System.out.println("Second fruit (1): " + fruits.get(1));
        System.out.println("Third fruit (2): " + fruits.get(2));

        // Remove an element from the ArrayList
        fruits.remove(2);
        System.out.println("Updated ArrayList: " + fruits + " after removed index: 2");

        // Iterate over the ArrayList
        System.out.println("'for loop' to show the new ArrayList: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}