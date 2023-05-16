    /*In Java, the Vector class is a part of the Java Collections Framework and is used to create dynamic arrays
            that can grow or shrink in size as needed. It is similar to the ArrayList class, but unlike ArrayList,
            Vector is synchronized, meaning it is thread-safe and can be accessed by multiple threads simultaneously.*/

import java.util.Scanner;

public class Vector1WeekDays {
    public static void main(String[] args) {

        // Example 1: How to select a day of the week using a number from 1 to 7
        String [] vectorWeek = {"Monday","Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of week number from 1 to 7:");
        int d = scanner.nextInt();
        System.out.println("Chosen Day: "+ vectorWeek[d-1]);
        System.out.println("--------------------------------------------");
        int size = vectorWeek.length;
        System.out.println("Size of Vector: "+size);
    }
}
