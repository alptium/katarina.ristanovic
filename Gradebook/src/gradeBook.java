import java.util.Scanner;

public class gradeBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try(Scanner sc = new Scanner(System.in)) {
			
			int suma = 0;
			
			
			String ucenikIme1 = "Marija";
			String ucenikPrezime1 = "Jovic";
			System.out.println("Unesite ocenu " + ucenikIme1 + " " +ucenikPrezime1);
			int ocena1 = sc.nextInt();
			
			String ucenikiIme2 = "Marko";
			String ucenikiPrezime2 = "Petrovic";
			System.out.println("Unesite ocenu " + ucenikiIme2 + " " + ucenikiPrezime2);
			int ocena2 = sc.nextInt();
			
			String ucenikIme3 = "Ivana";
			String ucenikPrezime3 = "Krstic";
			System.out.println("Unesite ocenu  " + ucenikIme3 + " " + ucenikPrezime3 );
			int ocena3 = sc.nextInt();
			
			String ucenikIme4 = "Nenad";
			String ucenikPrezime4 = "Colic";
			System.out.println("Unesite ocenu " + ucenikIme4 + " " + ucenikPrezime4 );
			int ocena4 = sc.nextInt();
			
			String ucenikIme5 = "Jelena";
			String ucenikPrezime5 = "Joksimovic";
			System.out.println("Unesite ocenu " + ucenikIme5 + " " + ucenikPrezime5);
			int ocena5 = sc.nextInt();
			
			
			
			suma  = ocena1 + ocena2 + ocena3 + ocena4 + ocena5;
			
			int prosekOcena = suma/5;
			
			
			
			System.out.println("Prosek ocena Ms James je : " + prosekOcena);
			
		}


	}

}
