package geometry;

import java.awt.Graphics;

public class Donut extends Circle {
	private int innerRadius;

	public Donut() {
		super();
	}

	public Donut(Point center, int radius, int innerRadius) {
		super(center,radius);
		this.innerRadius = innerRadius;
	}

	public Donut(Point center, int radius, int innerRadius, boolean selected) {
//		super(center,radius,selected);
//		this.innerRadius = innerRadius;
		this(center,radius,innerRadius);
		this.selected = selected;
	}
	
	@Override
	public void draw(Graphics g) {
		super.draw(g);
		g.drawOval(getCenter().getX()-innerRadius, getCenter().getY()-innerRadius, 
				innerRadius*2, innerRadius*2);
	}
	
	@Override
	public boolean contains(int x, int y) {
		return super.contains(x, y) && 
				getCenter().distance(new Point(x,y)) >= innerRadius;
	}
	
	@Override
	public boolean contains(Point p) {
		return contains(p.getX(), p.getY());
	}
	
	@Override
	public double area() {
		return super.area() - innerRadius*innerRadius*Math.PI;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", inner radius = " + innerRadius;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Donut) {
			Donut temp = (Donut) o;
			if(getRadius() == temp.getRadius() && getCenter().equals(temp.getCenter())
					&& innerRadius == temp.getInnerRadius()) {
				return true;
			}
		}
		return false;
	}

	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}

}
