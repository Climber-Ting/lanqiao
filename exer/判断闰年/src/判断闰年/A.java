package �ж�����;
import java.util.*;
public class A {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int y=input.nextInt();
		if((y%4==0&&y%100!=0)||y%400==0)
			System.out.print("yes");
		else
			System.out.print("no");
	}
}
