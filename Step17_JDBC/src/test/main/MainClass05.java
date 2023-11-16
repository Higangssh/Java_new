package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass05 {

	public static void main(String[] args) {
		String name = "김구라";
		String addr = "노량진";
		Connection conn=null;
		try {
			//오라클 드르라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 의 정보 @아이피주소:port번호:db이름
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url,"scott","tiger");
			//예외가 발상하지 않고 여기까지 실행순사가 내려오면 접속 성공이다
			System.out.println("Oracle DB");
		}catch (Exception e1) {
			e1.printStackTrace();
		}
		//SQL 문을 대신 실행해줄 객체의 참조값을 담을 지역변수 미리 만들기
		PreparedStatement pstmt =null;
		try {
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
			}
		}
}

