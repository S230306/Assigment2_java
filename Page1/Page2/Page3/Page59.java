package Page1.Page2.Page3;

/* Reverse a 3 digit number
Problem
Submissions
Leaderboard
Discussions
Same as the description.

Input Format

The first line of input will contain an integerT — the number
of test cases. The description of T test cases follows.

For each test case,

a three digit number will be given as an input.

Constraints

100<=3 digit number<=999

Output Format

Print the final reverse 3 digit number as an integer output.

Sample Input 0

3
234
123
456
Sample Output 0

432
321
654
Sample Input 1

2
345
111
Sample Output 1

543
111*/
import java.util.*;

public class Page59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // input number
            int reverse = 0;
            while (n != 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n /= 10;
            }
            System.out.println(reverse);
        }
    }
}