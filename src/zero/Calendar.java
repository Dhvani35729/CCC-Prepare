package zero;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {

		int startDay = -1;
		int numDays = -1;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter day:");
		startDay = input.nextInt();
		System.out.println("\nEnter the number days in the month:");
		numDays = input.nextInt();
		input.close();
		System.out.println("\nSun Mon Tue Wed Thr Fri Sat");
		// System.out.println(startDay);
		// System.out.println(numDays);
		int refDay = 0;
		if (startDay == 1) {
			System.out.println("  1   2   3   4   5   6   7");
			refDay = 7;
		} else if (startDay == 2) {
			System.out.println("      1   2   3   4   5   6");
			refDay = 6;
		} else if (startDay == 3) {
			System.out.println("          1   2   3   4   5");
			refDay = 5;
		} else if (startDay == 4) {
			System.out.println("              1   2   3   4");
			refDay = 4;
		} else if (startDay == 5) {
			System.out.println("                  1   2   3");
			refDay = 3;
		} else if (startDay == 6) {
			System.out.println("                      1   2");
			refDay = 2;
		} else if (startDay == 7) {
			System.out.println("                          1");
			refDay = 1;
		} else {
			// None
		}

		while(refDay <= numDays){
			//System.out.println(refDay)
			
			
			String first = Integer.toString((refDay+1));
			String second = Integer.toString((refDay+2));
			String third = Integer.toString((refDay+3));
			String fourth = Integer.toString((refDay+4));
			String fifth = Integer.toString((refDay+5));
			String sixth = Integer.toString((refDay+6));
			String seventh = Integer.toString((refDay+7));
			
			if ((refDay+1) > numDays){
				first = " ";
			}
			if ((refDay+2) > numDays){
				second = " ";
			}
			if ((refDay+3) > numDays){
				third = " ";
			}
			if ((refDay+4) > numDays){
				fourth = " ";
			}
			if ((refDay+5) > numDays){
				fifth = " ";
			}
			if ((refDay+6) > numDays){
				sixth = " ";
			}
			if ((refDay+7) > numDays){
				seventh = " ";
			}
			
			
			if (first.length() < 2){
				first = " " + first;
			}
			if (second.length() < 2){
				second = " " + second;
			}
			if (third.length() < 2){
				third = " " + third;
			}
			if (fourth.length() < 2){
				fourth = " " + fourth;
			}
			if (fifth.length() < 2){
				fifth = " " + fifth;
			}
			if (sixth.length() < 2){
				sixth = " " + sixth;
			}
			if (seventh.length() < 2){
				seventh = " " + seventh;
			}
			
			
			
			System.out.println(" " + first + "  " + second + "  " + third + "  " + fourth + "  " + fifth + "  " + sixth + "  " + seventh);
			refDay += 7;
		}

	}

}