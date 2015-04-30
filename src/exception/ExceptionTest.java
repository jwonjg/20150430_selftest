package exception;

public class ExceptionTest {
	public static void main(String[] args) {
		int a = 0;
		double b;
		try{
			b= 100/a;
			System.out.println("Some more codes");
		}catch(ArithmeticException ex){
			a = 1;
			b = 100/a;
		}
	}
}
