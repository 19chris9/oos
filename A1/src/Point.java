
public class Point {
	
	int x, y;
	
	Point() {
		x = 0;
		y = 0;
	}
	Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	Point getLocation() {
		return this;
	}
	void setLocation(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void move(int dx, int dy) {
		x += dx;
		y += dy;
	}
	boolean equals(Point p) {
		if(this.x == p.x && this.y == p.y)
			return true;
		return false;
	}
	String toString1() {
		return "x= " + Integer.toString(x) + " y= " + Integer.toString(y);
	}
}
