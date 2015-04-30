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
	public void visible(boolean isVisible) {
		if(!isVisible) System.out.println("좌표[x="+getX()+", y="+getY()+"]에 "+color+"색 점을 지웠습니다.");
		else System.out.println("좌표[x="+getX()+", y="+getY()+"]에 "+color+"색 점을 그렸습니다.");
	}
}
