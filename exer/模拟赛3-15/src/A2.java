import java.util.*;
public class A2 {
	public static void main(String[] args) {
		int a=2019;
		int count=0;
		int b,c,d,e;
		for(int i=1;i<=a;i++)
		{
			b=i%10;
			c=i%100/10;
			d=i%1000/100;
			e=i/1000;
			if(b==9||c==9||d==9||e==9)
				count++;
		}
		System.out.print(count);
	}

}
