package Page1.Page2.Page3;

/*HW_Check Odd
Problem
Take x as an integer input. Make a function that takes in x
 as an integer parameter . Write a function that prints if a 
 number is odd or not.

Input Format

An integer T representing T number of test cases

For each test case

A single line takes integer input from user as x.

Constraints

1 <= T <= 10^4

1 <= x <= 10^4

Output Format

if number is odd print "YES"

Otherwise Print "NO"

Sample Input 0

4
5
2 
3
6
Sample Output 0

YES
NO
YES
NO
Explanation 0

5 is odd so, Print YES

Sample Input 1

2
199
200
Sample Output 1

YES
NO */
import java.util.*;

public class Page55 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int idx = 0; idx < n; idx++) {
            int num = scn.nextInt();
            if (num % 2 != 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
