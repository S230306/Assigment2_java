package Page1.Page2;

/*A beginner programmer named Sarah was tasked to
 write a program to print the quotient and remainder
of two given integers a and b. Sarah took the input
values of a and b from the user and used the division
and modulus operator to compute the quotient and remainder
.She then printed the values in the required format with a
space separator. Through this task, Sarah learned how to use
basic arithmetic operators to perform mathematical
computations and print output in the required format.

Note : Use Function.

Input Format

Two integers a and b

Constraints

1

Output Format

Quotient and remainder separated by space

Sample Input 0

7 2
Sample Output 0

3 1
Explanation 0

7 is divided by 2, so the quotient is 3 and the remainder is 1. */
import java.util.*;

public class Assigment21 {
    public static void printQuotientAndRemainder(int a, int b) {
        int quotient = a / b;
        int remainder = a % b;
        System.out.println(quotient + " " + remainder);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        printQuotientAndRemainder(a, b);
    }
}
