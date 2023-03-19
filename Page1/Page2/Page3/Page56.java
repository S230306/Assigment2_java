package Page1.Page2.Page3;

/*HW_print all even number
Problem

Take x and y as input. Write a function that takes in x and
 y as integer parameters and prints all the even numbers
  between x and y (x and y both inclusive)

Input Format

Take integer T as an integer input which represents the number
 of testcases.

for each test cases:-

first line take an integer input from user as x.

second line take an integer input from user as y.

Constraints

1 <= T <= 10^4

1 <= x <= 1000

1 <= y <= 10^4

Output Format

Print all even number between given intervals.

Sample Input 0

2
1 10
3 15
Sample Output 0

2 4 6 8 10 
4 6 8 10 12 14 
Explanation 0

Print all even numbers between 1 and 10

Sample Input 1

1
19 100
Sample Output 1

20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100 
Submissions: 21
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
 
 */
import java.util.*;

public class Page56 {
    public static void EveninRange(int x, int y) {
        for (int idx = x; idx <= y; idx++) {
            if (idx % 2 == 0) {
                System.out.print(idx + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int idx = 0; idx < n; idx++) {
            int x = scn.nextInt();
            int y = scn.nextInt();
            EveninRange(x, y);
        }
    }
}
