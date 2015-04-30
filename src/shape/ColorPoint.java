package shape;

public class ColorPoint extends Point {
	String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void show() {
		System.out.println("좌표[x="+super.getX()+", y="+super.getY()+", color="+color+"]에 점을 그렸습니다.");
	}
}
