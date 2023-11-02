package test.main;
/*
 * int: Integer
 * char: Character
 * 
 * - 때로는 기본데이터 type 의 참조데이터 type 이 필요할 때가 있다.
 * - 기본데이터 type 을 객체에 포장(boxing)하는 형태이다.
 * - boxing 과 unboxing 은 자동으로 되기 때문에 프로그래머가 신경을 쓸 필요는 없다
 */
public class MainClass01 {
	public static void main(String[] args) {
		//기본 데이터 type 지역변수
		int num1=10;
		//참조 데이터 type 지역변수
		//Integer num2= new Integer(10); 이렇게 안해도됨
		Integer num2=10;
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		// 정수 10을 문자열 "10" 으로 변환해서 리턴해주는 메소드도 사용가능
		String result=num2.toString();
		
		int result4 =Integer.parseInt("999");
		
	}
}
