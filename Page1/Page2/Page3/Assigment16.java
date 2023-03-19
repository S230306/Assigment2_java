package Page1.Page2.Page3;

/*GKSTR20 Pattern_5
Problem
Take Integer N as input and print the following pattern.

image

Input Format

Single Line Input

Integer Value
Constraints

1<=N<=100

Output Format

N Line of Pattern as shown in problem statement.

Note: No space in between stars.

Sample Input 0

5
Sample Output 0

    *
   **
  ***
 ****
*****
Submissions: 33
Max Score: 10
Difficulty: Easy
Rate This Challenge:

    
More
 */
import java.util.*;

public class Assigment16 {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sp = n - 1, st = 1;
      for (int idx = 1; idx <= n; idx++) {
         for (int jdx = 1; jdx <= sp; jdx++) {
            System.out.print(" ");
         }
         for (int jdx = 1; jdx <= st; jdx++) {
            System.out.print("*");
         }
         System.out.println();
         sp--;
         st++;
      }
   }
}
