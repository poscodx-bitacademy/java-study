package paint;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point(10, 10);
//		point1.setX(10);
//		point1.setY(10);
		drawPoint(point1);
		// point1.disappear();
		point1.show(false);
		
		Point point2  = new ColorPoint();
		point2.setX(20);
		point2.setY(20);
		((ColorPoint)point2).setColor("red");
		drawPoint(point2);

		Rect rect = new Rect();
		drawRect(rect);
		
	}

	public static void drawPoint(Point point) {
		point.show(true);
	}
	
//	public static void drawColorPoint(ColorPoint colorPoint) {
//		colorPoint.show();
//	}
	
	public static void drawRect(Rect rect) {
		rect.draw();
	}
	
}
