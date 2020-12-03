package ÊıÁĞÌØÕ÷;
import java.util.*;
public class B {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] a =new int[n+1];
		for(int i=1;i<=n;i++)
		{
			a[i]=input.nextInt();
		}
		int max=a[1],min=a[1],sum=0;
		for(int j=1;j<=n;j++)
		{
			if(a[j]<min)
				min=a[j];
			if(a[j]>max)
				max=a[j];
			sum+=a[j];
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
	}

}
