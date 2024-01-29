package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

	private Point center;
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(Point center, int radius,boolean selected) {
		this(center,radius);
		this.selected = selected;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawOval(center.getX()-radius, center.getY()-radius, radius*2, radius*2);
		if(selected) {
			g.setColor(Color.BLUE);
			g.drawRect(center.getX()-3, center.getY()-3, 6, 6);
			g.drawRect(center.getX()+radius-3, center.getY()-3, 6, 6);
			g.drawRect(center.getX()-radius-3, center.getY()-3, 6, 6);
			g.drawRect(center.getX()-3, center.getY()+radius-3, 6, 6);
			g.drawRect(center.getX()-3, center.getY()-radius-3, 6, 6);
		}
	}
	
	@Override
	public int compareTo(Shape o) {
		if(o instanceof Circle) {
			Circle temp = (Circle)o;
			return (int) (area() - temp.area());
		}
		return 0;
	}
	
	@Override
	public void moveTo(int x, int y) {
		center.moveTo(x, y);
		
	}

	@Override
	public void moveBy(int byX, int byY) {
		center.moveBy(byX, byY);
		
	}
	
	public double area() {
		return Math.PI*radius*radius;
	}
	
	public double circumference() {
		return 2*radius*Math.PI;
	}
	
	public boolean contains(int x, int y) {
		return center.distance(new Point(x,y)) <= radius;
	}
	
	public boolean contains(Point p) {
		return contains(p.getX(), p.getY());
	}
	
	@Override
	public String toString() {
		return "Center: (" + center.getX() + "," + center.getY() + "), radius = " + radius;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Circle) {
			Circle temp = (Circle) o;
			if(radius == temp.getRadius() && center.equals(temp.getCenter())) {
				return true;
			}
		}
		return false;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) throws Exception {
		if(radius <= 0) {
			throw new Exception("Radijus ne moze biti postavljen na nulu ili "
					+ "na negativnu vrednost");
		}else {
			this.radius = radius;
		}
		
	}

	

}
