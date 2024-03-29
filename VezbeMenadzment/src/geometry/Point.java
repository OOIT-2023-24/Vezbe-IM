package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Point extends Shape {

	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x, int y, boolean selected) {
		this(x, y);
		this.selected = selected;
	}

	@Override
	public void draw(Graphics g) {
		// Tacka ce imati izgled znaka +
				g.drawLine(x-2, y, x+2, y); // Horizontalna linija
				g.drawLine(x, y-2, x, y+2); // Vertikalna linija
				if(selected) {
					g.setColor(Color.BLUE);
					g.drawRect(x-3, y-3, 6, 6);
				}
	}
	
	@Override
	public int compareTo(Shape o) {
		Point coordinateStart = new Point(0,0);
		if(o instanceof Point) {
			Point temp = (Point)o;
			return (int)(distance(coordinateStart) - temp.distance(coordinateStart));
		}
		return 0;
	}
	
	
	@Override
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void moveBy(int byX, int byY) {
		x += byX;
		// isto kao i x = x + byX;
		y += byY;
	}

	public double distance(Point p1) {
		int dx = this.x - p1.getX();
		int dy = this.y - p1.getY();
		return Math.sqrt(dx * dx + dy * dy);
	}

	public boolean contains(int x, int y) {
		return distance(new Point(x, y)) <= 3;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Point) {
			Point temp = (Point) o;
			if (x == temp.getX() && y == temp.getY()) {
				return true;
			}
		}
		return false;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	
}
