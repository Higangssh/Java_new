package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		//정수를 저장할수 있는 ArrayList<Interger> 객체를 생성해서 참조값 지역변수 nums 에 담기
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		for(int i=0 ; i < nums.size() ; i++) {
			int tmp = nums.get(i);
			System.out.println(tmp);
			
			//ArrayList 메소드를 통해 접근
		}
		for(int tmp:nums) {
			System.out.println(tmp);
		}
	}
}
