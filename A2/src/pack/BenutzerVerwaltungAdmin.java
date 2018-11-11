package pack;
import java.util.ArrayList;

public class BenutzerVerwaltungAdmin implements BenutzerVerwaltung{

	ArrayList<Benutzer> nutzer; //default frage
	
	public void BenutzerEintragen(Benutzer benutzer) {
		nutzer.add(benutzer);
	}

	public boolean benutzerOK(Benutzer benutzer) {
		for (Benutzer ausgabe : nutzer) {
			if (ausgabe.equals(benutzer))
				return true;
		}
		return false;
	}

}
