package Page1.Page2.Page3;

/* Take two integer inputs x and y. Then print the gcd of
 these two numbers as an integer output.

Input Format

T will be given as an integer input representing the number 
of test cases.

For each test case,

x will be given as an integer input in the first line,

y will be given as an integer input in the second line.

Constraints

1<=x,y<=2^10

Output Format

Print the gcd as an integer output.

Sample Input 0

2
100 35
20 7
Sample Output 0

5
1
Sample Input 1

1
300 20
Sample Output 1

20*/
import java.util.*;

public class page54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int gcd = findGCD(x, y);
            System.out.println(gcd);
        }
    }

    public static int findGCD(int x, int y) {
        if (y == 0) {
            return x;
        }
        return findGCD(y, x % y);
    }
}