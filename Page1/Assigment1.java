package Page1;

/*First take n as an integer input.

Then you will be given n integers as integer inputs and each time you have to print "even" if the number is an even number and "odd" if the number is an odd number.

Input Format

For each test case, You will be given an integer n of int data-type in the first line, After this you will be given n integers each of int data-type in separate lines.

Constraints

0<=n<=2^31-1 -2^31<=each of the n integers that have to be checked<=2^31-1

Output Format

Print the string "even" or "odd" accordingly in separate lines

Sample Input 0

3
10
13
14
Sample Output 0

even
odd
even
Sample Input 1

5
10
13
14
11
100
Sample Output 1

even
odd
even
odd
even
Sample Input 2

7
-10
13
-244
-11
100
-77
90
Sample Output 2

even
odd
even
odd
even
odd
even */
import java.util.*;

public class Assigment1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int idx = 0; idx < n; idx++) {
            if (idx % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}