package Page1.Page2;

/* world cup 2
It is the World Cup Finals. Sonu only finds a match interesting if the skill difference of the competing teams is less than or equal to D.

Given that the skills of the teams competing in the final are X and Y respectively, determine whether Sonu will find the game interesting or not.

Note : use function.

Input Format

The first line of input will contain a single integer T, denoting the number of testcases. The description of T testcases follows. Each testcase consists of a single line of input containing three space-separated integers X, Y, and D — the skill levels of the teams and the maximum skill difference.

Constraints

1<=T<=2000 1<=X,Y<=100 0<=D<=100

Output Format

For each testcase, output "YES" if Chef will find the game interesting, else output "NO" (without the quotes). The checker is case-insensitive, so "YES" and "NO" etc. are also acceptable.

Sample Input 0

3
5 3 4
5 3 1
5 5 0
Sample Output 0

YES
NO
YES
Submissions: 31
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
*/
import java.util.*;

public class Assigment16 {
    public static void wordCup(int x, int y, int d) {
        if (Math.abs(x - y) <= d) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int idx = 0; idx < n; idx++) {
            int x = scn.nextInt();
            int y = scn.nextInt();
            int d = scn.nextInt();
            wordCup(x, y, d);
        }
    }
}