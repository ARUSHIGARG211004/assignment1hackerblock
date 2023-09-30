import java.util.*;
public class Countdigit {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int digit=sc.nextInt();
		while(n>0){
			if(n%10==digit){
				count++;
			}
			n=n/10;
		}
		System.out.println(count);

    }
}
