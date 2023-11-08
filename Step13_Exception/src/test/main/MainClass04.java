package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다");
		
		try {
			//스레드를 일정시간 지연 시키기(mili second 단위로 숫자를 전달하면 된다)
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//부모 class에 runtime Exception 이 없으면 무조건 try catch 를 묶어야한다. 있으면 필요에따라 선택
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
