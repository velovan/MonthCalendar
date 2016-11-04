package SelectedMonth;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class PrintCalendarMonthYear {

	PrintCalendar printCalendar = new PrintCalendar();

	public static void printCalendarMonthYear(int month, int year) {
		LocalDate today = LocalDate.now();
		
		// create a new GregorianCalendar object
		Calendar cal = new GregorianCalendar();

		// set its date to the first day of the month/year given by user
		cal.clear();
		cal.set(year, month - 1, 1);
	 
		// print calendar header
		System.out.println( "\n" + "        " + cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.UK) + ":  " + cal.get(Calendar.YEAR));
		System.out.println("___________________________\n ");
		
		// obtain the weekday of the first day of month.
		int firstWeekdayOfMonth = cal.get(Calendar.DAY_OF_WEEK);

		// obtain the number of days in month.
		int numberOfMonthDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		// print anonymous calendar month based on the weekday of the first
		// day of the month and the number of days in month:
		PrintCalendar.printCalendar(numberOfMonthDays, firstWeekdayOfMonth);
	}
}
