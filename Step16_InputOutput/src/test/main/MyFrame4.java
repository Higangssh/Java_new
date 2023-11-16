package test.main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyFrame4 extends JFrame{
	public MyFrame4(String title) {
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
		add(table, BorderLayout.CENTER);
		
		Object[] row1 = {1, "김구라", "노량진"};
		Object[] row2 = {2, "해골" , "행신동"};
		Object[] row3 = {3, "원송이", "동물원"};
		model.addRow(row1);
		model.addRow(row2);
		model.addRow(row3);
		
	
		
	}
	public static void main(String[] args) {
		MyFrame4 f = new MyFrame4("테이블 테스트");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100,100,800,500);
		f.setVisible(true);
	}
}
