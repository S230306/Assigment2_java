package Page1;

/*John, a software developer, was tasked with writing a program
 to print the vowels in a given string. He created a loop to 
 iterate over each character and check if it was a vowel.
 He tested it and it worked perfectly.

Input Format

For each test case, you will get a string str.

Constraints

1<=n<=10^4 String str contains only lower-case characters.

Output Format

Print the all volwels in a seperate line.

Sample Input 0

apple
Sample Output 0

a
e
Explanation 0

Vowel in the string apple is a and e.*/
import java.io.*;
import java.util.*;

public class checkVowel {

    public static void printVowel(String str) {
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printVowel(str);
    }
}
