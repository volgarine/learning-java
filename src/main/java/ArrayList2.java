//This example saves the user's attempts to match the number 6 between 1 and 10 numbers in arraylist
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList2 {
    public static void main (String[]args){

        ArrayList<Integer> listaDeNumeros = new ArrayList<>(); //create arraylist (always empty)
        Scanner scanner = new Scanner(System.in);//create Scanner (input) from user

        int valorLido = 0; // variable to be checked in WHILE

        while (valorLido  != 6) { // condition: while the value is not 6, ask to add another number
            System.out.println("Between 1 and 10, try to hit the key number: ");
            valorLido = scanner.nextInt(); // read and save value added by user
            if (valorLido != 6){ // checks if added is <> 6 to show list of user attempts to hit 6 that are saved in ArrayList
                listaDeNumeros.add(valorLido);
            }
        }

        // loop to scan the ArrayList printing each saved number that was added by the user
        if(listaDeNumeros.size() ==0){
            System.out.println("--------------------------------------------------------");
            System.out.println("Congrats!!! >>>> You got it right the first time.");
        } else {
            System.out.println("--------------------------------------------------------");
            System.out.println("You got it, but you tried "+ listaDeNumeros.size() + " times. Check it out:");
            for (int i = 0; i < listaDeNumeros.size(); i++){
                System.out.println(listaDeNumeros.get(i));
            }
        }
    }
}