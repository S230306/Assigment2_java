package Page1.Page2;

/*HW_Print A.P
Given the first term (a), common difference (d) and an integer
n of the Arithmetic Progression series, the task is to print the
series using function. 

Note : use Function.

Input Format

5

2

10

Constraints

1<=a<=10000
1<=b<=9999
1<=n<100
Output Format

5 7 9 11 13 15 17 19 21 23

Sample Input 0

5
10
10
Sample Output 0

5 15 25 35 45 55 65 75 85 95  */
import java.util.*;

public class Assigment13 {

    public static void printAirthmaticP(int a, int d, int n, int[] arr) {
        for (int idx = 0; idx < n; idx++) {
            int nth = arr[idx];
            int airthmatic = a + (nth * d - d);
            System.out.print(airthmatic + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int d = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        printAirthmaticP(a, d, n, arr);
    }
}
