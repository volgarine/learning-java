//In Java, parse is a method that can be used to convert a string representation of a data type to the corresponding primitive data type.
//below are some examples

public class ParseExamples {
    public static void main(String[] args) {

        String numInt = "300";
        String  numDouble = "300.50";
        int num = 30;

        //convert string to int
        int strToInt = Integer.parseInt(numInt) + 200;
        System.out.println("converted from string to int: "+ strToInt);

        //convert string to double
        double strToDouble = Double.parseDouble(numDouble) + 0.50;
        System.out.println("converted from string to double: "+ strToDouble);

        //convert int to string
        String numToStr = String.valueOf(num);
        System.out.println("converted from int to string: "+ numToStr);

    }
}
