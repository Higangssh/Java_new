package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame implements ActionListener{
	
	private Object send;
	private Object update;
	private Object delete;
	// JButton sendBtn updateBtn , deleteBtn;
	Object b1;
	//생성자
	public MyFrame() {
		
	
		
		//프레임의 제목설정
		setTitle("나의 프레임2");
		// setBounds(x, y, width, height) 창의 위치와 크기 설정
		setBounds(100, 100, 500, 500);
		//이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을떄 프로세스도 같이 종료 되도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 레이아웃 매니저는 아직 사용하지 않겠다 (모든 UI 를 절대 좌표에 배치 하겠다)
		
		setLayout(new FlowLayout());
		
		JButton sendBtn = new JButton("전송");
		add(sendBtn);
		sendBtn.addActionListener(this);
		this.send=sendBtn;
		
		
		JButton updateBtn = new JButton("수정");
		add(updateBtn);
		updateBtn.addActionListener(this);
		update=updateBtn;
		
		JButton deleteBtn = new JButton("삭제");
		add(deleteBtn);
		deleteBtn.addActionListener(this);
		delete=deleteBtn;
		
		//this (바로 이객체 ,MyFrame 객체)의 type 다형성 확인
		Object a=this;
		JFrame b=this;
		MyFrame c=this;
		ActionListener d=this;

		
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		
		//MyFram 객체 생성
		new MyFrame();
		System.out.println("main 메소드가 종료 되었습니다.");
	}

	//ActionLister 인터페이스를 implements 했기때문에 강제로 오버라이드 된 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 액션 command 문자열을 읽어온다 (기본값은 버튼 text)
//		String command =e.getActionCommand();
//		
//		if(command == "전송") {
//			System.out.println("전송합니다");
//		}else if(command == "수정") {
//			System.out.println("수정합니다");
//		}else if(command == "삭제") {
//			System.out.println("삭제합니다");
//		}
		
		Object obj = e.getSource();
		
		if(obj == send) {
			System.out.println("전송합니다");
		}else if(obj == update) {
			System.out.println("수정합니다");
		}else if(obj == delete) {
			System.out.println("삭제합니다");
		}
		
		
		
	}
	
	//위와 동일한 동작을 아래의 메소드가 리턴해주는 Object 의 참조값 (JButton 의 참조값) 을 
	//활용하는 구조로 MyFrame 클래스를 수정해 보세요.
	//hint: JBUtton의 참조값을 필드에 저장
		
}
