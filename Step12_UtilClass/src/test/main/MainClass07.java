package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass07 {
	public static void main(String[] args) {
		//MemberDto 객체를 담을수 있는 ArrayList 객체 생성
		List<MemberDto> list = new ArrayList<MemberDto>();
		MemberDto dto1= new MemberDto();
		dto1.setNum(1);
		dto1.setName("김구라");
		dto1.setAddr("노량진");
		
		
		//생성자의 매개변수로 회원 한명의 정보 전달하기
		MemberDto dto2= new MemberDto(2,"해골", "행신동");
		MemberDto dto3= new MemberDto(3,"원숭이","동물원");
		
		//ArrayList에 MemberDto 객체의 참조값 누적시키기
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		
		//ArrayList에 담긴 회원정보를 반복문 돌면서 출력하기
		for(MemberDto tmp:list) {
			String result= String.format("번호:%d, 이름:%s , 주소 %s", tmp.getNum(), tmp.getName(),tmp.getAddr());
			System.out.println(result);
					
		}
	
	}

}
