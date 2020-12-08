
package a7;
import java.util.*;
public class A8 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		char[][] n=new char[a][b];
		for(int i=0;i<a;i++) {
			String line=input.next();
			n[i]=line.toCharArray();
		}
		input.close();
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++)
				System.out.print(n[i][j]);
			System.out.println();
		}
	}
	/*static void bianhua(char[][] n,int a,int b) {
		for(int i=0;i<a;i++) {
			for(int j=i;j<b;j++) {
				while(i==0) {
					while(j==0) {
						n[i+1][j]='g';
						n[i][j+1]='g';
					}
					while(j==b-1) {
						n[i+1][j]='g';
						n[i][j-1]='g';
					}
					while(j>0&&j<b-1) {
						n[i][j+1]='g';
						n[i][j-1]='g';
						n[i+1][j]='g';
					} 
				}
				while(i>0&&i<a-1) {
					if(j>0&&j<b-1) {
						n[i][j-1]='g';
						n[i][j+1]='g';
						n[i-1][j]='g';
						n[i+1][j]='g';
					}
					else {
						n[i-1][j]='g';
						n[i+1][j]='g';
						while(j==0) {
							n[i][j+1]='g';
						}
						while(j==b) {
							n[i][j-1]='g';
						}
					}
				}			
				while(i==a-1) {
					while(j==0) {
						n[i-1][j]='g';
						n[i][j+1]='g';
					}
					while(j==b-1) {
						n[i-1][j]='g';
						n[i][j-1]='g';
					}
					while(j>0&&j<b-1) {
						n[i][j+1]='g';
						n[i][j-1]='g';
						n[i-1][j]='g';
					} 	
				}
			}
		}	
	}*/
}
