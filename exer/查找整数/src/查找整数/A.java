package ²éÕÒÕûÊı;
import java.util.*;
public class A {
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int[] a=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			a[i]=input.nextInt();
		}
		int b=input.nextInt();
		for(int j=1;j<=n;j++)
			if(a[j]==b)
			{
				System.out.print(j);
				break;
			}
			else
				if(j==n)
					System.out.print("-1");
	}
}
