package pack;

public class main {
	public static void main(String[] args) {
		BenutzerVerwaltungAdmin admin = new BenutzerVerwaltungAdmin();
		 char[] pw = {'p','w','d'};
		 Benutzer ben1 = new Benutzer("uid", pw);//-> setUp()
		 
		 admin.BenutzerEintragen(ben1);
		 System.out.print(admin.benutzerOK(ben1));
	}
}
