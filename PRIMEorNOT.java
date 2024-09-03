package DSA;
import java.util.*;

public class prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		for(int i=2 ;i<n/2;i++) {
		if(n%i==0) {
			flag=1;
			break;
		}
		
		
	}
		if(flag==0) {
			System.out.println("PRIME");
		}
		else {
			System.out.println("NOT A PRIME");
		}
		sc.close();
	}
}
