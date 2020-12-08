package ÅĞ¶Ï»ØÎÄÊı×Ö;
import java.util.*;
public class A {
	public static void main(String[] args)
	{
		for(int i=1000;i<=9999;i++)
		{
			if((i%10==i/1000)&&((i/10)%10==(i/100)%10))
				System.out.println(i);		
		}
	}
}
