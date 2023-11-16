package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass11 {
	public static void main(String[] args) {
		String name ="원숭이";
		String addr ="상도동";
		MemberDto dto = new MemberDto();
		dto.setAddr(addr);
		dto.setName(name);
		MemberDao dao = new MemberDao();
		dao.insert(dto);
	}
}
