package shape;

public class Rectangle extends Shape implements Drawable {
	int width;
	int height;
	
	public void draw() {
		System.out.println("사각형을 그렸습니다.");
	}

	@Override
	public double calculateArea() {
		return width*height;
	}
}
