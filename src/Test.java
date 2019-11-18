import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
//import java.sql.Date;

public class Test {
	public static void main(String[] args)
	{
		Date dateobj=new Date();
		
		
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		SimpleDateFormat sd1=new SimpleDateFormat("dd/MM/yyyy HH:MM:SS");
		SimpleDateFormat sd2=new SimpleDateFormat("dd/MM/yyyy");
		String s2=sd1.format(dateobj);
		String s=sd.format(dateobj);
		System.out.println(s);
		System.out.println(s2 );
		/*long ms=System.currentTimeMillis();
		Date d1=new Date(ms);
		System.out.println(d1); o/p:2019-11-16*/
		
		try {
			Date dateobj2= sd2.parse("16/11/2019");
			System.out.println(dateobj2);
			
		}
		catch(ParseException e){
			System.out.println(e);
			
		}
		Calendar c=Calendar.getInstance();
		System.out.println(c.getTime());
		System.out.println(java.time.LocalDate.now());
		System.out.println(java.time.LocalTime.now());
		System.out.println(LocalDateTime.now());
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate d=LocalDate.now();
		System.out.println(d.format(dt));
		
	}

}
