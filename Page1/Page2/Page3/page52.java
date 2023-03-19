package Page1.Page2.Page3;

/*Swap x and y
Problem
Take two integers x and y as an integer input.

Then take an integer data-type variable c, and with the help of c variable swap x and y.

Process:

First assign value of x to c and print the string with the help of System.out.println("c = " + c),

Then, assign value of y to x and print the string with the help of System.out.println("x = " + x),

Then, assign value of c to y and print the string with the help of System.out.println("y = " + y).

In the next line print the string with the help of System.out.println("x = " + x),

In the next line print the string with the help of System.out.println("y = " + y).

Input Format

Take x as an integer input in the first line,

Take y as an integer input in the second line.

Constraints

-2^31<=x,y<=2^31-1

Output Format

Print according to the problem statement.

Sample Input 0

10
20
Sample Output 0

c = 10
x = 20
y = 10
x = 20
y = 10
Sample Input 1

35
65
Sample Output 1

c = 35
x = 65
y = 35
x = 65
y = 35
Sample Input 2

200
300
Sample Output 2

c = 200
x = 300
y = 200
x = 300
y = 200
Sample Input 3

250
450
Sample Output 3

c = 250
x = 450
y = 250
x = 450
y = 250
Sample Input 4

40
90
Sample Output 4

c = 40
x = 90
y = 40
x = 90
y = 40
Submissions: 31
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
 */
import java.util.*;

public class page52 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        // swapping Operation.
        int c = x;
        x = y;
        y = c;
        System.out.println("c = " + c);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
