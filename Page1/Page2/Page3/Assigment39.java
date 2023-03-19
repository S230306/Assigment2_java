package Page1.Page2.Page3;

/*Hw_Print Spaced Right-angled whole numbers
Problem
Take an integer input n and Print the pattern.

Input Format

A single line n take input from user.

Constraints

1<=n<=100

Output Format

Print the pattern.

Sample Input 0

5
Sample Output 0

        1 
      1 2 
    1 2 3 
  1 2 3 4 
1 2 3 4 5  */
import java.util.*;

public class Assigment39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // loop through each row
        for (int i = 1; i <= n; i++) {
            // print spaces for each column before the numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // print numbers for each column after the spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
