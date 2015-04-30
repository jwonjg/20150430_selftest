package shape;

public class Circle extends Shape implements Drawable {
	private int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("그림판에 그려진 원을 저장합니다.");
	}
	
	@Override
	public double calculateArea() {
		return radius*radius*Math.PI;
	}

	public double calculateArea(int radius) {
		return radius*radius*Math.PI;
	}

	@Override
	public void visible(boolean isVisible) {
		if(!isVisible) System.out.println("원을 지웠습니다.");
		else System.out.println("원을 그렸습니다.");
	}
}
