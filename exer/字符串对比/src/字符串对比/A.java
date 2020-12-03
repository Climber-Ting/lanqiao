package ×Ö·û´®¶Ô±È;
import java.util.*;
public class A {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String a=input.nextLine();
		String b=input.nextLine();
		if(a.length()==b.length())
		{
			if(a.equals(b))
				System.out.println("2");
			else 
				if(a.equalsIgnoreCase(b))
					System.out.println("3");
				else
					System.out.println("4");
	
		}
		else
			System.out.println("1");
	}
}
