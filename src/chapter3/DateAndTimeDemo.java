package chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateAndTimeDemo {

	public static void main(String[] str) {
		
		LocalDate today = LocalDate.now();
		Month m = today.getMonth();
		
		System.out.println(m);
		System.out.println(today.getYear());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getDayOfYear());
		System.out.println(today.getDayOfWeek());		
		System.out.println(today);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		
		
		LocalDateTime ld = LocalDateTime.now();
		System.out.println(ld);
		
		
		LocalDate date = LocalDate.of(2026, 07, 06);
		System.out.println(date);
		
		System.out.println(today.plusDays(10));
		System.out.println(today.minusDays(5));
		System.out.println(today.plusYears(2));
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formated_date = date1.format(df);
		System.out.println(formated_date);
		
		
		java.util.Date d = new java.util.Date();
		String date3 = d.toLocaleString();
		System.out.println(date3);
		
	}
}
