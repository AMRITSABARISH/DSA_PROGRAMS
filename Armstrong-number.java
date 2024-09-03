package DSA;
import java.util.*;

public class armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int tot=0,temp=num;
		int len=String.valueOf(temp).length();
		while(num>0) {
		int digit=num%10;
		tot+=Math.pow(digit, len);
		num/=10;
		
		
	}
		if(temp==tot) {
			System.out.println(temp+" "+"is armstrong");
		}
		else {
			System.out.println(temp+" "+"is not a armstrong");
		}
		sc.close();

}
}
