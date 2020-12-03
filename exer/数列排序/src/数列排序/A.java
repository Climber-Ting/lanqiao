package ÊıÁĞÅÅĞò;
import java.util.*;
public class A {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		if(n<1||n>200)
			return;
		int[] a=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			a[i]=input.nextInt();
		}
		for(int i=2,j;i<=n;i++)
		{
			a[0]=a[i];
			j=i-1;
			while(a[0]<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=a[0];
		}
		for(int i=1;i<=n;i++)
			System.out.print(a[i]+" ");
	}
}
