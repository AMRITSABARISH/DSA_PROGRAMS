package DSA;
import java.util.*;

public class revnum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			System.out.print(rem);
			num=num/10;
		}
				sc.close();
	}



}
