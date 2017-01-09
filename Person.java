package Klassen.Datenbank;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class Person {

	static Person personZumEinlesen = new Person(null, null, null, null);
	
	public static void main (String [] args) {
		createPerson();

		getGlobaleListe();

	}

	static public List<String> globaleListe = new ArrayList<String>();

	public static String vorname = "-";
	public static String nachname = "-";
	public static String email = "-";
	public static String telefon = "-";

	// constructor
	public Person (String vorname, String nachname, String email, String telefon) {
		Person.vorname = vorname;
		Person.nachname = nachname;
		Person.email = email;
		Person.telefon = telefon;
	}

	static public void addPerson (Person tempPerson) {
		globaleListe.add(tempPerson.vorname + "," + tempPerson.nachname + "," + tempPerson.email + "," + tempPerson.telefon + ";\n");
	}

	// set ganze Person
	public static void createPerson() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie den Vornamen ein.");
		String vorname = scan.next();
		System.out.println("Geben Sie den Nachnamen ein.");
		String nachname = scan.next();
		System.out.println("Geben Sie die Email-Adresse ein.");
		String email = scan.next();
		System.out.println("Geben Sie die Telefonnummer ein.");
		String telefon = scan.next();
		scan.close();

		Person tempPerson = new Person(vorname, nachname, email, telefon);
		
		addPerson(tempPerson);

		
		
		System.out.println("\nNeuer Eintrag angelegt.");
	}

	public static void getPerson (String info1, String info2) {

		// TODO regex nach den infos
		System.out.println("Vorname: " + vorname);
		System.out.println("Nachname: " + nachname);
		System.out.println("Email: " + email);
		System.out.println("Telefon: " + telefon);
	}

	/*
	// get'n set vorname
	public static String getVorname() {
		return vorname;
	}
	public static void setVorname(String vorname) {
		Person.vorname = vorname;
	}


	// get'n set nachname
	public static String getNachname() {
		return nachname;
	}
	public static void setNachname(String nachname) {
		Person.nachname = nachname;
	}


	// get'n set email
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		Person.email = email;
	}


	// get'n set telefon
	public static String getTelefon() {
		return telefon;
	}
	public static void setTelefon(String telefon) {
		Person.telefon = telefon;
	}

	 */

	static public void getGlobaleListe () {
		for (int i = 0; i < globaleListe.size(); i++) {
			System.out.println(globaleListe.get(i));
		}
	}

	// Person loeschen
	public static void deletePerson () {
		System.out.println("Wie lautet der Vorname und/oder der Nachname der zu loeschenden Person?"); // Funktion einfuegen um nach ID/email/telefon zu fragen?

		Scanner scan = new Scanner(System.in);
		String nameOrNames = scan.next();

		// checkt den String nach Leerzeichen und teilt Vorname und Nachname ein wenn Leerzeichen vorhanden oder sieht den ganzen String als vorname und nachname
		if (nameOrNames.contains(" ")) {
			for (int i = 0; i < nameOrNames.length(); i++) {
				if (nameOrNames.charAt(i) == ' ') {
					String vorname = nameOrNames.substring(0, i);
					String nachname = nameOrNames.substring(i + 1);
				}
			} 
		} else {
			String vorname = nameOrNames;
			String nachname = nameOrNames;
		}
		scan.close();
		// regex TODO

		//globaleListe.getIndex oder so, regex nach Person mit index x
		//globaleListe.remove(x);


	}
}