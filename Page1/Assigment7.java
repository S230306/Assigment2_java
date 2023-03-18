package Page1;

import java.util.*;

public class Assigment7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0, b = 1, c;
        int count = 1;

        while (count <= n) {
            if (count % 2 == 1) {
                System.out.print(a + " ");
            }

            c = a + b;
            a = b;
            b = c;
            count++;
        }
    }
}
