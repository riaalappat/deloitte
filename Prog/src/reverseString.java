
import java.util.*;
public class reverseString {
	public static void main(String [] args) {
		String str;
		char c;
		int count=0;
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		int n=str.length();
		System.out.println("String is:"+str);
		System.out.println("Reverse is:");
		for (int i=n-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		for(int i=0;i<n;i++) {
			c=str.toUpperCase().charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				count++;
			}
		}
	System.out.println("\n count is:"+count);
	}
	
}
