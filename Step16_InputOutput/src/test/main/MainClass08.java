package test.main;

import java.awt.FlowLayout;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MainClass08 extends JFrame {
	private JTextField inputMsg;
	
	public MainClass08(String btn) {
		super(btn);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		inputMsg = new JTextField(20);
		JButton sendbtn = new JButton("생성");
		
		add(inputMsg);
		add(sendbtn);
		sendbtn.addActionListener((e)->{
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
		});
		
	}
	public static void main(String[] args) {
		JFrame fr = new MainClass08("메모장 글 생성기");
		fr.setVisible(true);
	
		
	}
}
	
