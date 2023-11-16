package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		PrintStream ps= System.out;
		OutputStream os =ps;
		try {
			os.write(97);
			os.write(105);
			os.write(114);
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
