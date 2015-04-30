package shape;

public class Point implements Drawable, Visible{
	private int x;
	private int y;

	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	@Override	
	public void draw() {
		System.out.println("좌표[x="+x+", y="+y+"]에 그린 점을 그림판에 저장합니다.");
	}

	@Override
	public void visible(boolean isVisible) {
		if(!isVisible) System.out.println("좌표[x="+x+", y="+y+"]에 점을 지웠습니다.");
		else System.out.println("좌표[x="+x+", y="+y+"]에 점을 그렸습니다.");
	}
}
