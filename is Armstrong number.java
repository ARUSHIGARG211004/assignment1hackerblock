import java.util.*;
public class Main {
    public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int r;
			double sum=0;
			int k=n;
			int c=(int)Math.log10(n)+1;
			while(n!=0){
				r=n%10;
				n=n/10;
				sum=sum+Math.pow(r,c);
			}
			if(sum==k){
				  System.out.println("true");
			}
			else{
				  System.out.println("false");
			}
}
}
