package Page1.Page2.Page3;

/*GKSTR19 Pattern_4
Problem
Submissions
Leaderboard
Discussions
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

* 
* * 
* * * 
* * * * 
* * * * *  */
import java.util.*;

public class Assigment33 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}