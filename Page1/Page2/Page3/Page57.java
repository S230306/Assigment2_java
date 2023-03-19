package Page1.Page2.Page3;

/* Take the length as l and breadth as b of a rectangle as
    input. Write a function that takes length and breadth as
    integer parameters and returns the area of the rectangle
    Print the final area returned.

Input Format

first line takes user input length as l.

second line takes user input breadth as b.

Constraints

1<=l<=1000

1<=b<=1000

Output Format

Print the area of rectangle.

Sample Input 0

4
4 6
2 4
6 8
9 6
Sample Output 0

24
8
48
54
Sample Input 1

2
10 12
2 7
Sample Output 1

120
14*/
import java.util.*;

public class Page57 {
    public static void PrintArea(int x, int y) {
        int area = x * y;
        System.out.println(area);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int idx = 0; idx < n; idx++) {
            int x = scn.nextInt();
            int y = scn.nextInt();
            PrintArea(x, y);
        }
    }
}
