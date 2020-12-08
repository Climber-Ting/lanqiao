package 回形取数;
import java.util.*;
public class Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int i=0,j=0,num=0,k=0; //设置k，每次循环后+1，用来表示循环的圈数
        while(true)
        {  //以下四种循环通过列举法总结规律，列举了4*5的数组
        	for(i=j;i<=m-k-1;i++){
        		System.out.print(arr[i][j]+" "); 
        		num++;
        	}
        	i=i-1;
        	if(num==n*m){  //每一次循环后都要判断一次，以防数组越界
        		break;
        	}
        	for(j=j+1;j<=n-1-k;j++){
        		System.out.print(arr[i][j]+" ");
        		num++;
        	}
        	j=j-1;
        	if(num==n*m){  //每一次循环后都要判断一次，以防数组越界
        		break;
        	}
        	for(i=i-1;i>=k;i--){
        		System.out.print(arr[i][j]+" "); 
        		num++;
        	}
        	i=i+1;
        	if(num==n*m){  //每一次循环后都要判断一次，以防数组越界
        		break;
        	}
        	for(j=j-1;j>=k+1;j--){
        		System.out.print(arr[i][j]+" "); 
        		num++;
        	}
        	j=j+1;
        	k++;
        	if(num==n*m){  //每一次循环后都要判断一次，以防数组越界
        		break;
        	}
        }	
	} 
}

