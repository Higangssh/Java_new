package text.main;
/* 
 * 논리형 (boolean)
 * true,false 두가지 값중 하나이다.
 * true,false 를 직접 쓰거나 비교연산 혹은 논리 연산의 결과로 얻어낼수 있다.
 * 참과 거짓을 나타내는 type
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		boolean isRun=true;
		
		if(isRun) {
			System.out.println("달려요");
		}
		
		boolean isGreater=10>1;
		boolean result=true||false;
		result=false;
	}
}
