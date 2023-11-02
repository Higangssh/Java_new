package test.mypac;

//가상의 옛날 가정용 전화기 객체를 생성할 설계도
public class Phone { // 어떤 클래스도 상속받지 않으면 자동으로 extend Object 된다.
	
	public Phone() {
		System.out.println("Phone 생성자 호출됨");
	}
	public void call() {
		System.out.println("전화를 걸어요!");
		
	}
	
}
