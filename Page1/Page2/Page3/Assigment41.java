package Page1.Page2.Page3;

/*HW_Print Inverted Right Angled Triangle reversed whole numbers
Problem
Submissions
Leaderboard
Discussions
Take an integer input n and Prin the pattern.

Input Format

A single line n take input from user.

Constraints

1<=n<=100

Output Format

Print the pattern

Sample Input 0

9
Sample Output 0

9 8 7 6 5 4 3 2 1 
9 8 7 6 5 4 3 2 
9 8 7 6 5 4 3 
9 8 7 6 5 4 
9 8 7 6 5 
9 8 7 6 
9 8 7 
9 8 
9 
Sample Input 1

7
Sample Output 1

7 6 5 4 3 2 1 
7 6 5 4 3 2 
7 6 5 4 3 
7 6 5 4 
7 6 5 
7 6 
7 
Submissions: 22
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
 */
import java.util.*;

public class Assigment41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // loop through each row
        for (int i = 1; i <= n; i++) {
            // print numbers for each column
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
