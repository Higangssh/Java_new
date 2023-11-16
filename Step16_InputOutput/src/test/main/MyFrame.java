package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	JTextField inputMsg;
	//프레임의 제목을 전달 받는 생성자
	public MyFrame(String title) {
		super(title); // 부모 생성자에 프레임의 제목 전달하기
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		//문자열을 한줄 입력 받을수 있는 JTextField 객체 생성
		inputMsg=new JTextField(20);
		JButton saveBtn=new JButton("저장");
		//프레임을 액션 리스너로 등록
		saveBtn.addActionListener(this);
		
		JPanel p1 = new JPanel();
		p1.add(inputMsg);
		p1.add(saveBtn);
		this.add(p1,BorderLayout.SOUTH);
		p1.setBackground(Color.YELLOW);
		JTextArea ta =new JTextArea();
		add(ta, BorderLayout.CENTER);
		
		JButton readBtn = new JButton("읽어오기");
		p1.add(readBtn);
		
		readBtn.addActionListener((e) ->{
			FileReader fr = null;
			BufferedReader br = null;
			try {
				fr = new FileReader("C:\\acorn202310\\myFolder\\diary.txt");
				br = new BufferedReader(fr);
				while(true) {
					String line = br.readLine();
					if(line ==null)break;
					ta.append(line);
					ta.append("\r\n");
				}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		
		});
		JButton deleteBtn = new JButton("파일삭제");
		p1.add(deleteBtn);
		deleteBtn.addActionListener((e)->{
			int result =JOptionPane.showConfirmDialog(this, "진짜 삭제 할꺼임?");
			System.out.println(result);
			if(result == JOptionPane.YES_OPTION) {
			
				File f =new File("C:\\acorn202310\\myFolder\\diary.txt");
				f.delete();
			}
		});
		
		
	}
	
	
	public static void main(String[] args) {
		MyFrame f=new MyFrame("메모 프레임");
		f.setVisible(true);
	}
	
	//ActionListener 인터페이스를 implements 했기때문에 강제로 구현된 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg=inputMsg.getText();
		File f=new File("c:/acorn202310/myFolder/diary.txt");
		try {
			if(!f.exists()) {
				f.createNewFile();
				System.out.println("diary 파일이 만들었습니다.");
			}
			FileWriter fw =new FileWriter(f, true);
			fw.write(msg);
			fw.write("\r\n");
			fw.flush();
			fw.close();
		}catch(Exception e1) {
			
		}
	}
	
}










