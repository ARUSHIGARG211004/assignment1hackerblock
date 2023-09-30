//binary to decimal conversion.
import java.util.*;
public class binary{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String N=sc.next();
		int decimal=Integer.parseInt(N,2);
		System.out.println(decimal);
	}
}
