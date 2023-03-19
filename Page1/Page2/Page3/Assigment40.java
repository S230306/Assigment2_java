package Page1.Page2.Page3;

/* HW_Print Inverted Right-angled whole numbers
Problem

Take an integer input n and Print the pattern.

Input Format

A single line n take input from user.

Constraints

1<=n<=100

Output Format

Print the pattern.

Sample Input 0

7
Sample Output 0

1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 */
import java.util.*;

public class Assigment40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // loop through each row
        for (int i = n; i >= 1; i--) {
            // print numbers for each column
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
