package sum;
import java.util.*;
public class Sum {
	public static void main(String[] args)
	{
		System.out.print(" ");
		Scanner input =new Scanner(System.in);
		long n =input.nextLong();
		long sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
}
