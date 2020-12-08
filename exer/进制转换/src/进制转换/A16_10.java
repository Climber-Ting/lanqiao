package ½øÖÆ×ª»»;
import java.util.*;
import java.lang.*;
public class A16_10 {
	public static void main(String[] args)
	/*{
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.print(Integer.valueOf(s, 16));
	}*/
	{
		int n=new Scanner(System.in).nextInt();
		String[] a=new String[n];
		for(int i=0;i<n;n++)
		{
			a[i]=new Scanner(System.in).nextLine();
		}	
		for(int j=0;j<n;j++)
		{
			System.out.println(Integer.valueOf(a[j],16));
		}
		
	}
}
