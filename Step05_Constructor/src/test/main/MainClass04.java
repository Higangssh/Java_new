package test.main;

import java.util.Random;

public class MainClass04 {
	public static void main(String[] args) {
		Random ran=new Random();
		int ranNum=ran.nextInt();
		System.out.println(ranNum);
		int ranNum2=ran.nextInt(10);
		///0이상 10미만 범위내에서 정수하나 얻어네기(0~9)
		System.out.println(ranNum2);
	}
}
