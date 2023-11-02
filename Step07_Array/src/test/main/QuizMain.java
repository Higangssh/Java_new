package test.main;

import java.util.Random;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * 	1. run 했을떄
		 * 		cherry,apple,banna,melon,7
		 * 		5개의 문자열 중에서 1개가 랜덤하게 출력되게 해 보세요.
		 * 
		 * 
		 */
		String[] str= {"cherry","apple","banna","melon","7"};		
		Random ran=new Random();
		int ranNum= ran.nextInt(5);
		
		System.out.println(str[ranNum]);
		
		
	
		
	}
}
