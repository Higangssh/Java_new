package test.main;

import java.io.IOException;
import java.io.InputStream;

/*
 *  입력 ,출력 
 *  -어떤 대상으로 부터 데이터를 메모리로 읽어 들이는 것을 입력이라고 한다.
 *  -프로그래밍 언어의 관점에서 메모리라는 것은 변수 or 필드 or 객체로 생각하면 편하다
 *  -데이터는 2진수로 이루어져 있즤만 2진수 8개의 묶음인 1byte 단위로 생각하면 편하다
 *  -1byte 는 총 256가지의 값을 표현할 수 있다.
 *  -1byte 를 10진으로 환산하면 0~255 사이 숫자이다.
 *  -입력과 출력을 통해서 이동하는 데이터 byte 하나 하나가 이동한다고 생각하면 된다.
 *  
 * 
 * 
 */
public class Mainclass01 {
	public static void main(String[] args) {
		//키보다와 연결된 Inputstream type 의 참조값 kbd라는 변수에 담기
		//Inputstream 객체는 1byte 단위 처리 스트림 이다.
		//영문자 대소문자,숫자 ,특수문자만 처리할 수 있다.
		//한글 처리 불가
		InputStream kbd=System.in;
		try {
			System.out.println("입력:");
			int code = kbd.read();
			System.out.println("code:"+ code);
			char ch =(char)code;
			System.out.println("ch:" + ch );
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
