package ½øÖÆ×ª»»;
import java.math.BigInteger;
import java.util.Scanner;
public class A16_8 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
BigInteger bg = new BigInteger("1");
for(int i=1;i<=a;i++){
String n = String.valueOf(i);
bg = (new BigInteger(n)).multiply(bg);
}
System.out.println(bg);
}
}
