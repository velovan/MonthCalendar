package CurrentMonths;

import java.applet.Applet;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Locale;

public class PrintNameOfDays {

	// Get the current date
	LocalDate today = LocalDate.now();

	public PrintNameOfDays() {

	}

	public void showNameOfDays(Calendar cal) {
		int month = cal.get(Calendar.MONTH);
		int firstDayOfWeek = cal.getFirstDayOfWeek();
		Calendar calendar = Calendar.getInstance();

		// Display day names as headers
		System.out.println("\n");
		System.out.println("      " + "**" + today.getMonth() + "**" + " : " + today.getDayOfMonth());

		System.out.println("___________________________\n ");

		for (int i = 0; i < 7; i++) {

			System.out.print(cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.getDefault().UK));
			System.out.print(" ");
			cal.add(Calendar.DATE, 1);
		}
		System.out.println();
	}

}
