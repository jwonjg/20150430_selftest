package shape;

public class Circle extends Shape implements Drawable {
	int radius;
	
	public void draw() {
		System.out.println("원을 그렸습니다.");
	}
	
	@Override
	public double calculateArea() {
		return radius*radius*Math.PI;
	}
}
