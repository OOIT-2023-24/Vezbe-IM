package geometry;

import java.awt.Graphics;

public class Rectangle extends Shape {

	private Point upperLeft;
	private int width;
	private int heigth;
	
	public Rectangle() {
		
	}

	public Rectangle(Point upperLeft, int width, int heigth) {
		this.upperLeft = upperLeft;
		this.width = width;
		this.heigth = heigth;
	}
	
	public Rectangle(Point upperLeft, int width, int heigth,boolean selected) {
		this(upperLeft,width,heigth);
		this.selected = selected;
	}
	
	@Override
	public void draw(Graphics g) {
		g.drawRect(upperLeft.getX(), upperLeft.getY(), width, heigth);
	}

	public int area() {
		return width * heigth;
	}

	public int circumference() {
		return 2 * width + 2 * heigth;
	}
	
	public boolean contains(int x, int y) {
		return (x >= upperLeft.getX() && x <= upperLeft.getX() + width)
				&& (y >= upperLeft.getY() && y <= upperLeft.getY() + heigth);
	}
	
	public boolean contains(Point p) {
		return contains(p.getX(), p.getY());
	}
	
	@Override
	public String toString() {
		return "Upper left: (" + upperLeft.getX() + "," + upperLeft.getY() + 
				"), width = " + width + ",heigth = " + heigth;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Rectangle) {
			Rectangle temp = (Rectangle) o;
			if(width == temp.getWidth() && heigth == temp.getHeigth()) {
				return true;
			}
		}
		return false;
	}

	public Point getUpperLeft() {
		return upperLeft;
	}

	public void setUpperLeft(Point upperLeft) {
		this.upperLeft = upperLeft;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

}
