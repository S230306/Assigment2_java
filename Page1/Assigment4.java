/*Fibonacci number 12
Problem
Submissions
Leaderboard
Discussions
You have given an integer n , you have to print first n numbers of the fibonacci series till n.

Input Format

First and only line of input contains integer n denoting the number.

Constraints

1<=n<=1000

Output Format

print fibonacci series till n

Sample Input 0

10
Sample Output 0

0 1 1 2 3 5 8 13 21 34 
Sample Input 1

5
Sample Output 1

0 1 1 2 3  */
package Page1;

import java.util.*;

public class Assigment4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int c = a + b;
        for (int idx = 0; idx < n; idx++) {
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
