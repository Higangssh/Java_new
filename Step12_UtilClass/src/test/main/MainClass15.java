package test.main;

import java.util.Random;

public class MainClass15 {
	public static void main(String[] args) {
		int count =0;
		//무한반복
//		while(true) {
//			count++;
//			System.out.println(count);
//		}
//		
//		while(count<10) {
//			System.out.println(count);
//			count++;
//		}
		
		//랜덤한 숫자를 얻어낼 Random 객체
		Random ran = new Random();
		
		while(true) {
			int ranNum = ran.nextInt(100);
			System.out.println(ranNum);
			if(ranNum==50) {
				break;// 반복문 블럭 탈출
			}
		}
		System.out.println("--------");
		
		boolean isRun=true;
		while(isRun) {
			int ranNum= ran.nextInt(100);
			System.out.println(ranNum);
			if(ranNum==50) {
				isRun=false;
			}
		}
	}
}
