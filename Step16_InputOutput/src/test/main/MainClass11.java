package test.main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import test.dto.MemberDto;

public class MainClass11 {
	public static void main(String[] args) {
		MemberDto dto = new MemberDto(1, "김구라" , "노량진");
		
		//필요한 객체의 참조값을 담을 지역 변수 미리 생성
		FileOutputStream fos =null;
		ObjectOutputStream oos =null;
		try {
			fos = new FileOutputStream("c:/acorn202310/myFolder/members.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(dto);
			System.out.println("MemberDto 객체를 mebers.dat 파일에 저장했습니다");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos!=null)oos.close();
				if(fos!=null)fos.close();
			}catch (Exception e) {
		
			}
		}
	}
}
