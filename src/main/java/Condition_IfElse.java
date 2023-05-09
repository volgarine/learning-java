import java.util.Scanner;

public class Condition_IfElse
{
    //a condition to check when a person is of legal age OR not and display a message
    public static void main(String[] args) {
        Scanner scannerAge = new Scanner(System.in); //creates the reader to enter the age
        System.out.println("What is your age?");
        int age = scannerAge.nextInt(); //the value read by the user enters the age variable

        if (age == 18){
            System.out.println("You are 18, so you can drink beer");
        }else if (age > 18){
            System.out.println("You are over 18 years of age, so drink beer!");
        }else{
            System.out.println("Drink milk! You are not 18 years old.");
        }
        scannerAge.close();
    }
}
