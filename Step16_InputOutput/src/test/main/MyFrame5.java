package test.main;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import test.dto.MemberDto;

public class MyFrame5 extends JFrame{
	public MyFrame5(String title) {
		super(title);
		setLayout(new BorderLayout());
		
		//표 형식으로 출력할 JTable
		JTable table = new JTable();
		//테이블 의 칼럼명 미리 지정
		String[] colNames = {"번호","이름","주소"};
		//테이블에 연결할 모델 객체 생성 (테이블에 출력할 데이터를 여기에 추가하면 테이블에 출력된다)
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		//모델을 테이블에 연결한다.
		table.setModel(model);
		
		JScrollPane scroll =new JScrollPane(table);
		add(scroll, BorderLayout.CENTER);
		
		//<ArrayList> 와 사용법이 같은 객체에 MemberDto 객체를 순서대로 담는다.
		Vector<Object> row1 =new Vector<>();
		 row1.add(1);
		 row1.add("김구라");
		 row1.add("노량진");
		 model.addRow(row1);
	
		
	}
	public static void main(String[] args) {
		MyFrame5 f = new MyFrame5("테이블 테스트");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100,100,800,500);
		f.setVisible(true);
	}
}
