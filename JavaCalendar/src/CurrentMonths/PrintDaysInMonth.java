package CurrentMonths;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Locale;

public class PrintDaysInMonth {

	public PrintDaysInMonth() {

	}

	public void showDaysInMonths(Calendar cal) {
		int month = cal.get(Calendar.MONTH);
		int firstDayOfWeek = cal.getFirstDayOfWeek();
		Calendar calendar = Calendar.getInstance();


		// Display dates in mont
		cal.set(Calendar.DATE, cal.getMinimum(Calendar.DATE));

		// Now display the dates, one week per line
		StringBuilder week = new StringBuilder();

		while (month == cal.get(Calendar.MONTH)) {
			
			// Display date
			week.append(String.format("%3d ", cal.get(Calendar.DATE)));
			
			// Increment date
			cal.add(Calendar.DATE, 1);
			
			// Check if week needs to be printed
			if (cal.get(Calendar.MONTH) != month) {
				
				// end of month
				// just need to output the month
				System.out.println(week);
			} else if (cal.get(Calendar.DAY_OF_WEEK) == firstDayOfWeek) {
				
				// new week so print out the current week
				// first check if any padding needed
				int padding = 28 - week.length();
				if (padding > 0) {
				    // pad out start of week
				    week.insert(0, String.format("%" + padding + "s", "  "));
				}
				System.out.println(week);
				week.setLength(0);
			}
		}
	}

}
