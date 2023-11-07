package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass11 {
	public static void main(String[] args) {
		//sample 데이터(영어사전 역할)
		Map<String, String> dic = new HashMap<String, String>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("ereaser", "지우개");
		
		
		System.out.println("검색할 단어를 입력하세요:");
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		if(dic.get(str) == null) {
			System.out.println(str+"은(는) 목록에 없습니다");
		}else {
			System.out.println(str+"의 뜻은 "+ dic.get(str)+"입니다");
		}
		//만일 입력한 키 값이 존재하면
		if(dic.containsKey(str)) {
			System.out.println(str+"의 뜻은 "+ dic.get(str)+"입니다");
		}else {
			System.out.println(str+"은(는) 목록에 없습니다");
		}
		
		
		
	}
}
