package Page1.Page2;

/*Take an integer input n and then keep on dividing n by 2,
 till the time n is greater than equal to 1.

Each time you divide n by 2, increment steps by 1.

Print the total number of steps in end.

Note : use function.

Input Format

For each test case, take an integer input n.

Constraints

0<=n<=2^31-1

Output Format

Print the number of steps as an integer output.

Sample Input 0

32
Sample Output 0

6
Sample Input 1

20
Sample Output 1

5
Sample Input 2

34
Sample Output 2

6
Sample Input 3

109
Sample Output 3

7
Sample Input 4

512
Sample Output 4

10 */
import java.util.*;

public class Assigment11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int steps = getSteps(n);
        System.out.println(steps);
    }

    public static int getSteps(int n) {
        int steps = 0;
        while (n >= 1) {
            n /= 2;
            steps++;
        }
        return steps;
    }
}