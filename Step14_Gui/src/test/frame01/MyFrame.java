package test.frame01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame {
	
	//생성자
	public MyFrame() {
		//프레임의 제목설정
		setTitle("나의 프레임");
		// setBounds(x, y, width, height) 창의 위치와 크기 설정
		setBounds(100, 100, 500, 500);
		//이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을떄 프로세스도 같이 종료 되도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 레이아웃 매니저는 아직 사용하지 않겠다 (모든 UI 를 절대 좌표에 배치 하겠다)
		setLayout(null);
		//버튼 하나를 만들어서
		JButton btn1 = new JButton("버튼1");
		//위치 설정 (x,y)
		btn1.setLocation(10,10);
		//크기설정 width ,height
		btn1.setSize(100,30);
		//프레임에 추가하기
		add(btn1);
		//버튼에 등록할 역션리스너 객체의 참조값을 얻어내서 listner 지역변수에담기
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌렀네");
				//알림창 띄위
				JOptionPane.showMessageDialog(MyFrame.this, "버튼을 눌렀네요?");
				
			}
		};
		
		btn1.addActionListener(listener);
		
		JButton btn2 = new JButton("버튼2");
		btn2.setLocation(120,10);
		btn2.setSize(100,30);
		add(btn2);
		ActionListener listener2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌렀네");
				
				JOptionPane.showMessageDialog(MyFrame.this, "버튼2을 눌렀네요?");
				
			}
		};
		
		btn2.addActionListener(listener2);
		//프레임을 화면상에 실제 보이게 하기 (false 하면 화면에 보이지 않는다)
		
		//btin2.addActionListener((e) ->{
		//});
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		
		//MyFram 객체 생성
		new MyFrame();
		System.out.println("main 메소드가 종료 되었습니다.");
	}
}
