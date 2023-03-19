package Page1.Page2.Page3;

/*HW_GKSTR17 Pattern_2
Take Integer N as input and print the following pattern.

image

Input Format

Single Line Input

Integer Value
Constraints

1<=N<=100

Output Format

N Line of Pattern as shown in problem statement.

Sample Input 0

5
Sample Output 0

1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
Max Score: 10
Difficulty: Easy
Rate This Challenge:

 */
import java.util.*;

public class Assigment15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int idx = 1; idx <= n; idx++) {
            for (int jdx = 1; jdx < idx + 1; jdx++) {
                System.out.print(jdx + " ");
            }
            System.out.println();
        }
    }
}