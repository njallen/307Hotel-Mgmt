
import java.time.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Date {

	public static void main(String[] args) {
		/*
		 * THIS NEEDS A LOT OF WORK TO INTERGRATE BUT IT CAN TAKE USER INPUT FOR
		 * DATE AND HAVE DATES THE METHOD AT BOTTOM CHECK IF DATE ALREADY TAKEN
		 */

		Scanner in = new Scanner(System.in);
		System.out.println("Enter date in 2014-12-31 format:  ");

		String s = in.nextLine();
		// String s = "2014-05-02";
		String e = "2014-05-10";
		LocalDate start = LocalDate.parse(s);
		LocalDate end = LocalDate.parse(e);
		ArrayList<LocalDate> totalDates = new ArrayList<>();
		while (!start.isAfter(end)) {
			totalDates.add(start);
			start = start.plusDays(1);
		}
		int totaldays = 0;
		for (int i = 0; i < totalDates.size(); i++) {
			System.out.println(totalDates.get(i));
			totaldays++;
		}
		System.out.print("The length of your stay is " + (totaldays - 1));
		if (totaldays == 2) {
			System.out.println(" day");
		} else {
			System.out.println(" days");
		}
		String s2 = "2014-05-11";
		String e2 = "2014-05-15";
		LocalDate start2 = LocalDate.parse(s2);
		LocalDate end2 = LocalDate.parse(e2);
		String result = searchlist(totalDates, start2, end2);
		System.out.println(result);
	}
	// check if days requested already reserved 
	public static String searchlist(ArrayList<LocalDate> array, LocalDate start2, LocalDate end2) {
		String searchResult;

		int value = Collections.binarySearch(array, start2);
		int value2 = Collections.binarySearch(array, end2);

		if (value < 0 && value2 < 0) {
			searchResult = "Your dates have been booked";
		} else {
			searchResult = "Please pick another day ";
		}
		return searchResult;
		// CREATE ANOTHER OBJECT TO STORE THE NEW RESERVATION
	}
	
}
