//find the gcd of a two numbers.
import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		while(N1!=N2){
            if(N1>N2){
				N1=N1-N2;
			}
			else{
				N2=N2-N1;
			}
		}
		System.out.println(N2);

    }
}
