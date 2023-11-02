package test.main;

import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다");
		
		new Student();
		Student a=new Student();
		
		a.study();
		
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
