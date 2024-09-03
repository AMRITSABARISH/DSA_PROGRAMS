package DSA;
import java.util.*;
public class oddeven {
	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
		
		sc.close();
	}
	
}
