package test.main;

public class MainClass04 {
	
	// staticc 메소드 안에서 사용하려면 static 예약어가 필요!
	public static class Gura{
		public void say() {
			System.out.println("안녕! 나는 구라야!");
		}
	
	}
	
	
	public static void main(String[] args) {
		Gura g = new Gura();
		g.say();
		/*
		 * 메소드 내부에도 클래스를 정의 할수 있다
		 * 메소드 내부에서만 사용가능 
		 * Local Inner Class 지역내부 클래스
		 */
		class Cat{
			public void say() {
				System.out.println("야옹~");
			}
		}
		Cat c =new Cat();
		c.say();
	}
}