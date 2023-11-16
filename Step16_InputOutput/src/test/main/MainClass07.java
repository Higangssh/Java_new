package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass07 {
	
	public static void main(String[] args)  {
		String msg="안녕하세요2";
		
		File f=new File("c:/acorn202310/myFolder/diary.txt");
		try {
			if(!f.exists()) {
				f.createNewFile();
				System.out.println("diary 파일이 만들었습니다.");
			}
			//파일에 문자열을 출력할 객체 생성
			
			FileWriter fw =new FileWriter(f, true);
			fw.write(msg);
			fw.write("\r\n");
			fw.flush();
			fw.close();//마무리를 해야 파일도 정상적으로 만들어지고 사용가능하고 자원 누수가 방지된다.
		}catch(Exception e) {
			
		}
	}
}
