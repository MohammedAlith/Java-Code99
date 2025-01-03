package operator.com;
public class operators
{

    public static void main(String[] args) {


        // 1. Arithmetic Operators
        int a = 10;
        int b = 10;

        System.out.println("Arithmetic Operators:");


        System.out.println((a + b) + "completed");


        // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction

        System.out.println("a * b = " + (a * b));  // Multiplication\

        System.out.println("a / b = " + (a / b));  // Division  (Quotient)

        System.out.println("a % b = " + (a % b));  // Modulus (Remainder)


        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));  // Equal to

        System.out.println("a != b: " + (a != b));  // Not equal to


        System.out.println("a > b: " + (a > b));    // Greater than
        System.out.println("a < b: " + (a < b));    // Less than
        System.out.println("a >= b: " + (a >= b));  // Greater than or equal to
        System.out.println("a <= b: " + (a <= b));  // Less than or equal to


        // 3. Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));  // Logical AND
        System.out.println("x || y: " + (x || y));  // Logical OR
        System.out.println("!x: " + (!x));          // Logical NOT

        // 5. Assignment Operators
        int e = 10;

        System.out.println("\nAssignment Operators:");


        e += 5;  // e = e + 5


        System.out.println("e += 5: " + e);
        e -= 3;  // e = e - 3
        System.out.println("e -= 3: " + e);
        e *= 2;  // e = e * 2
        System.out.println("e *= 2: " + e);
        e /= 2;  // e = e / 2
        System.out.println("e /= 2: " + e);
        e %= 3;  // e = e % 3
        System.out.println("e %= 3: " +e);



    }}
