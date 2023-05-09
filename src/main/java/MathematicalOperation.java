import java.util.Scanner;

public class MathematicalOperation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number 1: ");
        double n1 = scanner.nextDouble();
        System.out.println("Number 2: ");
        double n2 = scanner.nextDouble();
        double total;

        //Sum (+)
        total = n1 + n2;
        System.out.println("Sum Total " + total);

        //Subtraction total (-)
        total = n1 - n2;
        System.out.println("Subtraction Total " + total);

        //Multiplication (*)
        total = n1 * n2;
        System.out.println("Multiplication Total " + total);

        //Division (/)
        total = n1 / n2;
        System.out.println("Division Total " + total);

        //Modulus - Rest of Division (%)
        total = n1 % n2;
        System.out.println("Rest of Division Total " + total);

        //Increment (++)
        int i = 1;
        System.out.print("i = "+ i + " with increment i++ = ");
        i++;
        System.out.println(i);

        //Decrement (--)
        int d = 1;
        System.out.print("d = "+ i + " with decrement i-- = ");
        d--;
        System.out.println(d);
    }
}
