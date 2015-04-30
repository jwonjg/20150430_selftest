package shape;

public class Triangle extends Shape implements Drawable {
	int height;
	int width;
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void draw() {
		System.out.println("그림판에 그려진 삼각형을 저장합니다.");
	}
	
	@Override
	public double calculateArea() {
		return height*width/2;
	}

	@Override
	public void visible(boolean isVisible) {
		if(!isVisible) System.out.println("삼각형을 지웠습니다.");
		else System.out.println("삼각형을 그렸습니다.");
	}
}
