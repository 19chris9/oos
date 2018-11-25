package pack;

import java.io.Serializable;

public class Benutzer implements Serializable{
	String userId;
	char[] passWort;
	
	Benutzer() {
		userId = "";
	}
	Benutzer(String user, char[] pw) {
		userId = user;
		passWort = pw;
	}
	
	public boolean equals(Object benutzer) {
		if (userId.equals(((Benutzer) benutzer).userId) && String.copyValueOf(passWort).equals(String.copyValueOf(((Benutzer) benutzer).passWort)))
			return true;
		return false;
	}
	
	public String toString() {
		return "userId = " + userId + " Passwort: " + String.copyValueOf(passWort);
	}
}
