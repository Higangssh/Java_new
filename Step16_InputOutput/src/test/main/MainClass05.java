package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		PrintStream ps =System.out;
		//학습을 위해 PrintStream 객체를 부모type OutputStream 으로 받아보기
		//OutputStream 도 1byte 처리 스트림이다.
		OutputStream os =ps;
		OutputStreamWriter osw =new OutputStreamWriter(os);
		try {
			osw.write(44032);
			osw.write("\n");
			osw.write("44032");
			osw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
