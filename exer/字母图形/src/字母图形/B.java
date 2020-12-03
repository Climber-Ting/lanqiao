package ×ÖÄ¸Í¼ÐÎ;
import java.util.*;
public class B {
	public static void main(String[] args)
	{
		char[] a=new char[26];
		int b=65;
		for(int i=0;i<26;i++)
		{
			a[i]=(char)b;
			b++;
		}
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		for(int i=0;i<=n-1;i++)
		{
			for(int j=i;i-j<m&&j>=0;j--)
			{
				System.out.print(a[j]);
				if(j==0)
					for(int t=1;t<=m-i-1;t++)
						System.out.print(a[t]);
					
					
			}
			System.out.print("\n");
		}	
	}
}
