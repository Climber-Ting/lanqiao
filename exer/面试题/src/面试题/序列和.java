package 面试题;
import java.util.*;
public class 序列和 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		int L=input.nextInt();
		if(L>100) {
			System.out.print("No");
		}
		else {
			for(int i=L;i<=100;i++) {
				int a=2*N-i*i+i;
				if(a%(2*i)==0) {
					System.out.print(a/(2*i));
					int c=a/(2*i);
					for(int j=2;j<=i;j++) {
						c++;
						System.out.print(" "+c);
					}
					break;
				}
				while(i==100) {
					System.out.print("No");
				}
			}
		}
	}
}
