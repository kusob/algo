package kusob;

import java.util.Calendar;


public class DateTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		String ntime = String.valueOf(c.get(Calendar.YEAR));
		int a = Integer.parseInt(ntime);
		int b = 2016; //2000년도가 1기라고 가정하자
		int gisu = a-b+1;
		System.out.println(gisu);
	}
}
