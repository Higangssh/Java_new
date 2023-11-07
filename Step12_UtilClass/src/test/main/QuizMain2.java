package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.WriteDto;

/*
 * 글 목록을 ArrayList에 담아 보세요
 * 
 * 글 하나는
 * 
 * 글번호, 작성자 , 제목 으로 이루어져 있다고 가정합니다
 * 
 * 글 3개의 정보를 ArrayList 에 담고 , 반복문 돌면서 담긴 내용 출력
 * 
 * 글 하나를 담을 dto 클래스를 알아서 만들어 보세요
 * 
 */
public class QuizMain2 {
	public static void main(String[] args) {
		
		List<WriteDto> list = new ArrayList<>();
		
		WriteDto d1 = new WriteDto(1,"김구라","소나기");
		WriteDto d2 = new WriteDto(2,"윤수진","돈의 속성");
		WriteDto d3 = new WriteDto(3,"김국진","데미안");
		
		list.add(d1);
		list.add(d2);
		list.add(d3);
		
		for(WriteDto tmp : list) {
			String result = String.format("번호:%d, 작가는:%s , 제목은: %s", tmp.getNum(), tmp.getName(),tmp.getTitle());
			System.out.println(result);
		}
		
		
	}

}
