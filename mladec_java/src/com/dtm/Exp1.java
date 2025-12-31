package com.dtm;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Exp1 {

	public static void main(String[] args) {
		
		// get the current date
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		// get the current date and time
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		// get the desired date 
		LocalDate ldspd = LocalDate.of(2000, Month.APRIL, 7);
		System.out.println(ldspd);
		
		// make date related calculations
		LocalDate plswk = ld.plusWeeks(1);
		System.out.println(plswk);
		
		// to calculate the period between 2 dates
		Period prd = Period.between(ldspd, ld);
		System.out.println(prd);
		
		// to format date and time
		DateTimeFormatter dfmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formatedDate = ldt.format(dfmt);
		System.out.println(formatedDate);
		
		// to  get the zonal time zone
		ZonedDateTime zndt = ZonedDateTime.now();
		System.out.println(zndt);
		
		// to get the zone id of a zone
		ZoneId znid = ZoneId.of("Asia/Tokyo");
		System.out.println(znid);
		
		ZonedDateTime tk = ZonedDateTime.now(znid);
		System.out.println(tk);
		
		
		
		
	}

}
