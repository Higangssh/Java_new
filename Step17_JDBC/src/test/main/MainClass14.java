package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	
	public static void main(String[] args) {
		//10 번 회원을 삭제 하려면
		MemberDao dao = new MemberDao();
		String chname ="이승우";
		int num =1;
		MemberDto dto = new MemberDto();
		
		MemberDto dto2 =dao.getData(num);
		dto.setName(chname);
		
		dto.setNum(dto2.getNum());
		dto.setAddr(dto2.getAddr());
		
		dao =new MemberDao();
		
		boolean isupdate =dao.update(dto);
		if(isupdate) {
			System.out.println(num+" 수정완료");
			}else {
				System.out.println("수정이 안됬습니다");
			}
		System.out.println(dto.getAddr());
	}
}
