package 完美的代价;
import java.util.Scanner;
public class C {
	 public static int sum = 0;
	    public static void exchange(char[] arr, int x, int y) {	//把arr字符数组中x下标和y下标对应的值交换位置
	        char item;
	        item = arr[x];
	        arr[x] = arr[y];
	        arr[y] = item;
	        sum ++;		//移动次数加一
	    }
	    public static void main(String[] args) {
	        Scanner readerIn = new Scanner(System.in);
	        int n = readerIn.nextInt();
	        String str = readerIn.next();
	        char[] arr = str.toCharArray();
	        int flag = 0;	//当字符串长度为奇数时非成对字符的个数
	        boolean isHuiwen = true;	//标示此字符串是否为回文
	        int i, j, l = arr.length;
	        for(i = 0; i < arr.length/2; i ++) {
	            for(j = l - 1; j >= i; j -- ) {	//从最右边开始查找,看有无与当前字符相同的
	                if(0 == arr.length % 2 && i == arr.length - 1 && j == arr.length) {
			    //如果当前字符串长度为偶数,且中间两个字符不相同,则该字符不是回文字符
	                    if(arr[i] != arr[j]) {
	                        isHuiwen = false;
	                        break;
	                    }
	                }
	                if(i == j) {	//没有找到与当前字符相同的字符
	                    if(0 == arr.length % 2) {	//如果字符长度为偶数则不是回文字符串
	                        isHuiwen = false;
	                        break;
	                    } else {	//如果当前字符长度为奇数,且未匹配的字符超过一个,则也不是回文字符
	                        flag ++;
	                        if(flag <= 1) {	//有一个字符未匹配,则把此字符移动到中间
	                            for(int m = 0; m < arr.length/2 - 1; m ++) {
	                                exchange(arr, m, m + 1);
	                            }
	                            i = 0;	//重新开始遍历
			            break;
	                        }
	                        if(flag == 2) {		//如果有两个字符为匹配,则该字符不是回文字符
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

