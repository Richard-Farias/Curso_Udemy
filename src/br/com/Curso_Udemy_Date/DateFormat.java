package br.com.Curso_Udemy_Date;

import java.util.Date;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class DateFormat {

	public static void main(String[] args) throws ParseException{
		
		//Classe Date
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/mm/yy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yy/mm/dd HH:mm:ss");
		SimpleDateFormat sdf5 = new SimpleDateFormat("yy/mm/dd HH:mm:ss");
		
		
		
		// Mudando o TimeZone
		SimpleDateFormat sdf4 = new SimpleDateFormat();
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date date1 = sdf1.parse("18/08/1980");
		Date date2 = sdf2.parse("18/08/1980 18:18:18");
		
		//imprime de forma padrão do java
		System.out.println("Date:" + date1);
		System.out.println("");
		System.out.println("Date:" + date2);
		System.out.println("");
		// imprime conforme a classe
		System.out.println("Date:" + sdf1.format(date1));
		System.out.println("");
		System.out.println("Date:" + sdf2.format(date2));
		System.out.println();
		// Pegando data atual
		Date dt = new Date();
		System.out.println("Date:" + sdf1.format(dt));
		System.out.println("");
		System.out.println("Date:" + sdf2.format(dt));
		System.out.println();
		// Pegando data atual com milésimos de segundo
		Date dt2 = new Date(System.currentTimeMillis());
		System.out.println();
		System.out.println("Date:" + sdf3.format(dt2));
		System.out.println();
		// Pegando data com padrão ISO8601
		Date dt3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println("Date:" + sdf2.format(dt3));
		System.out.println();
		//Mudança de TimeZone
		System.out.println("Date: " + sdf4.format(dt2));
		System.out.println();
		System.out.println(sdf1.format(System.currentTimeMillis()));
			
	}

}
