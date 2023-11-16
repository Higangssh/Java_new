package test.main;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass09 {
	//전체 회원의 목록을 리턴하는 메소드
	
	public static List<MemberDto> getList(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs =null ;
		List<MemberDto> list =new ArrayList<>();
		try {
			//미리 준비한 util 클래스를 이용해서 Connection 객체 얻어오기 
			conn=new DBConnect().getConn();
			//실행할 미완성의 sql 문
			String sql="SELECT *"
					+ " FROM MEMBER"
					+ " ORDER BY num ASC";
			//미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt=conn.prepareStatement(sql);
			//PreparedStatement 객체의 메소드를 이용해서 미완성인 sql 문을 완성시키기(? 에 값 바인딩하기)
		
			//sql 문 실행하기
			pstmt.executeUpdate();
			rs=pstmt.executeQuery();
			while(rs.next()) {//cursor 를 한칸씩 내리면서
				MemberDto dto=new MemberDto();
				//현재 cursor 가 위치한 곳의 숙자나 문자를 추출한다.
				int num =rs.getInt("num");
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
				list.add(dto);
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
		return list;
		
		
	}
	//run 했을때 실행의 흐름이 시작되는 메소드
	public static void main(String[] args) {
		//메소드를 이용해서 회원 목록 얻어내기
		List<MemberDto> list = getList();
		//얻어낸 회원 목록 사용하기
		for(MemberDto tmp:list) {
			System.out.println(tmp.getNum() +"|"+ tmp.getName() +"|"+ tmp.getAddr());
		}
	}
}
