/*Pattern 2 - Print n x 12 star rectangle
Problem
Submissions
Leaderboard
Discussions
Take n as an integer input and then print a star rectangle 
such that each line has n stars.

Also, there are 12 such lines.

Input Format

For each test case, take n as an integer input.

Constraints

0<=n<=2^31-1

Output Format

Print according to the problem statement.

For reference, check out the sample test case below.

Sample Input 0

6
Sample Output 0

******
******
******
******
******
******
******
******
******
******
******
******
Sample Input 1

8
Sample Output 1

********
********
********
********
********
********
********
********
********
********
********
********
Sample Input 2

3
Sample Output 2

***
***
***
***
***
***
***
***
***
***
***
***
Sample Input 3

3
Sample Output 3

***
***
***
***
***
***
***
***
***
***
***
***
Sample Input 4

3
Sample Output 4

***
***
***
***
***
***
***
***
***
***
***
***
Sample Input 5

4
Sample Output 5

****
****
****
****
****
****
****
****
****
****
****
****
Submissions: 43
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
 */
package Page1.Page2.Page3;

import java.util.*;

public class Assigment31 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int idx = 1; idx <= 12; idx++) {
            for (int jdx = 1; jdx <= n; jdx++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
