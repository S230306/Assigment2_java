package Page1.Page2.Page3;

/* HW_Print Inverted Right Angled Triangle Pattern
Problem
Take an Integer input n and Print the pattern given below.

Input Format

A single line n take input from user.

Constraints

1<=n<=100

Output Format

Print the pattern .

Sample Input 0

7
Sample Output 0

*******
******
*****
****
***
**
*
Explanation 0

Pattern for n=7*/
import java.util.*;

public class Assigment38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // loop through each row
        for (int i = n; i >= 1; i--) {
            // print * for each column in the row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
