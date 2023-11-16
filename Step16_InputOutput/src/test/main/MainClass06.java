package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps =System.out;
		//학습을 위해 PrintStream 객체를 부모type OutputStream 으로 받아보기
		//OutputStream 도 1byte 처리 스트림이다.
		OutputStream os =ps;
		//2바이트 처리 스트림
		OutputStreamWriter osw =new OutputStreamWriter(os);
		// 더 많은 기능의 객체
		BufferedWriter bw =new BufferedWriter(osw);
		try {
			bw.write("하나\n");
			bw.write("둘");
			
			bw.newLine();
			bw.write("세엣");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
