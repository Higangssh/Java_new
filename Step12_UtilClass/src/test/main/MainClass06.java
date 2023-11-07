package test.main;

import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		
		useNums();
		useNums(10);
		useNums(10,20);
		useNums(10,20,30);
		
		useStrings();
		useStrings("kim","lee","park");
		
		useCars();
		useCars(new Car("소나타"));
		useCars(new Car("프라이드"), new Car("아반떼"));
	
	}
	//매개변수 타입을 여래개를 전달받는 매소드
	public static void useNums(Integer...nums) {//nums 는 Interger[] 이다.
		
	}
	//매개변수 타입을 여래개를 전달받는 매소드
	public static void useStrings(String...strs) {//String[] type 이다.
		
	}
	//매개변수 타입을 여래개를 전달받는 매소드
	public static void useCars(Car...cars) { // cars 는 Car[] type 이다.
		
	}
	
}
