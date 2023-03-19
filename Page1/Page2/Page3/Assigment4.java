package Page1.Page2.Page3;

/*Find product of the two numbers using function.
Problem
Submissions
Leaderboard
Discussions
The process goes like:

First take in two integer inputs x and y.

Then make a function findProduct(int x, int y) which takes
in an integer as an input then print the product of x and y.

Input Format

T will be given as an integer input which represents the number of test cases.

For each test case,

x will be given as an integer input in the first line,

y will be given as an integer input in the second line.

Constraints

1 <= T <= 2^10

-2^10 <= x , y <= 2^10

Output Format

Print the final product as an integer input.

Sample Input 0

3
2 3
5 5
4 6
Sample Output 0

6
25
24
Sample Input 1

1
3 4
Sample Output 1

12 */
import java.util.*;

public class Assigment4 {
    public static void printProduct(int n, Scanner scn) {
        for (int idx = 0; idx < n; idx++) {
            int x = scn.nextInt();
            int y = scn.nextInt();
            System.out.println(x * y);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printProduct(n, scn);
    }
}
