package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainClass09 {
	public static void main(String[] args) {
		try {
			//파일에서  byte를 읽어 들일때 사용하는 객체
			FileInputStream fis = new FileInputStream("C:\\acorn202310\\myFolder\\1.png");
			//byte를 파일에 출력할떄 사용하는 객체
			FileOutputStream fos =new FileOutputStream("C:\\acorn202310\\myFolder\\copied.png");
			while(true) {
				//1 byte 읽어 들여서 
				int readByte=fis.read();
				System.out.println(readByte);
				//만일 더이상 읽을 byte 가 없다면 반복문 탈출
				if(readByte == -1)break;
				//읽어 들인 1byte를 출력
				fos.write(readByte);
				fos.flush();
				
			}
			System.out.println("파일을 copy 했습니다");
			fos.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
