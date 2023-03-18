package Page1.Page2;

/*Three numbers A, B and C are the inputs. Write a program to find second largest among them.

Input Format

For each test case, you will get

A in the first line as an integer input,

B in the second line as an integer input,

C in the third line as an integer input.

Constraints

1<=A,B,C<=1000000

Output Format

display the second largest among A, B and C, in a new line.

Sample Input 0

120 11 400
Sample Output 0

120
Submissions: 27
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
 */
import java.util.*;

public class Assigment19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int secondLargest = 0;
        if (A > B) {
            if (A > C) {
                if (B > C) {
                    secondLargest = B;
                } else {
                    secondLargest = C;
                }
            } else {
                secondLargest = A;
            }
        } else {
            if (B > C) {
                if (A > C) {
                    secondLargest = A;
                } else {
                    secondLargest = C;
                }
            } else {
                secondLargest = B;
            }
        }

        System.out.println(secondLargest);
    }
}
