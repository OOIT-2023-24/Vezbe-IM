package geometry;

public class Line {

	private Point startPoint;
	private Point endPoint;
	private boolean selected;
	
	public double length() {
		return startPoint.distance(endPoint);
	}
	
	@Override
	public String toString() {
		return "(" + startPoint.getX() + "," + startPoint.getY() + 
				") --> (" + endPoint.getX() + "," + endPoint.getY() + ")";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Line) {
			Line temp = (Line) o;
			if(startPoint.equals(temp.getStartPoint()) &&
					endPoint.equals(temp.getEndPoint())) {
				return true;
			}
		}
		return false;
	}
	
	public Point getStartPoint() {
		return startPoint;
	}
	
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	
	public Point getEndPoint() {
		return endPoint;
	}
	
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
