package Api.naoki;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class main {
	public static void main(String[] args)	throws Exception{
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		int day = c.get(Calendar.DAY_OF_MONTH);
		day += 100;
		
		c.set(Calendar.DAY_OF_MONTH, day);
		Date future = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("yyyy mm dd");
		System.out.println(f.format(future));
	}
}

