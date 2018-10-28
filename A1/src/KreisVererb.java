
public class KreisVererb extends Point {
	double rad;
	
	KreisVererb() {
		x = 0;
		y = 0;
	}
	KreisVererb(KreisVererb k) {
		this.x = k.x;
		this.y = k.y;
		this.rad = k.rad;
	}
	KreisVererb(int x, int y, int rad) {
		this.x = x;
		this.y = y;
		this.rad = rad;
	}
	double getRadius() {
		return rad;
	}
	void setRadius(double rad) {
		this.rad = rad;
	}
	double getFlaeche() {
		return Math.PI * rad * rad;
	}
	
	boolean equals(KreisVererb k) {
		if(this.x == k.x && this.y == k.y && this.rad == k.rad)
			return true;
		return false;
	}
	String toString1() {
		return "x= " + Integer.toString(x) + " y= " + Integer.toString(y) + " Radius= " + Double.toString(rad);
	}
}
