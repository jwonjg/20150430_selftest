package shape;

public class ShapeTest {
	public static void main(String[] args) {
//		1. 상속
//		Point 클래스를 상속한 ColorPoint 클래스로 만들어진 인스턴스는
//		별도로 정의하지 않은 부모 클래스의 draw() 메서드를 사용할 수 있다.
//		visible()메서드는 부모 클래스의 메서드를 오버라이딩하여 다르게 정의하였다.
		ColorPoint colorPoint = new ColorPoint(50, 50, "빨강");
		colorPoint.visible(true);
		colorPoint.draw();
		
//		2. 캡슐화
//		Point 클래스에 정의된 변수 x와 y는 접근제한자가 private로 정의되어
//		Point point = new Point();
//		point.x = 100;
//		위와 같이 x의 갑을 설정할 수 없다.
//		이는 캡슐화되어 정보 은닉된 케이스라 할 수 있다.
//		또한 Point(int x, int y) 생성자는 매개변수와 반환타입을 통해 
//		내부 처리를 모르더라도 사용할 수 있다.
		Point point = new Point(10, 20);
		
//		3. 다형성 - 오버로딩
//		Circle 클래스의 calculateArea() 메서드는 매개변수가 없는 경우와
//		calculateArea(int radius) 와 같이 매개변수가 설정된 경우의 두 가지로 오버로딩되었다.
		Circle circle = new Circle();
		circle.setRadius(20);
		System.out.println("circle.calculateArea():"+circle.calculateArea());
		System.out.println("circle.calculateArea(30):"+circle.calculateArea(30));
		
//		3. 다형성 - 오버라이딩
//		ColorPoint 클래스의 visible(boolean isVisible) 메서드는 Point 클래스의 매서드르 오버라이딩하여
//		다르게 정의하였다.
		Point pointOverriding = new ColorPoint(30, 50, "파랑");
		pointOverriding.visible(true);
		pointOverriding.visible(false);
	}
}
