// a simple example of how to reverse a string

import java.util.Scanner;
public class PrintReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Full name: ");
        String name = scanner.nextLine();
        String reverseName = "";

        for (int i = name.length();
             i >= 1; i--) {
            String caract = name.substring(i - 1, i);
            reverseName = reverseName + caract;
        }
        System.out.println(reverseName);
    }
}
