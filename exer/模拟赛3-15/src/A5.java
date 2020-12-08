import java.util.*;
public class A5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();		
		int count=0;
		for(int i=1;i<=n;i++) {
			String a=String.valueOf(i);
			if(pd(a)==true)
				count++;
		}
		System.out.print(count);
		
	}
		static boolean pd(String a) {
		char[] b=a.toCharArray();
		int c=a.length();
		int count=0;
		for(int i=1;i<c;i++) 
			if(b[i]>=b[i-1])
				count++;
		if(count==c-1)
			return true;
		else
			return false;			
	}
}
