package Page1.Page2;

/* */
import java.util.*;

public class Assigment18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int steps = -1;
        while (x <= y) {
            x *= 5;
            steps++;
        }
        System.out.println(steps);
    }
}
