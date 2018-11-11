package pack;

public class Benutzer {
	String userId;
	char[] passWort;
	
	Benutzer() {
		userId = "";
	}
	Benutzer(String user, char[] pw) {
		userId = user;
		passWort = pw;
	}
	
	boolean equals(Benutzer benutzer) {
		if (userId == benutzer.userId && String.copyValueOf(passWort) == String.copyValueOf(benutzer.passWort))
			return true;
		return false;
	}
	
	public String toString() {
		return "userId = " + userId + " Passwort: " + String.copyValueOf(passWort);
	}
}
