package �����Ĵ���;
import java.util.Scanner;
public class C {
	 public static int sum = 0;
	    public static void exchange(char[] arr, int x, int y) {	//��arr�ַ�������x�±��y�±��Ӧ��ֵ����λ��
	        char item;
	        item = arr[x];
	        arr[x] = arr[y];
	        arr[y] = item;
	        sum ++;		//�ƶ�������һ
	    }
	    public static void main(String[] args) {
	        Scanner readerIn = new Scanner(System.in);
	        int n = readerIn.nextInt();
	        String str = readerIn.next();
	        char[] arr = str.toCharArray();
	        int flag = 0;	//���ַ�������Ϊ����ʱ�ǳɶ��ַ��ĸ���
	        boolean isHuiwen = true;	//��ʾ���ַ����Ƿ�Ϊ����
	        int i, j, l = arr.length;
	        for(i = 0; i < arr.length/2; i ++) {
	            for(j = l - 1; j >= i; j -- ) {	//�����ұ߿�ʼ����,�������뵱ǰ�ַ���ͬ��
	                if(0 == arr.length % 2 && i == arr.length - 1 && j == arr.length) {
			    //�����ǰ�ַ�������Ϊż��,���м������ַ�����ͬ,����ַ����ǻ����ַ�
	                    if(arr[i] != arr[j]) {
	                        isHuiwen = false;
	                        break;
	                    }
	                }
	                if(i == j) {	//û���ҵ��뵱ǰ�ַ���ͬ���ַ�
	                    if(0 == arr.length % 2) {	//����ַ�����Ϊż�����ǻ����ַ���
	                        isHuiwen = false;
	                        break;
	                    } else {	//�����ǰ�ַ�����Ϊ����,��δƥ����ַ�����һ��,��Ҳ���ǻ����ַ�
	                        flag ++;
	                        if(flag <= 1) {	//��һ���ַ�δƥ��,��Ѵ��ַ��ƶ����м�
	                            for(int m = 0; m < arr.length/2 - 1; m ++) {
	                                exchange(arr, m, m + 1);
	                            }
	                            i = 0;	//���¿�ʼ����
			            break;
	                        }
	                        if(flag == 2) {		//����������ַ�Ϊƥ��,����ַ����ǻ����ַ�
	                            isHuiwen = false;
	                            break;
	                        }
	                    }
	                }
	                if(arr[i] == arr[j]) {
	                    for(int k = j; k <= l - 1 - 1; k ++){
	                        exchange(arr, k, k + 1);
	                        //System.out.println(arr);
	                    }
	                    l --;
	                    break;
	                }
	            }
	        }
	        if(!isHuiwen)
	            System.out.println("Impossible");
	        else
	            System.out.printf("%d\n", sum);
	    }


}

