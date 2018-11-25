package pack;

import junit.framework.TestCase;

public class BenutzerTest extends TestCase{
	private Benutzer ben1;
	protected void setUp() throws Exception {
		 super.setUp();
		 char[] pw = {'p','w','d'};
		 ben1 = new Benutzer("uid", pw);//-> setUp()
	}
		 protected void tearDown() throws Exception {
		 super.tearDown();
		 }
		 public void testBenutzerStringString() {
			 assertEquals("uid",ben1.userId);
			 assertEquals("pwd", String.valueOf(ben1.passWort));
			}
		 public void testEqualsBenutzer() {
			 char[] pw = {'p','w','d'};
			 Benutzer ben2 = new Benutzer("uid", pw);
			 assertEquals(ben1,ben2);
			 assertNotSame(ben1,ben2);
			 ben1 = ben2;
			 assertSame(ben1,ben2);
			 Benutzer ben3 = new Benutzer("ui", pw);
			 assertFalse(ben1.equals(ben3));
			}
		 
		 public void testToStringBenutzer() {
			 assertEquals(ben1.toString(), "userId = " + ben1.userId + " Passwort: " + String.copyValueOf(ben1.passWort));
		 }
}