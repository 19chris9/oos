
public class main {

	public static void main(String[] args) {
		int n = 10;
		int[][] dreieck = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == 0 && j == 0) {
					dreieck[i][j] = 1;
					System.out.println(dreieck[i][j] + " ");
				}
				else if (j == 0) {
					dreieck[i][j] = 1;
					System.out.print(dreieck[i][j] + " ");
				}
				else if (j == i) {
					dreieck[i][j] = 1;
					System.out.println(dreieck[i][j] + " ");
				}
				else {
					dreieck[i][j] = dreieck[i-1][j-1] + dreieck[i-1][j];
					System.out.print(dreieck[i][j] + " ");
				}
			}
		}
		KreisVererb k = new KreisVererb(1,2,3);
		System.out.println(k.getFlaeche());
		
		KreisAgg x = new KreisAgg(1,2,3);
		KreisAgg x2 = x.clone1();
		x2.rad = 29;
		System.out.println(x.rad);
		
		Form[] formen = new Form[4];
		formen[0] = new Rechteck(1,1,10,10);
		formen[1] = new Rechteck(10,10,100,100);
		formen[2] = new KreisAgg(1,1,10);
		formen[3] = new KreisAgg(10,10,100);
		for (int i = 0; i < formen.length; i++)
			System.out.println(formen[i].flaechenInhalt());
	}
}
