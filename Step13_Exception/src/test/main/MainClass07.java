package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass07 {
	public static void main(String[] args) {
		File f =new File("c:/acorn202310/myFolder/memo.txt");
		
		try {
			if(f.exists()) {
				f.delete();	
				System.out.println("memo.txt 를 삭제했습니다.");
			}else {
				f.createNewFile();
				System.out.println("memo.txt 를 생성합니다.");
			}
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료 되었습니다.");
	}
		
		
}

