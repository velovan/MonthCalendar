package SelectedMonth;

import java.nio.channels.ShutdownChannelGroupException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class SelectedMonthMain{

	/*
	 * This part of program asks users for month and years, then it evaluates the
	 * weekday of the first day of that month as well as the number of days in
	 * that month.
	 * This part of the program consists of three classes
	 */
  
	PrintCalendarMonthYear calendarMonthYear = new PrintCalendarMonthYear();
	
	public SelectedMonthMain(){
		System.out.println("\n ***" + "Сalendar for the selected month" + "***\n");
	}
	
	public static void introducingMonth() {
		// represents the month (1-12)
		int month;

		// represents the year
		int year;

		// ask month and year from user
		Scanner in = new Scanner(System.in);
		System.out.print("\n Enter month and year: ");

		// read them as string
		String monthText = in.next();
		String yearText = in.next();
		in.close();

		try {
			// convert month and year to integer.
			// throws NumberFormatException if not convertible.
			// It would be caught below:
			month = Integer.parseInt(monthText);
			year = Integer.parseInt(yearText);
			// check if it is a valid month
			if (month < 1 || month > 12)
				throw new Exception("Invalid index for month: " + month);
			// print the calendar for the given month/year.
			PrintCalendarMonthYear.printCalendarMonthYear(month, year);
		} catch (NumberFormatException e){
			// handles NumberFormatException
			System.err.println("Number Format Error: " + e.getMessage());
		} catch (Exception e) {	
			// handles any other Exception
			System.err.println(e.getMessage());
		}
	}

}
