/*HW_FizzBuzz problems

The rules of the FizzBuzz game are given below:

If a given number is divisible by 3 then the program should print "Fizz".
If a given number is divisible by 7 then the program should print "Buzz".
If a given number is divisible by both 3 and 7 then the program should print "FizzBuzz".
Otherwise print the given number as it is.
Input Format

For each test case, you will get n as an integer input.

Constraints

1<=n<=1000

Output Format

Print the output in a single line.

Sample Input 0

21
Sample Output 0

1 2 Fizz 4 5 Fizz Buzz 8 Fizz 10 11 Fizz 13 Buzz Fizz 16 17 Fizz 19 20 FizzBuzz 
Explanation 0

Print the output according to given condition. */
package Page1;

import java.util.*;

public class Assigment6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int idx = 1; idx <= n; idx++) {
            if (idx % 3 == 0 && idx % 7 == 0) {
                System.out.print("FizzBuzz" + " ");
            } else if (idx % 7 == 0) {
                System.out.print("Buzz" + " ");
            } else if (idx % 3 == 0) {
                System.out.print("Fizz" + " ");
            } else {
                System.out.print(idx + " ");
            }
        }
    }
}
