package Ê±¼ä×ª»»;
import java.util.*;
public class A {
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		int t=input.nextInt();
		int a=t/3600;
		int b=(t-a*3600)/60;
		int c=t-a*3600-b*60;
		System.out.print(a+":"+b+":"+c);
	}

}
