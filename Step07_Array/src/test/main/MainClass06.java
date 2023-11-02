package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		String[] msgs=new String[5];
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<msgs.length ; i++) {
			System.out.println("문자열을 한줄 입력하세요!");
			String str = scan.nextLine();
			msgs[i] = str;		
		}
		for (String tmp:msgs) {
			System.out.println(tmp);
		}
		
		
	}

}
