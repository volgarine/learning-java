import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // Example 1: loop to print the numbers from 1 to 5
        System.out.println("Example 1:");
        int a = 1;
        while (a <= 5) {
            System.out.println(a);
            a++;
        }
            System.out.println("---------------------------------");
//---------------------------------------------------------------------------
        // Example 2: print SUM 1 to 10
        System.out.println("Example 2:");
        int i = 1;
        int sum = 0;

        while (i <= 10){
            System.out.println(i + " + " + sum);
            sum = sum + i;
            System.out.println("     = " + sum);
            i++;
        }
        System.out.println("Sum from 1 to 10: " + sum);
        System.out.println("---------------------------------");
//---------------------------------------------------------------------------
        // Example 3: enter a number and sum by 2 until it exceeds 100
        System.out.println("Example 3:");
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while(num < 1 || num > 100){
            System.out.println("Enter a number until 100:");
            num = scanner.nextInt();
        }
        while(num < 100){
            System.out.println(num + " + 2");
            num = num + 2;
        }
        System.out.println("---------------------------------");
//---------------------------------------------------------------------------
    }
}
