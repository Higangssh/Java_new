package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		boolean isWait=false;
		//isWait 이 true 면 기다려요가 대입되고 false 면 기다리지않아요가 대입된다
		String result = isWait ? "기다려요":"기다리지않아요";
		
		System.out.println(result);
		
		String result2=null;
		if(isWait) {
			result2="기다려요";
		}else {
			result2="기다리지 않아요";
		}
		System.out.println(result2);
	}
}
