package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass10 {
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<>();
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("addr", "서울시");
		
		Map<String,Object> map1 = new HashMap<>();
		map1.put("num", 2);
		map1.put("name", "손상희");
		map1.put("addr", "성남시");
		
		Map<String,Object> map2 = new HashMap<>();
		map2.put("num", 3);
		map2.put("name", "윤유주");
		map2.put("addr", "서울시");
		
		// List 의 Generic type 은 Map 이다
		List<Map<String,Object>> list =new ArrayList<>() ;
		
		list.add(map);
		list.add(map1);
		list.add(map2);
		
		for(int i=0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		for(Map<String, Object>map4 : list) {
			System.out.println(map4);
		}
		for(Map<String, Object>map4 : list) {
			String result = String.format("번호:%d 이름:%s 주소:%s",(int)map4.get("num"),(String)map4.get("name"),(String)map4.get("addr"));
			System.out.println(result);
		}
		
	} 
}
