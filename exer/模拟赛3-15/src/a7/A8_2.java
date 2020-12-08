package a7;
import java.util.*;
public class A8_2 {
	public static int[][] bool;
	public static int[] start;
	public static int[] end;
	public static char[][] num  ;
	public static int k = 0, n = 0, m = 0;
	public static int[] x = { 0, 1, 0, -1 };
	public static int[] y = { 1, 0, -1, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		  num = new char[n][m];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			num[i] = s.toCharArray();
		}
		k = sc.nextInt();
		sc.close();
		start = new int[m * n];
		end = new int[m * n];
		int temp = 0;
		bool = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (num[i][j] == 'g') {
					start[temp] = i;
					end[temp++] = j;
				}
				else{
					bool[i][j]=-1;
				}
			}
		}
		for (int i = 0; i < temp; i++) {
			dfs(start[i],end[i],k);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <m; j++) {
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
	}

	public static void dfs(int xx, int yy, int kk) {
		
		bool[xx][yy]=kk;
		num[xx][yy]='g';
		for (int i = 0; i < 4; i++) {
			int newx = x[i] + xx;
			int newy = y[i] + yy;
			if ( newx >= 0 && newy >= 0 && newx < n && newy < m&&  kk - 1 > bool[newx][newy]) {
				dfs(newx, newy, kk - 1);
			}
		}
	}
}
