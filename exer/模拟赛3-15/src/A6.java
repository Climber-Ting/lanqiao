import java.util.*;
public class A6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int count=1;
		String a=input.next();
		char[] b=a.toCharArray();
		int[] m=new int[a.length()];
		switch(b[0]) {
		case'a':  m[0]=1;break;
		case'e':  m[0]=1;break;
		case'i':  m[0]=1;break;
		case'o':  m[0]=1;break;
		case'u':  m[0]=1;break;
		default:  m[0]=2;break;
		}
		for(int i=1;i<a.length();i++) {
			switch(b[i]) {
			case'a':  m[i]=1;break;
			case'e':  m[i]=1;break;
			case'i':  m[i]=1;break;
			case'o':  m[i]=1;break;
			case'u':  m[i]=1;break;
			default:  m[i]=2;break;
			}
			if(m[i]!=m[i-1])
				count++;
		}
		if(count==4)
			System.out.print("yes");
		else
			System.out.print("no");	
	}

}
