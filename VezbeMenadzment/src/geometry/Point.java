package geometry;

public class Point {
	
	private int x;
	private int y;
	private boolean selected;
	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y, boolean selected) {
		this(x,y);
		this.selected = selected;
	}
	

	public double distance(Point p1) {
		int dx = this.x - p1.getX();
		int dy = this.y - p1.getY();
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	public boolean contains(int x, int y) {
		return distance(new Point(x,y)) <=3 ;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Point) {
			Point temp = (Point) o;
			if(x == temp.getX() && y == temp.getY()) {
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
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
