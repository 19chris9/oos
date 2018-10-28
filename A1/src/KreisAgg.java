
public class KreisAgg implements Form {
	Point p;
	double rad;
	
	KreisAgg(KreisAgg k) {
		p = new Point(k.p);
		this.rad = k.rad;
	}
	KreisAgg(int x, int y, double rad) {
		p = new Point(x, y);
		this.rad = rad;
	}
	public double flaechenInhalt() {
		return Math.PI * rad * rad;
	}
	boolean equals(KreisAgg k) {
		if(p.x == k.p.x && p.y == k.p.y && this.rad == k.rad)
			return true;
		return false;
	}
	KreisAgg clone1() {
		KreisAgg temp = new KreisAgg(this);
		return temp;
	}
	String toString1() {
		return "x= " + Integer.toString(p.x) + " y= " + Integer.toString(p.y) + " Radius= " + Double.toString(rad);
	}
}
