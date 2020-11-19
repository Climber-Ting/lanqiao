package exer;
import java.util.*;
/*
	问题描述
	　　给定一个单词，请使用凯撒密码将这个单词加密。
	　　凯撒密码是一种替换加密的技术，单词中的所有字母都在字母表上向后偏移3位后被替换成密文。
		即a变为d，b变为e，...，w变为z，x变为a，y变为b，z变为c。
	　　例如，lanqiao会变成odqtldr。
	输入格式
	　　输入一行，包含一个单词，单词中只包含小写英文字母。
	输出格式
	　　输出一行，表示加密后的密文。
	样例输入
	lanqiao
	样例输出
	odqtldr
	评测用例规模与约定
	　　对于所有评测用例，单词中的字母个数不超过100。
	 */
public class Two {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String n=in.next();
		char[] a=n.toCharArray();
		for(int i=0;i<a.length;i++) {
			a[i]=(char)(a[i]+3);
			System.out.print(a[i]);
		}
	}
	

}
