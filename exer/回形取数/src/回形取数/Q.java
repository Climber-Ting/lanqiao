package ����ȡ��;
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
		int i=0,j=0,num=0,k=0; //����k��ÿ��ѭ����+1��������ʾѭ����Ȧ��
        while(true)
        {  //��������ѭ��ͨ���оٷ��ܽ���ɣ��о���4*5������
        	for(i=j;i<=m-k-1;i++){
        		System.out.print(arr[i][j]+" "); 
        		num++;
        	}
        	i=i-1;
        	if(num==n*m){  //ÿһ��ѭ����Ҫ�ж�һ�Σ��Է�����Խ��
        		break;
        	}
        	for(j=j+1;j<=n-1-k;j++){
        		System.out.print(arr[i][j]+" ");
        		num++;
        	}
        	j=j-1;
        	if(num==n*m){  //ÿһ��ѭ����Ҫ�ж�һ�Σ��Է�����Խ��
        		break;
        	}
        	for(i=i-1;i>=k;i--){
        		System.out.print(arr[i][j]+" "); 
        		num++;
        	}
        	i=i+1;
        	if(num==n*m){  //ÿһ��ѭ����Ҫ�ж�һ�Σ��Է�����Խ��
        		break;
        	}
        	for(j=j-1;j>=k+1;j--){
        		System.out.print(arr[i][j]+" "); 
        		num++;
        	}
        	j=j+1;
        	k++;
        	if(num==n*m){  //ÿһ��ѭ����Ҫ�ж�һ�Σ��Է�����Խ��
        		break;
        	}
        }	
	} 
}

