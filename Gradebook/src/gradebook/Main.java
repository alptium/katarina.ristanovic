package gradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try(Scanner sc = new Scanner(System.in)) {
			
			int sum = 0;
			
			String studentName1 = "Marija";
			String studentLastName1 = "Jovic";
			System.out.println("Enter a grade " + studentName1 + " " + studentLastName1);
			int grade1 = sc.nextInt();
			
			String studentName2 = "Marko";
			String studentLastName2 = "Petrovic";

			System.out.println("Unesite ocenu " + studentName2 + " " + studentLastName2);

			System.out.println("Enter a grade " + studentName2 + " " + studentLastName2);

			System.out.println("Enter a grade " + studentName2 + " " + studentLastName2);

			int grade2 = sc.nextInt();
			
			String studentName3 = "Ivana";
			String studentLastName3 = "Krstic";

			System.out.println("Enter a grade " + studentName3 + " " + studentLastName3 );
			
			System.out.println("Enter a grade " + studentName3 + " " + studentLastName3 );

			System.out.println("Enter a grade " + studentName3 + " " + studentLastName3 );

			int grade3 = sc.nextInt();
			
			String studentName4 = "Nenad";
			String studentLastName4 = "Colic";

			System.out.println("Enter a grade " + studentName4 + " " + studentLastName4 );

			System.out.println("Enter a grade " + studentName4 + " " + studentLastName4 );

			System.out.println("Enter a grade " + studentName4 + " " + studentLastName4 );

			int grade4 = sc.nextInt();
			
			String studentName5 = "Jelena";
			String studentLastName5 = "Joksimovic";

			System.out.println("Unesite ocenu " + studentName5 + " " + studentLastName5);
			System.out.println("Enter a grade " + studentName5 + " " + studentLastName5);


			System.out.println("Enter a grade " + studentName5 + " " + studentLastName5);

			int grade5 = sc.nextInt();
			
			sum  = grade1 + grade2 + grade3 + grade4 + grade5;
			
			System.out.println("Ms Jamse sum of grade is : " +  sum );
			
		}
	}
}
// I try to change everything I undersud but I am not sure that it is all ok.
// For example what should I do for las comment about initialization of variables
