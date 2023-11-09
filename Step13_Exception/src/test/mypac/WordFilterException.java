package test.mypac;

public class WordFilterException extends RuntimeException {

	public WordFilterException(String msg) {
		super(msg); // 부모 생성자에 전달하면서 객체가 생성 되도록 한다.
	}
}
