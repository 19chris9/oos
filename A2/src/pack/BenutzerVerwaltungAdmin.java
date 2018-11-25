package pack;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class BenutzerVerwaltungAdmin implements BenutzerVerwaltung{

	ArrayList<Benutzer> nutzer = new ArrayList<>();
	
	BenutzerVerwaltungAdmin() {
		dbInitialisieren();
	}
	
	public void BenutzerEintragen(Benutzer benutzer) {
		 try {
			 FileInputStream fs = new FileInputStream("fos.s");
			 ObjectInputStream is = new ObjectInputStream(fs);
			 nutzer = (ArrayList<Benutzer>) is.readObject();
			 is.close();
			 } catch (ClassNotFoundException e) {
			 e.printStackTrace();
			 } catch (IOException e) {
			 e.printStackTrace();
			 }

		
		if(!nutzer.contains(benutzer)) {
			nutzer.add(benutzer);
			dbInitialisieren();
		}
		else
			throw new BenutzerBereitsInListe("Benutzer bereits in der Liste!");
	}

	public boolean benutzerOK(Benutzer benutzer) {
		 try {
			 FileInputStream fs = new FileInputStream("fos.s");
			 ObjectInputStream is = new ObjectInputStream(fs);
			 nutzer = (ArrayList<Benutzer>) is.readObject();
			 is.close();
			 } catch (ClassNotFoundException e) {
			 e.printStackTrace();
			 } catch (IOException e) {
			 e.printStackTrace();
			 }
		 
		for (Benutzer ausgabe : nutzer) {
			if (ausgabe.equals(benutzer))
				return true;
		}
		return false;
	}

	public void benutzerLöschen(Benutzer benutzer) {
		 try {
			 FileInputStream fs = new FileInputStream("fos.s");
			 ObjectInputStream is = new ObjectInputStream(fs);
			 nutzer = (ArrayList<Benutzer>) is.readObject();
			 is.close();
			 } catch (ClassNotFoundException e) {
			 e.printStackTrace();
			 } catch (IOException e) {
			 e.printStackTrace();
			 }
		 
		if(nutzer.contains(benutzer)) {
			nutzer.remove(benutzer);
			dbInitialisieren();
		}
		else
			throw new BenutzerNichtInListe("Benutzer nicht in der Liste!");
		
	}
	
	public void dbInitialisieren() {
		try {
			 FileOutputStream fs = new FileOutputStream("fos.s");
			 ObjectOutputStream os = new ObjectOutputStream(fs);
			 os.writeObject(nutzer);
			 os.close();
			 } catch (IOException e) {
			 e.printStackTrace();
			 }
	}
}
