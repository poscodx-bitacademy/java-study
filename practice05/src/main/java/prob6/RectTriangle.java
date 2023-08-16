package prob6;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (width * height) / 2;
	}

	@Override
	public double getPerimeter() {
		return (width + height + Math.sqrt(width * width + height * height));
	}

}
