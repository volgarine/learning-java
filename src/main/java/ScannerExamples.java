//Scanner is a class in the java.util package that allows you to read input from various sources
//        such as the console, files, or strings. It provides various methods to read different
//        data types such as int, double, String, and more.

import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("What is your height? (meters)");
        double height = scanner.nextDouble();

        System.out.println("-----------------------");
        System.out.println("Name: " + name + " | Age: " + age + " | Height: " + height);



    }

}
