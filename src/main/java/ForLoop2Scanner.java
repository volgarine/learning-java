import java.util.Scanner;

public class ForLoop2Scanner {
    public static void main(String[] args) {

        //Enter 5 numbers (using for) and print their sum
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers to sum");
        int total = 0;
        for (int i = 1; i < 6; i++){
            int number = scanner.nextInt();
            total = total + number;
        }
        System.out.println(total);

    }
}
