package com.fudy;

import java.text.SimpleDateFormat;
import java.util.Date;



import org.junit.Test;

public class DateTest {
	@Test
	public void testDate() {
		Date date = new Date(1416412800000L);
		System.out.println(date);
	}
	
	@Test
	public void testDate2(){
		new SimpleDateFormat("DD-MON-YY");
	}
}
