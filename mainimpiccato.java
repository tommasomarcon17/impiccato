//Marcon Tommaso 4BIA

package gioco_impiccato;
import java.util.Scanner;



public class mainimpiccato {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("inserisci la parola da indovinare");
	String parola = scanner.nextLine();
	hangman gioco = new hangman(parola, 5);
	
	while(!gioco.finegioco()) {
		
		System.out.println("\nParola attuale: " + gioco.getProgressi());
		System.out.println("\nTentativi rimasti: " + gioco.getTentativi());
		System.out.println("\nInserisci una lettera");
		char lettera = scanner.next().toLowerCase().charAt(0);
		if(gioco.tentativo(lettera)) {
			System.out.println("\nLettera trovata");
		} else System.out.println("\nLettera non trovata");
	}
	
	if(gioco.controllavittoria()) {
		System.out.println("\nHai vinto");
	} else System.out.println("\nHai perso, la parola era: "+ parola);
	scanner.close();

	}
	
}
