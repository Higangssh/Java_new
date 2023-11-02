package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * or 연산 
		 * 또는 이라고 읽으면 된다
		 * 
		 * 어느 하나면 true면 결과는 true
		 * 모두다 false 일때만 결과는 fals
		 */
		
		boolean result1 = false || false;
		boolean result2 = false || true;
		boolean result3 = true  || false;
		boolean result4 = true || true;
		
		/*
		 * and 연산 
		 * 그리고 라고 읽으면된다
		 * 
		 * 모두다 true 일떄만 결과는 true
		 * 어느 하나만 false 면 결과는 false
		 *
		 */
		boolean result5 = false && false;
		boolean result6 = false && true;
		boolean result7 = true && false;
		boolean result8 = true && true;
		
		/*
		 * not 연산
		 * ~가 아니면 이라고 읽으면 된다
		 * 
		 * boolean 값을 반전시킨다
		 */
	
		boolean result9 = !true; //false
		boolean result10 = !false; //true
	}
	
}
