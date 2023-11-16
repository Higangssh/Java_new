package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import test.dto.MemberDto;

public class Project extends JFrame{
	private List<MemberDto>list; 
	private JTable table;
	private DefaultTableModel model;
	void initTable() {
       
        Vector<String> tableColumns = new Vector<>();
        tableColumns.add("num");
        tableColumns.add("name");
        tableColumns.add("addr");

        model = new DefaultTableModel(tableColumns, 0);
        table.setModel(model);
    }
	public Project(String title) {
		super(title);
		setLayout(new BorderLayout());
		
		table = new JTable();
		
		String[] colNames = {"번호", "이름", "주소"};
        DefaultTableModel model = new DefaultTableModel(colNames, 0);
        table.setModel(model);

        JScrollPane scroll = new JScrollPane(table);
        add(scroll, BorderLayout.CENTER);
        
	}
	public static void main(String[] args) {
		Project f = new Project("회원 정보");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100,100,800,500);
		f.setVisible(true);
	}
}
