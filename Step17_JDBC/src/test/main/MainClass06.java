package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass06 {

	public static void main(String[] args) {
		String name = "김구라";
		String addr = "노량진";
		Connection conn=null;
		PreparedStatement pstmt =null;
		try {
			conn= new DBConnect().getConn();
			String sql ="INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL,?,?)";
			//미완성의 SQL 문을 전달하면서 preparedStatement 객체의 참조값 없어내기
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, name);//1번째?에 숫자 바인딩
			pstmt.setString(2, addr);
			//sql문 실행
			pstmt.executeUpdate();
			System.out.println("생성완료");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch (Exception e) {
				
			}
		}
		}
}

