/*Meet Maria, a math teacher who is preparing a lesson plan for
 her students. One of the activities she wants to include is a
 challenge for her students to find all the multiples of 3, 5,
 and both 3 and 5, within a given range. She has decided to
 use a program to generate the list of multiples for her
 students. Can you help Maria write a program that takes in
 an integer n and returns a list of all the multiples of 3, 5,
 and both 3 and 5, starting from 1 and going up to n?

Input Format

The first and the only line of each test case contains an integer n.

Constraints

1<=N<=1000

Output Format

Single line Output

Integer values (Multiples of 3, 5 or Both 3 and 5)

Sample Input 0

15
Sample Output 0

3 5 6 9 10 12 15  */
package Page1;

import java.util.*;

public class Assigment8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int idx = 1; idx <= n; idx++) {
            if (idx % 3 == 0 && idx % 5 == 0) {
                System.out.print(idx + " ");
            } else if (idx % 3 == 0) {
                System.out.print(idx + " ");
            } else if (idx % 5 == 0) {
                System.out.print(idx + " ");
            }
        }
    }
}
