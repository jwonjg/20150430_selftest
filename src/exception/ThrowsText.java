package exception;

import java.io.IOException;

public class ThrowsText {
	public void suspiciousMethod() throws IOException {	//선언 해줘야 함 
		throw new IOException();	//exception
	}

	public void suspiciousMethod2() {
		throw new ArithmeticException();	//runtime exception일 경우
	}

}
