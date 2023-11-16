package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass12 {
	public static void main(String[] args) {
		int num=3;
		MemberDao dao =new MemberDao();
		MemberDto dto =dao.getData(num);
		
		System.out.println(num + "번 회원의 이름은 "+dto.getName()+"이고 주소는 "+dto.getAddr());
	}
}
