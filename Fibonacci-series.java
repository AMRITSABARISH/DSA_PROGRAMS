

package DSA;
import java.util.*;
public class fibo {
	public static void main(String[] args) {
		int a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<n;i++) {
			c=a+b;
			
			System.out.println(c);
			a=b;
			b=c;
				
		}
		sc.close();
	}

}
