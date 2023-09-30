//Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.
import java.util.*;
public class =Sumofdigits {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String N=sc.next();
		int odd=0;
		int even=0;
		for(int i=0;i<N.length();i++){
			char digit= N.charAt(i);
			int num=Character.getNumericValue(digit);
			if(i%2==0){
				even+=num;
			}
			else{
				odd+=num;
			}
		}
		System.out.println(odd);
		System.out.println(even);

    }
}
