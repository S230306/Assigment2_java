package Page1.Page2;

/*HW_If triangle is possible.
Problem
Submissions
Leaderboard
Discussions
Three sides A, B and C will be given . Return True if
 triangle is valid otherwise False.

Note : Use Function.

Input Format

Given three sides of triangle A,B and C.

Constraints

1<=A<100 1<=B<100 1<=C<100

Output Format

Print "true"if triangle is valid otherwise "false".

Sample Input 0

7 10 5
Sample Output 0

true
Explanation 0

7+10>5 So,triangle is possible */
import java.util.*;

public class Assigment20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        boolean isPossible = checkTriangle(A, B, C);
        System.out.println(isPossible);
    }

    static boolean checkTriangle(int A, int B, int C) {
        if (A + B > C && A + C > B && B + C > A) {
            return true;
        }
        return false;
    }
}
