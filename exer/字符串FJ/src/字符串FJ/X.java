package ×Ö·û´®FJ;
import java.util.*;
public class X {
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		System.out.println(get(n));
		
	}
	public static String get(int x)
	{
		char[] a=new char[27];
		int b=65;
		for(int i=1;i<=26;i++)
		{
			a[i]=(char)b;
			b++;
		}
		if(x==1)
			return("A");
		else
			return(get(x-1)+a[x]+get(x-1));
	}

}
