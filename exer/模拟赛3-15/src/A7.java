import java.util.*;
public class A7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] b=new int[n];
		for(int i=0;i<n;i++) {
			b[i]=input.nextInt();	
		}
		int count=0;
		for(int i=2;i<n;i++) {
			if(b[i]>b[i-1]&&b[i-1]>b[i-2])
				count++;	
		}
		System.out.print(count);
		
	}

}
