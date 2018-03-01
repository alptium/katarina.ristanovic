package gradebook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int grade1;
        int grade2;
        int grade3;
        int grade4;
        int grade5;

        String sudentName1;
        String sudentName2;
        String sudentName3;
        String sudentName4;
        String sudentName5;

        String sudentLastName1;
        String sudentLastName2;
        String sudentLastName3;
        String sudentLastName4;
        String sudentLastName5;

        int sum;

        try (Scanner sc = new Scanner(System.in)) {

            sudentName1 = sc.next();
            sudentLastName1 = sc.next();
            grade1 = sc.nextInt();

            System.out.println("Enter first and last name " + sudentName1 + sudentLastName1);
            System.out.println("Enter a grade " + grade1);

            sudentName2 = sc.next();
            sudentLastName2 = sc.next();
            grade2 = sc.nextInt();

            System.out.println("Enter first and last name " + sudentName2 + sudentLastName2);
            System.out.println("Enter a grade " + grade2);

            sudentName3 = sc.next();
            sudentLastName3 = sc.next();
            grade3 = sc.nextInt();

            System.out.println("Enter first and last name " + sudentName3 + sudentLastName3);
            System.out.println("Enter a grade " + grade3);

            sudentName4 = sc.next();
            sudentLastName4 = sc.next();
            grade4 = sc.nextInt();

            System.out.println("Enter first and last name " + sudentName4 + sudentLastName4);
            System.out.println("Enter a grade " + grade4);

            sudentName5 = sc.next();
            sudentLastName5 = sc.next();
            grade5 = sc.nextInt();

            System.out.println("Enter first and last name " + sudentName5 + sudentLastName5);
            System.out.println("Enter a grade " + grade5);

            sum = grade1 + grade2 + grade3 + grade4 + grade5;

            System.out.println("Ms Jamse sum of grade is : " + sum);
        }
    }
}


