package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ProgramDate {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);

		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		System.out.println("------------");
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));
		System.out.println("-------------");
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));

		// Somando uma unidade de tempo
		System.out.println("-------------");
		System.out.println("-------------");

		SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d1 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf4.format(d1));
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(d1);
		cal1.add(Calendar.HOUR_OF_DAY, 4);
		d1 = cal1.getTime();
		System.out.println(sdf4.format(d1));

		// Obtendo uma unidade de tempo
		System.out.println("-------------");
		System.out.println("-------------");

		SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d2 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf5.format(d2));
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		int minutes = cal2.get(Calendar.MINUTE);
		int month = 1 + cal2.get(Calendar.MONTH);  // Precisa somar 1 pois o mes começa em 0
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);

	}

}
