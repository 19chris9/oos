
public class Rechteck implements Form {
	Point a;
	Point b;
	
	Rechteck(Rechteck r) {
		a = new Point(r.a);
		b = new Point(r.b);
	}
	Rechteck(int ax, int ay, int bx, int by) {
		a = new Point(ax, ay);
		b = new Point(bx, by);
	}
	public double flaechenInhalt() {
		return (b.x - a.x) * (b.y - a.y);
	}
	boolean equals(Rechteck r) {
		if(a.x == r.a.x && a.y == r.a.y && b.x == r.b.x && b.y == r.b.y)
			return true;
		return false;
	}
	Rechteck clone1() {
		Rechteck temp = new Rechteck(this);
		return temp;
	}
	String toString1() {
		return "ax= " + Integer.toString(a.x) + " ay= " + Integer.toString(a.y) + " bx= " + Integer.toString(b.x) + " by= " + Integer.toString(b.y);
	}
}
