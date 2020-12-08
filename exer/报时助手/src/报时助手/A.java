package ±¨Ê±ÖúÊÖ;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class A {
	public static void main(String[] args) {
	Map<Integer, String> map= new HashMap<Integer, String>();
	map.put(0,"zero");
	map.put(1,"one");
	map.put(2,"two");
	map.put(3,"three");
	map.put(4,"four");
	map.put(5,"five");
	map.put(6,"six");
	map.put(7,"seven");
	map.put(8,"eight");
	map.put(9,"nine");
	map.put(10,"ten");
	map.put(11,"eleven");
	map.put(12,"twelve");
	map.put(13,"thirteen");
	map.put(14,"fourteen");
	map.put(15,"fifteen");
	map.put(16,"sixteen");
	map.put(17,"seventeen");
	map.put(18,"eighteen");
	map.put(19,"nineteen");
	map.put(20,"twenty");
	map.put(30,"thirty");
	map.put(40,"forty");
	map.put(50,"fifty");
	Scanner sc = new Scanner(System.in);
	int h = sc.nextInt();
	String mm = sc.next();
	int m = Integer.parseInt(mm);
	if(h<=20){
	if(mm.equals("00")||mm.equals("0"))
	{
	System.out.print(map.get(h)+" "+"o'clock");
	}
	else
	{
	System.out.print(map.get(h)+" ");
	getM(m, map);
	}
	}else{
	if(mm.equals("00")||mm.equals("0")){
	System.out.print(map.get(20)+" ");
	System.out.print(map.get(h%20)+" "+"o'clock");
	}else{
	System.out.print(map.get(20)+" ");
	System.out.print(map.get(h%20)+" ");
	getM(m, map);
	}
	}
	}
	public static void getM(int m,Map<Integer, String> map){
	if(m<=20||m==30||m==40||m==50){
	System.out.print(map.get(m)+" ");
	}else if(20<m&&m<30){
	System.out.print(map.get(20)+" ");
	System.out.print(map.get(m%20));
	}else if(30<m&&m<40){
	System.out.print(map.get(30)+" ");
	System.out.print(map.get(m%30));
	}else if(40<m&&m<50){
	System.out.print(map.get(40)+" ");
	System.out.print(map.get(m%40));
	}else{
	System.out.print(map.get(50)+" ");
	System.out.print(map.get(m%50));
	}
	}
}

	 

	 


	/*public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int h=input.nextInt();
		int m=input.nextInt();
		String h1=" ";
		switch(h)
		{
		case'1':h1="one";break;
		case'2':h1="two";break;
		case'3':h1="three";break;
		case'4':h1="four";break;
		case'5':h1="five"; break;
		case'6':h1="six";break;
		case'7':h1="seven";break;
		case'8':h1="eight";break;
		}
		if(m==0)
			System.out.print(h1);
		
			
	}*/


