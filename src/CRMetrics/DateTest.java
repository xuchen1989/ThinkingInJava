package CRMetrics;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class DateTest {
	/**
	 * @param args
	 */
	public static void main (String[] args) {
//		try{
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
//		sdf.setTimeZone(new SimpleTimeZone(SimpleTimeZone.UTC_TIME, "UTC"));
////		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
////		long milli = 1409616000000L;
////		Date date = new Date(milli);
//		Date start = sdf.parse("2014-10-01");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-02");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-03");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-04");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-05");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-06");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-07");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-08");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-09");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-10");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-11");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-12");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-13");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-14");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-15");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-16");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-17");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-18");
//		System.out.println(start.getTime());
//		start = sdf.parse("2014-10-19");
//		System.out.println(start.getTime());
//		long milli = date.getTime()+;
//		}catch(Exception e){
//			e.printStackTrace();
//		}
		long init = 1412121600000L;
		for(int i=0;i<20;i++){
			init += 86400000;
			System.out.println(init);
		}
	}

}
