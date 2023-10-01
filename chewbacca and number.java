import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		Long x=sc.nextLong();
		
		long re=0,mul=1;
		while(x>0){
			Long d=x%10;
			if((d>=5)&&(x!=9)){
				long dig=9-d;
				re=re+mul*dig;}
			else re=re+mul*d;
			mul*=10;
			x/=10;
}
System.out.println(re);
			
		
		}
    }

