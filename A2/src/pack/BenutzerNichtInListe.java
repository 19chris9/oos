package pack;

public class BenutzerNichtInListe extends
ArithmeticException {
	BenutzerNichtInListe(String ausgabe) {
			super(ausgabe);
	}
}
