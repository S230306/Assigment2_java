package Page1.Page2.Page3;

/* Swap x y z
Problem

Take in three integer inputs x, y and z. Assign the value of
x to y, y to z, z to x. Then print the value of x, y, z in
separate lines.

Input Format

For each test case,

x will be given in the first line,

y will be given in the second line,

z will be given in the third line.

Constraints

-2^31<=x,y,z<=2^31-1

Output Format

Print the value of x in the first line,

print the value of y in the second line,

print the value of z in the third line.

Sample Input 0

10
20
30
Sample Output 0

30
10
20
Sample Input 1

15
25
35
Sample Output 1

35
15
25
Sample Input 2

100
200
300
Sample Output 2

300
100
200*/
import java.util.*;

public class page53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int temp = x;
        x = z;
        z = y;
        y = temp;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
