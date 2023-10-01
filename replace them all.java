import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
		 String str=sc.next();
		 String result=str.replace('0','5');
		 long c=Long.parseLong(result);
		 System.out.println(c);
}
}
