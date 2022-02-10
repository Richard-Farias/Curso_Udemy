package br.com.Curso_Udemy_Date;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calender {

	public static void main(String[] args) {
		SimpleDateFormat sdf01 = new SimpleDateFormat("yy/mm/dd HH:mm:ss");
		Date date = Date.from(Instant.parse("2022-10-31T22:10:07Z"));
		System.out.println("Date: " + sdf01.format(date));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		//acrescentando dias para essa data
		cal.add(Calendar.YEAR,3 );
		cal.getTime();
		//pegando os minutos da data 
		int minutos = cal.get(Calendar.MINUTE);
		int mes = cal.get(Calendar.MONTH);
		
		System.out.println("Dia de Vencimento: " + sdf01.format(date));
		System.out.println("Minutos do dia: " + minutos);
		System.out.println("Mês: " + mes);
		System.out.println();
		
		Calendar  c = Calendar.getInstance();
		System.out.println("Data Atual: " + c.getTime());
		c.add(Calendar.DAY_OF_WEEK,3);
		System.out.println("Data Vencimento: " + c.getTime());
		
	}

}
