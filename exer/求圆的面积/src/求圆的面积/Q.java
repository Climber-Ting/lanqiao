package 求圆的面积;
import java.util.*;
import java.math.*;
public class Q {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		double s=Math.pow(a, 2)*Math.PI;
		BigDecimal b=new BigDecimal(s); 
		double c=b.setScale(7,BigDecimal.ROUND_HALF_UP).doubleValue();
		java.text.DecimalFormat x=new java.text.DecimalFormat("#.0000000"); 
		System.out.print(x.format(c));
	}
}
