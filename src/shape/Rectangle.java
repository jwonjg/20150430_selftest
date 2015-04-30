package shape;

public class Rectangle extends Shape implements Drawable {
	private int width;
	private int height;
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println("그림판에 그려진 사각형을 저장합니다.");
	}

	@Override
	public double calculateArea() {
		return width*height;
	}

	@Override
	public void visible(boolean isVisible) {
		if(!isVisible) System.out.println("사각형을 지웠습니다.");
		else System.out.println("사각형을 그렸습니다.");
	}
}
