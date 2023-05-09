public class Print {

    public static void main(String[] args) { // shortcut: psvm

        System.out.println("Print the text and jump a line: println"); //shortcut: sout
        System.out.println("------------------------------------------------------------");
        System.out.print("print the text");
        System.out.print(" without jump a line: print");
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        int number = 200;
        System.out.println("Print variable: " + number);
        System.out.println("------------------------------------------------------------");
        System.out.println("Jump a line \n using \\n"); // double \\ print just \
        System.out.println("------------------------------------------------------------");
        System.out.println("Space like a \t TAB using \\t");
        System.out.println("------------------------------------------------------------");
        System.out.println("Hello World! \r hides the text before \\r");
        System.out.println("------------------------------------------------------------");
        System.out.println("Put quotation marks \"inside the String\" using \\\" ");
        System.out.println("------------------------------------------------------------");

        // Now we will see the printf method. This method displays the formatted data
        // %s = show the string inside “”
        // %n = like an enter / skip a line
        System.out.printf("%s%n%s%n", "Welcome to", "Java Programming!");
        System.out.println("------------------------------------------------------------");

        // How to format a broken result to have 2 decimal places (2f)
        double total = 0.234589;
        System.out.println("Format from: "+ total + " to: " + String.format("%.2f", total));






    }

}
