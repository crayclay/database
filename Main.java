package Klassen.Datenbank;

import java.util.Scanner;

public class Main {
	
	static void getGlobalList() {
		//Person.getList();
	}

	static void createPerson() {
		Person.createPerson();
	}

	static void deletePerson() {
		Person.deletePerson();
	}

	static void getPerson() {
		//Person.getPerson();
	}

	// 
	static public void InitiiereEingabe() {
		System.out.println("Geben Sie die entsprechende Zahl ein (1 fuer 1. etc.)\nund druecken sie Enter.");
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()) {
			int i = scan.nextInt();
			switch (i) {
			case 1: getGlobalList();
			case 2: getPerson(); // TODO regex.getPerson 
			case 3: createPerson();
			case 4: deletePerson();

			default: ErneuteEingabe();
			}
		}
		scan.close();
	}

	static public void ErneuteEingabe() {
		System.out.println("Ungueltige Eingabe!\n\n"
				+ "Geben Sie die entsprechende Zahl ein (1 fuer 1. etc.)\nund druecken sie Enter.");
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()) {
			int i = scan.nextInt();
			switch (i) {
			case 1: //getList();
			case 2: getPerson(); // TODO regex.getPerson 
			case 3: createPerson();
			case 4: deletePerson();
			case 5: System.exit(0); // EXIT
			
			default: ErneuteEingabe();
			}
		}
		scan.close();
	}

	public static void main (String [] args) {
		System.out.println("Welche Aktion moechten sie ausfuehren?\n"
				+ "  1. Alles anzeigen\n"
				+ "  2. Person suchen\n"
				+ "  3. Person hinzufuegen\n"
				+ "  4. Person loeschen\n"
				+ "  5. Programm schliessen\n\n");
		InitiiereEingabe();
	}
}