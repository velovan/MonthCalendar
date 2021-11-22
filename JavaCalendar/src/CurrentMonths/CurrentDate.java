package CurrentMonths;

import java.time.LocalDate;
import java.util.Calendar;

public class CurrentDate {
  /*
   *This part of program print data for the current month
   * This part of the program consists of three classes
   */
	
	public CurrentDate() {
		System.out.println("\n ***" + " Calendar for the month" + "***\n");
	}

	public void currentDate(Calendar cal) {
        // Print current date
		LocalDate today = LocalDate.now();
		cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
		System.out.println("Date: " + today.getDayOfMonth() + "| " + today.getDayOfWeek() +  "| " + today.getMonth() + "| " + today.getYear());
	}

}
