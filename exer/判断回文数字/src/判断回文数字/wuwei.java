package ÅĞ¶Ï»ØÎÄÊı×Ö;
import java.util.*;
public class wuwei {
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		for(int i=10000;i<=99999;i++)
		{
			if(i%10+(i%10)/10+(i/1000)%10+(i/100)%10+i/10000==n)
				if((i%10==i/10000)&&((i/10)%10)==(i/1000)%10)
					System.out.println(i);
		}
		for(int i=100000;i<=999999;i++)
		{
			if(i%10+(i%10/10)+(i/100)%10+(i/1000)%10+(i/10000)%10+i/100000==n)
				if((i%10==i/100000)&&((i/10)%10==(i/10000)%10)&&((i/100)%10==(i/1000)%10))
					System.out.println(i);
		}
	}

}
