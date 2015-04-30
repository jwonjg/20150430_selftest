package exception;

public class ExceptionTest2 {
	public static void main(String[] args) {
		ThrowsText tt = new ThrowsText();
		tt.suspiciousMethod2();
		
		try {
			tt.suspiciousMethod();
		} catch (Exception e) {
			System.out.println("에러가 발생했습니다.");
		}
	}
}
