package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		
		/*
		 * HashMap<key type, value type>
		 * 
		 * key type 은 일반적으로 String type 을 가장 많이 사용한다.
		 * value type 은 담고 싶은 데이터의 type 을 고려해서 지정하면 된다.
		 * value type 을 Object 로 지정 하면 어떤 data type 이던지 다 담을 수가 있다.
		 * 순서가 없는 데이터를 다룰떄 사용하면 된다.
		 * dto 클래스 대신에 사용하기도 한다.
		 */
		Map<String,Object> map =new HashMap<>();
		map.put("num",1);
		map.put("name","김구라");
		map.put("isMan",true);
		
		int num =(int)map.get("num");//원래 타입 casting 필요!
		String name = (String)map.get("name");
		boolean isMan=(boolean)map.get("isMan");
		
	}
}
