//prime number or not
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("Not Prime");
        } else {
            int t=1;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    t=0;
                    break;
                }
            }

            if (t==1) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }

        
    }
}
