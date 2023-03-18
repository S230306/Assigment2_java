package Page1.Page2;

/*Write a program to calculate the total salary of a person. 
The user has to enter the basic salary (an integer) and the grade
(an uppercase character), and depending upon which the total 
salary is calculated as -

totalSalary = basic + hra + da + allow – pf
    where :
hra = 20% of basic

da = 50% of basic

allow = 1700 if grade = ‘A’

allow = 1500 if grade = ‘B’

allow = 1300 if grade = ‘C' or any other character

pf = 11% of basic.

Round off the total salary and then print the integral part only.

Note: use functions.

Input Format

Basic salary & Grade (separated by space)

Constraints

0 <= Basic Salary <= 7,500,000

Output Format

Total Salary

Sample Input 0

10000 A
Sample Output 0

17600
Sample Input 1

4567 B
Sample Output 1

8762
Sample Input 2

3159 C
Sample Output 2

6323 */
import java.util.*;

public class Assigment17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int basic = scn.nextInt();
        char grade = scn.next().charAt(0);
        double hra = 0.2 * basic;
        double da = 0.5 * basic;
        double allow = 0;
        double pf = 0.11 * basic;

        switch (grade) {
            case 'A':
                allow = 1700;
                break;
            case 'B':
                allow = 1500;
                break;
            default:
                allow = 1300;
                break;
        }

        double totalSalary = basic + hra + da + allow - pf;
        int roundedSalary = (int) Math.round(totalSalary);
        System.out.println(roundedSalary);
    }
}