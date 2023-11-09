package test.mypac;

import java.util.ArrayList;
import java.util.List;

public class MyUtil {
	
	public static void sendMessage(String msg) {
		
		List<String> list = new ArrayList<String>();
		list.add("바보");
		list.add("멍청이");
		list.add("똥개");
		System.out.println(msg +"를 전송 했습니다.");
		
		for(String tmp: list) {
			if(msg.contains(tmp)) {
				throw new WordFilterException(tmp +" 는 금지 단어 입니다.");
			}
		}
//		list.forEach(tmp -> {
//			if(msg.contains(tmp)) {
//			throw new WordFilterException(tmp +" 는 금지 단어 입니다.");
//			}
//		});
		
	}
	public static void draw() {
		System.out.println("5초 동안 그림을 그려요...");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		System.out.println("그림 완성!");
		
	}
	//5초가 걸리는 가상의 전송을 하는 메소드
	
	public static void send() throws InterruptedException {
		System.out.println("5초 동안 전송을 해요...");
		
		Thread.sleep(5000);
		
		System.out.println("전송 완료!");
	}
}
