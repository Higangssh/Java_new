package test.main;

import java.util.ArrayList;

/*
 * 
 * java 에서 배열은 크기를 조절할수 없는 고정 배열이다
 * 따라서 동적으로 item을 추가하고 삭제한ㄴ 작업을 하려면 일반배열을 사용할 수 없다.
 * 그래서 해당 작업을 하려면 ArrayList 객체를 사용하면 된다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		
		//String type 을 순서대로 저장할 수 있는 ArrayList 객체 생성하고 참조값을 names에 담기
		ArrayList<String> names=new ArrayList<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		String item =names.get(0);
		names.remove(1);
		names.add(0, "에이콘");
		names.set(0, "에이콘 아카데미");
		int size =names.size();
		names.clear();
		
		
	}
}
