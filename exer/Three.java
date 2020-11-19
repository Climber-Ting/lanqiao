package exer;
import java.util.*;
/*
	 * 问题描述
	　　对于一个 n 行 m 列的表格，我们可以使用螺旋的方式给表格依次填上正整数，我们称填好的表格为一个螺旋矩阵。
	　　例如，一个 4 行 5 列的螺旋矩阵如下：
	　　1 2 3 4 5
	　　14 15 16 17 6
	　　13 20 19 18 7
	　　12 11 10 9 8
	输入格式
	　　输入的第一行包含两个整数 n, m，分别表示螺旋矩阵的行数和列数。
	　　第二行包含两个整数 r, c，表示要求的行号和列号。
	输出格式
	　　输出一个整数，表示螺旋矩阵中第 r 行第 c 列的元素的值。
	样例输入
	4 5
	2 2
	样例输出
	15
	评测用例规模与约定
	　　对于 30% 的评测用例，2 <= n, m <= 20。
	　　对于 70% 的评测用例，2 <= n, m <= 100。
	　　对于所有评测用例，2 <= n, m <= 1000，1 <= r <= n，1 <= c <= m。
 */
public class Three {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
//		int r=in.nextInt();
//		int c=in.nextInt();
		
		int[][] l=new int[n][m];
		int d=0;
		int i,j,k,t,o=m-1,p=n-1;
		int a1=0,a2=1,a3=m-2,a4=n-2;
		for(;;) {
			for(i=a1;i<m;i++) {
				l[a1][i]=++d;
			}
			if(d==n*m)
				break;
			for(j=a2;j<n;j++) {
				l[j][o]=++d;
			}
			if(d==n*m)
				break;
			for(k=a3;k>=a1;k--) {
				l[p][k]=++d;
			}
			if(d==n*m)
				break;
			for(t=a4;t>=a2;t--) {
				l[t][a1]=++d;
			}
			if(d==n*m)
				break;
			a1++;
			a2++;
			a3--;
			a4--;
			m=m-1;
			n=n-1;
			o--;
			p--;
		}	
		
		for(int x=0;x<n;x++) {
			for(int y=0;y<m;y++) {
				System.out.print(l[x][y]+" ");
			}
			System.out.println();
		}
	}
}
