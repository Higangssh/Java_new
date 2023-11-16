package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass10 {
	
	//매개면수에 전달된 회원번호에 해당되는 회원 정보를 DB에서 select 한 다음 MemberDto 객체에 담아서 리턴하는 메소드 완성
	//num에 해당하는 회원정보가 없ㅇ면 null을 리턴하도록 하세요
	public static MemberDto getData(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs =null ;
		MemberDto dto=null ;
		
		try {
			//미리 준비한 util 클래스를 이용해서 Connection 객체 얻어오기 
			conn=new DBConnect().getConn();
			//실행할 미완성의 sql 문
			String sql="SELECT name,addr"
					+ " FROM MEMBER"
					+ "	Where num = ?";
			//미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt=conn.prepareStatement(sql);
			//PreparedStatement 객체의 메소드를 이용해서 미완성인 sql 문을 완성시키기(? 에 값 바인딩하기)
			pstmt.setInt(1, num);
			
			//sql 문 실행하기
			pstmt.executeUpdate();
			rs=pstmt.executeQuery();
			if(rs.next()) {//cursor 를 한칸씩 내리면서
				dto=new MemberDto();
				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
			
		}
		return dto;
		
		
	}
	public static void main(String[] args) {
		int num =6;
		MemberDto dto =getData(num);
		if(dto != null) {
			//사용하기
			System.out.println(num +" 번 회원의 이름은 " + dto.getName()+" 이고 주소는 "+dto.getAddr());
		}else {
			System.out.println("회원번호 정보가 없습니다");
		}
		
	}
	
}
