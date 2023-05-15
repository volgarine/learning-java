/*Nested Loops
        It is also possible to place a loop inside another loop. This is called a nested loop.
        The "inner loop" will be executed one time for each iteration of the "outer loop":*/
public class LoopFor3Nested {

    public static void main(String[] args) {

    // outer loop
    for (int i = 1; i <= 2; i++){
        System.out.println("Outer(i): " + i);

    // inner loop
        for (int j = 1; j <=3; j++){
            System.out.println("     Inner(j): " + j);
        }
    }
    }
}
