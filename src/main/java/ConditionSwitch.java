import java.util.Scanner;
public class ConditionSwitch {
    public static void main(String[] args) {
        System.out.println("Welcome to JAVA Coffee House! \n Choose your drink:");
        System.out.println("(1) Americano");
        System.out.println("(2) Brewed Coffee");
        System.out.println("(3) Caffe Latte");
        System.out.println("(4) Caffe Mocha");
        System.out.println("(5) Cappuccino");
        System.out.println("(6) Chai Latte");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println("Your order is Americano $1.50");
                break;
            case 2:
                System.out.println("Your order is Brewed Coffee $3");
                break;
            case 3:
                System.out.println("Your order is Caffe Latte $3.50");
                break;
            case 4:
                System.out.println("Your order is Caffe Mocha $4.00");
                break;
            case 5:
                System.out.println("Your order is Cappuccino $4.50");
                break;
            case 6:
                System.out.println("Your order is Chai Latte $2.50");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
/*
In Java, the switch statement is a type of conditional statement that allows you to execute
different blocks of code based on the value of a single variable or expression.

The switch statement can be a useful alternative to a series of if-else statements
        when you have a single variable or expression that can take on multiple values.
*/
