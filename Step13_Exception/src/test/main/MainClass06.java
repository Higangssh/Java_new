package test.main;

import java.util.Scanner;

import test.mypac.MyUtil;
import test.mypac.WordFilterException;

public class MainClass06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("전송할 문자열 입력:");
			String inputMsg = scan.nextLine();
			//MyUtil 클래스의 static 메소드를 이용해서 전송하기
			try {
				MyUtil.sendMessage(inputMsg);
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
				
			}
			
			
			
			
		}
	}
}
