package Page1;

/*You will be given three integer inputs n,k and l and you to 
  print the series n, n-k, n-2k, n-3k.... till last where the
  value printed in the end should be just greater than or equal
  to the given input l.

To be clear:You will print l if l belongs to the series.

Input Format

For each test case, you will get

n in the first line as an integer input,

k in the second line as an integer input,

l in the third line as an integer input.

Constraints

0<=n,k<2^10

-2^31<=l<=2^31-1

Output Format

You have to print the series where each number should be printed
in a separate line.

Sample Input 0

50
5
4
Sample Output 0

50
45
40
35
30
25
20
15
10
5
Sample Input 1

70
9
10
Sample Output 1

70
61
52
43
34
25
16
Sample Input 2

60
6
14
Sample Output 2

60
54
48
42
36
30
24
18
Sample Input 3

22
4
6
Sample Output 3

22
18
14
10
6
Sample Input 4

42
7
18
Sample Output 4

42
35
28
21 */
import java.util.*;

public class Assigment9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int l = scn.nextInt();
        for (int idx = n; idx >= l; idx -= k) {
            System.out.println(idx + " ");
        }
    }
}
