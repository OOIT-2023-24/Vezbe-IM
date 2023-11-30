package geometry;

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

	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}

}
