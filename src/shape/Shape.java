package shape;

public abstract class Shape implements Visible {
	//캡슐화 접근제한자 private를 설정하면 상속받은 클래스에서도 변수에 접근할 수 없다.
	private String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	abstract public double calculateArea();
}
