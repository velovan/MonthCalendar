package StartCalendar;

import java.util.Calendar;

import CurrentMonths.CurrentDate;
import CurrentMonths.PrintDaysInMonth;
import CurrentMonths.PrintNameOfDays;
import SelectedMonth.SelectedMonthMain;

public class MainCalendar {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();

		// Print current month
		CurrentDate date = new CurrentDate();
		PrintNameOfDays myCalendar = new PrintNameOfDays();
		PrintDaysInMonth days = new PrintDaysInMonth();

		date.currentDate(today);
		myCalendar.showNameOfDays(today);
		days.showDaysInMonths(today);
		
		//Print selected month
		SelectedMonthMain clen = new SelectedMonthMain();
		clen.introducingMonth();
	}

}
