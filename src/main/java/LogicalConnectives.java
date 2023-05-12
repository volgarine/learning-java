public class LogicalConnectives {
    public static void main(String[] args) {

        // In Java, logical connectives are operators that are used to combine Boolean expressions and return a Boolean result.
        // Here are some examples ↓↓↓↓↓↓↓

        //AND operator (&&): Returns true if both operands are true.
        boolean x = true;
        boolean y = false;
        boolean z = x && y; // z will be false
        System.out.println("If X = true AND (&&) Y = false then Z = " + z);
        System.out.println("------------------------------------------------");

        //OR operator (||): Returns true if at least one operand is true.
        x = true;
        y = false;
        z = x || y; // z will be true
        System.out.println("If X = true OR (||) Y = false then Z = " + z);
        System.out.println("------------------------------------------------");

        //NOT operator (!): Returns the opposite of the operand. If the operand is true, the ! operator returns false, and if the operand is false, the ! operator returns true.
        x = true;
        y = !x; // y will be false
        System.out.println("X = true but with (!) return the opposite " + y);
        System.out.println("------------------------------------------------");

        // Conditional AND operator (&): Returns true if both operands are true. Unlike &&, this operator always evaluates both operands.
        x = true;
        y = false;
        z = x & y; // z will be false
        System.out.println("If X = true AND (&) Y = false then Z = " + z);
        System.out.println("------------------------------------------------");

        //Conditional OR operator (|): Returns true if at least one operand is true. Unlike ||, this operator always evaluates both operands.
        x = true;
        y = false;
        z = x | y; // z will be true
        System.out.println("If X = true OR (|) Y = false then Z = " + z);
        System.out.println("------------------------------------------------");

        // Exclusive OR operator (^): Returns true if the operands are different.
        x = true;
        y = false;
        z = x ^ y; // z will be true
        System.out.println("If X = true OR (ˆ) Y = false then Z = " + z);

        //These logical connectives can be used to create complex Boolean expressions that evaluate to true or false based on the values of the operands.
    }
}

