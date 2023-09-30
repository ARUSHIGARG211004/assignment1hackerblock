//lcm of two number
import java.util.*;
public class lcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int n1 = scanner.nextInt();

        
        int n2 = scanner.nextInt();

        int max = (n1 > n2) ? n1 : n2;
        int min = (n1 < n2) ? n1 : n2;

        int lcm = max;

        while (true) {
            if (lcm % min == 0) {
                System.out.println(lcm);
                break;
            }
            lcm += max;
        }

        
    }
}
