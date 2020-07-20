package course.c15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterDemo {
	public static void main(String[] args) {
		LocalDateTime  now = LocalDateTime .now();
		DateTimeFormatter f = null;
		
		f = DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(now.format(f)); 
		// 2016-03-23
		
		f = DateTimeFormatter.ISO_ORDINAL_DATE;
		System.out.println(now.format(f)); 
		// 2016-083 (days of year)
		
		f = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		System.out.println(now.format(f)); 
		// 2016-03-23T11:20:21.065
		
		f = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy G, hh:mm a"); // 4碼  表示不縮寫
		System.out.println(now.format(f));
		// 星期三, 三月 23, 2016 西元, 11:20 上午
		
		f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.n"); 
		System.out.println(now.format(f));
		// 2016-03-23 11:20:21.65000000
		
		f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		System.out.println(now.format(f));
		// 2016年3月23日 下午12時04分43秒
		
		f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(now.format(f));
		// 2016/3/23 下午 12:04
		

		

		
	}

}
