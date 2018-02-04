import java.util.Scanner;

public class kalkulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc = new Scanner(System.in)) {
			
			int rezultat = 0;
			
			System.out.println("Upisite prvi broj: ");
			
			int prviBroj = sc.nextInt();
			
			System.out.println("Izaberite operaciju n + , - , * , / ");
			String operacija = sc.next();
			
			
		
			System.out.println("Upisite drugi broj");
			int drugiBroj = sc.nextInt();
			
		
			if(operacija.equals("+")) {
				rezultat = prviBroj + drugiBroj;
				
			} else if(operacija.equals("-")) {
				rezultat = prviBroj - drugiBroj;
				
			} else if(operacija.equals("*")) {
				rezultat = prviBroj * drugiBroj;	
				
			} else if(operacija.equals("/")) {
				rezultat = prviBroj / drugiBroj;			
			}
			
			System.out.println("Prvi broj je : " + prviBroj);
			System.out.println("Drugi broj je: " + drugiBroj);
			System.out.println("Rezultat je : " + rezultat);
		}

	}

}
