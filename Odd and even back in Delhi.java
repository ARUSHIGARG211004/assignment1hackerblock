import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        for (int i = 0; i < n; i++) {
            int N = sc.nextInt();
            int even = 0;
            int odd = 0;
            int c = N; 
            
            while (c> 0) {
                int digit = c % 10;
                if (digit % 2 == 0) {
                    even += digit;
                } else {
                    odd += digit;
                }
                c /= 10;
            }
            
            if (even % 4 == 0 || odd % 3 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
