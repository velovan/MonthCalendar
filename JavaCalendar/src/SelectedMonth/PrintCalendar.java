package SelectedMonth;

import java.util.Calendar;
import java.util.Locale;

public class PrintCalendar {

	public static void printCalendar(int numberOfMonthDays, int firstWeekdayOfMonth) {

		// reset index of weekday
		int weekdayIndex = 0;

		// print calendar weekday header
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");


		// leave/skip weekdays before the first day of month
		for (int day = 1; day < firstWeekdayOfMonth; day++) {
			System.out.print("    ");
			weekdayIndex++;
		}

		// print the days of month in tabular format.
		for (int day = 1; day <= numberOfMonthDays; day++) {
			// print day
 
			System.out.printf("%1$2d", day);

			// next weekday
			weekdayIndex++;
			
			// if it is the last weekday
			if (weekdayIndex == 7) {
				 
				// reset it
				weekdayIndex = 0;
				
				// and go to next line
				System.out.println();
			} else { // otherwise
						// print space
				System.out.print("  ");
			}
		}

		// print a final new-line.
		System.out.println();
	}
}
