package Klassen.Datenbank;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Dateiverwaltung {

	List<String> globaleListe = new ArrayList<String>();

	public void saveList() {
		try {
			FileOutputStream fos = new FileOutputStream("liste.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);   
			oos.writeObject(globaleListe); // globaleListe schreiben in datei
			oos.close(); 
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// Von der Festplatte laden
	public void readList () {
		ArrayList<String> liste = new ArrayList<String>();

		// TODO datei kann nicht gelesen werden, da sie nicht da ist xD
		try {
			FileInputStream fis = new FileInputStream("liste.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			liste = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
		}
		catch (ClassNotFoundException c) {
			System.out.println("Class not found Exception");
			c.printStackTrace();
			return;
		}
		/* zum auslesen
		for(String eintrag: liste){
			System.out.println(eintrag);
		}
		*/
	}
}
