package test.main;

public class MainClass06 {
	
	//필드
	//static 메소드에서 사용하는 필드느 static 필드로 만들어야 사용할수 있다.
	static int num =999;
	
	public static void main(String[] args) {
	// 같은 클래스의  num 이라는 필드는 동일한 클래스의 맴버이기 떄문에 생략가능
		int result = num+1;
	}
	//메소드
	public void test() {
		
	}
}
