/*Reverse The String

Meet Sarah, a software developer who is working on a new project for her company. One of the tasks she has been assigned is to write a program using function that takes in a string and returns the string in reverse order. Can you help Sarah come up with an algorithm to solve this problem?

Input Format

The first and the only line of each test case is a string.

Constraints

1<=str.length()<=10^4

Output Format

Print the string after reversing the input string.

Sample Input 0

geekster
Sample Output 0

retskeeg */
package Page1;

import java.util.*;

public class Assigment3 {
    public static String reverseString(String str) {
        String rev = "";
        for (int idx = str.length() - 1; idx >= 0; idx--) {
            char ch = str.charAt(idx);
            rev += ch;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.print(reverseString(str));
    }
}
