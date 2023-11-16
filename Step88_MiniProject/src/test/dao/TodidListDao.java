package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.TodidListDto;
import test.util.DBConnect;

public class TodidListDao {
	
	//회원 한명의 정보를 DB 에 저장하는 메소드
	public boolean insert(TodidListDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int rowCount=0;
		try {
			//미리 준비한 util 클래스를 이용해서 Connection 객체 얻어오기 
			conn=new DBConnect().getConn();
			//실행할 미완성의 sql 문
			String sql="INSERT INTO todidlist"
					+ "	(diddate, title, content, howlong)"
					+ " VALUES(?,?,?,?) " ;
			//미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt=conn.prepareStatement(sql);
			//PreparedStatement 객체의 메소드를 이용해서 미완성인 sql 문을 완성시키기(? 에 값 바인딩하기)
			pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getDiddate());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContent());
			pstmt.setInt(4, dto.getHowlong());
			//sql 문 실행하기
			rowCount=pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		if(rowCount>0) {
			return true;
		}else {
			return false;
	}
	}
	//회원 한명의 정보를 수정하는 메소드
	public boolean update(TodidListDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int rowCount = 0;
		try {
			//미리 준비한 util 클래스를 이용해서 Connection 객체 얻어오기 
			conn=new DBConnect().getConn();
			//실행할 미완성의 sql 문
			String sql="UPDATE todidlist"
					+ " SET title= ? , content=?"
					+ " SET howlong=?"
					+ " WHERE diddate=?";
			//미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt=conn.prepareStatement(sql);
			//PreparedStatement 객체의 메소드를 이용해서 미완성인 sql 문을 완성시키기(? 에 값 바인딩하기)
			pstmt.setString(1, dto.getTitle());
			pstmt.setString(2, dto.getContent());	
			pstmt.setInt(3, dto.getHowlong());
			pstmt.setInt(4, dto.getDiddate());
			//sql 문 실행하기
			rowCount=pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
			}
		}
		if(rowCount>0) {
			return true;
		}else {
			return false;
		}
	}
	//회원 한명의 정보를 삭제하는 메소드
	public boolean delete(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int rowCount =0;
		try {
			//미리 준비한 util 클래스를 이용해서 Connection 객체 얻어오기 
			conn=new DBConnect().getConn();
			//실행할 미완성의 sql 문
			String sql="DELETE FROM todidlist"
					+ " WHERE diddate=?";
			//미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt=conn.prepareStatement(sql);
			//PreparedStatement 객체의 메소드를 이용해서 미완성인 sql 문을 완성시키기(? 에 값 바인딩하기)
			pstmt.setInt(1, num);
			//sql 문 실행하기
			rowCount = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
	
		if(rowCount>0) {
				return true;
		}else {
			return false;
		}

	
	}
	//매개변수애 전달된 번호에 해당하는 회원 한명의 정보를 리턴하는 메소드
	public TodidListDto getData(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs =null ;
		TodidListDto dto=null ;
		try {
			//미리 준비한 util 클래스를 이용해서 Connection 객체 얻어오기 
			conn=new DBConnect().getConn();
			//실행할 미완성의 sql 문
			String sql="SELECT title,content,howlong "
					+ " FROM TodidList"
					+ "	Where diddate = ?";
			//미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt=conn.prepareStatement(sql);
			//PreparedStatement 객체의 메소드를 이용해서 미완성인 sql 문을 완성시키기(? 에 값 바인딩하기)
			pstmt.setInt(1, num);
			//sql 문 실행하기
			pstmt.executeUpdate();
			rs=pstmt.executeQuery();
			if(rs.next()) {//cursor 를 한칸씩 내리면서
				dto=new TodidListDto();
				dto.setDiddate(rs.getInt("diddate"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setHowlong(rs.getInt("howlong"));
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
	//회원 전체 목록을 번호에 대해서 내림차순 정렬해서 리턴하는 메소드
	public List<TodidListDto> getList(){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs =null ;
		List<TodidListDto> list =new ArrayList<>();
		try {
			//미리 준비한 util 클래스를 이용해서 Connection 객체 얻어오기 
			conn=new DBConnect().getConn();
			//실행할 미완성의 sql 문
			String sql="SELECT diddate,title,content, howlong"
					+ " FROM todidlist"
					+ " ORDER BY diddate ASC";
			//미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt=conn.prepareStatement(sql);
			//PreparedStatement 객체의 메소드를 이용해서 미완성인 sql 문을 완성시키기(? 에 값 바인딩하기)
		
			//sql 문 실행하기
			pstmt.executeUpdate();
			rs=pstmt.executeQuery();
			while(rs.next()) {//cursor 를 한칸씩 내리면서
				TodidListDto dto=new TodidListDto();
				int diddate =rs.getInt("diddate");
				String title = rs.getString("title");
				String content = rs.getString("content");
				int howlong =rs.getInt("howlong");
				dto.setDiddate(diddate);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setHowlong(howlong);
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
}