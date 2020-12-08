package 面试题;
import java.io.IOException;
import static java.util.Calendar.*;
public class Switch新用法 {
	public static void main(String[] args) throws IOException, InterruptedException {
		int day = 5;
		switch (day) {
	    case MONDAY:
	    case FRIDAY:
	    case SUNDAY:
	        System.out.println(6);
	        break;
	    case TUESDAY:
	        System.out.println(7);
	        break;
	    case THURSDAY:
	    case SATURDAY:
	        System.out.println(8);
	        break;
	    case WEDNESDAY:
	        System.out.println(9);
	        break;
	}
	}
}
