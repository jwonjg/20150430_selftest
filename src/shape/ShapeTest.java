package shape;

public class ShapeTest {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Circle circle = new Circle();
		
		rect.draw();
		circle.draw();
		
		Point p1 = new Point();
		p1.setX(2);
		p1.setY(5);
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		
		
		//인터페이스 테스트
		Drawable p3 = new Point(50, 50);
		p3.draw();
		
		//instanceof 테스트
		System.out.println(p3 instanceof Drawable);
		System.out.println(p3 instanceof Point);
		System.out.println(p3 instanceof Rectangle);
//		상속관계 없으므로 에러
//		System.out.println(new Circle() instanceof Rectangle);
		
		
		Point p4 = new ColorPoint(55, 150, "red");
		
		p1.show();
		p2.show();
		p4.show();
	}
}
