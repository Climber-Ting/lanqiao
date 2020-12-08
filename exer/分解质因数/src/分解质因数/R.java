package 分解质因数;
import java.util.*;
public class R {
	static int isprime(int a)
	{
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
				return 0;
		}
		return 1;
	}
	
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(isprime(i)==1)  
			{
				System.out.println(i+"="+i);
			}
			else if(isprime(i)==0)                   
			{
				System.out.print(i+"=");
				int n=i;
				for(int j=2;j<=n;j++)
				{
					while(n%j==0&&j!=n)
					{
						System.out.print(j+"*");
						n=n/j;
					}
					if(n==j)
					{
						System.out.println(j);
						break;
					}
				}
			}
		}
	}
}

