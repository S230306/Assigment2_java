package Page1.Page2.Page3;

/* Take x and y as input. Write a function that takes in x
   and y as integer parameters. The function should return
   the lcm of these two numbers. In the end print the final lcm.

Input Format

Take T as an integer input rebresenting number of input.

For each test case.

first line take integer input as x.

second line take integer input as y.

Constraints

1 <= T <= 1000

1 <= x <= 1000

1 <= y <= 1000

Output Format

print the lcm of given numbers.

Sample Input 0

2
10 5
15 20
Sample Output 0

10
60
Explanation 0

LCM of 15 and 20 is 60*/
import java.util.*;

public class Page58 {
    public static void Lcm(int a, int b) {
        // lcm(a,b)=a*b/gcd(a,b);
        int c = a;
        int d = b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int lcm = (d * c) / a;
        System.out.println(lcm);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int idx = 0; idx < n; idx++) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            Lcm(a, b);
        }
    }
}
