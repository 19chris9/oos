package pack;

import junit.framework.TestCase;

public class BenutzerVerwaltungAdminTest extends TestCase{
	private BenutzerVerwaltungAdmin admin;
	private Benutzer ben1, ben2, ben3;
	protected void setUp() throws Exception {
		 super.setUp();
		 char[] pw = {'p','w','d'};
		 admin = new BenutzerVerwaltungAdmin();
		 ben1 = new Benutzer("1", pw);
		 ben2 = new Benutzer("2", pw);
		 ben3 = new Benutzer("3", pw);
		 admin.BenutzerEintragen(ben1);
		 admin.BenutzerEintragen(ben2);
	}
	
	 protected void tearDown() throws Exception {
		 super.tearDown();
	 }
	 
	 public void testBenutzerEintragen() {
		 try { 
			 assertTrue(admin.benutzerOK(ben1));
			 assertFalse(admin.benutzerOK(ben3));
			 admin.BenutzerEintragen(ben3);
			 assertTrue(admin.benutzerOK(ben3));
			 admin.BenutzerEintragen(ben1);
			 fail("ben1 ist zwei mal drin");
		 } catch (BenutzerBereitsInListe e) {
		 e.printStackTrace();}

	 }
	 
	 public void testBenutzerOk() {
		 assertTrue(admin.benutzerOK(ben1));
		 assertTrue(admin.benutzerOK(ben2));
		 assertFalse(admin.benutzerOK(ben3));
	 }
	 
		public void testBenutzerLöschen() {
			assertTrue(admin.benutzerOK(ben1));
			admin.benutzerLöschen(ben1);
			assertFalse(admin.benutzerOK(ben1));
			try {
				assertFalse(admin.benutzerOK(ben3));
				admin.benutzerLöschen(ben3);
				fail("ben3 war nicht drin");
			} catch (BenutzerNichtInListe e){
				e.printStackTrace();
			}
			
		}
}
