package test.frame07;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import test.mypac.FilterException;
import test.mypac.Test;

public class MyFrame extends JFrame {
	JTextField inputMsg,inputMsg2;
	JLabel label;
	Test test = new Test(); 
	
	public MyFrame (String calculater) {
		super(calculater);
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		
		inputMsg=new JTextField(10);
		inputMsg2=new JTextField(10);
		JButton sendBtn=new JButton("+");
		JButton sendBtn2=new JButton("-");
		JButton sendBtn3=new JButton("*");
		JButton sendBtn4=new JButton("/");
		label=new JLabel("...");
		
		add(inputMsg);
		add(sendBtn);
		add(sendBtn2);
		add(sendBtn3);
		add(sendBtn4);
		add(inputMsg2);
		add(label);
		
		try {
			sendBtn.addActionListener((e)->{
				String msg=inputMsg.getText();
				String msg2=inputMsg2.getText();
				double a = Double.parseDouble(msg);
				double b = Double.parseDouble(msg2);
				Double c = a+b;
				label.setText(c.toString());
				
				});
			sendBtn2.addActionListener((e)->{
				String msg=inputMsg.getText();
				String msg2=inputMsg2.getText();
				Double a = Double.parseDouble(msg);
				Double b = Double.parseDouble(msg2);
				Double c = a-b;
				label.setText(c.toString());
				
				});
			sendBtn3.addActionListener((e)->{
				String msg=inputMsg.getText();
				String msg2=inputMsg2.getText();
				Double a = Double.parseDouble(msg);
				Double b = Double.parseDouble(msg2);
				Double c = a*b;
				label.setText(c.toString());
				
			});
			sendBtn4.addActionListener((e)->{
				String msg=inputMsg.getText();
				String msg2=inputMsg2.getText();
				double a = Double.parseDouble(msg);
				double b = Double.parseDouble(msg2);
				Double c = a/b;	
				if(b == 0) {
					JOptionPane.showMessageDialog(this, "0은 안돼요")	;
					return;
				}
				label.setText(c.toString());
				
			});
		}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(this, "숫자 형식으로 해주세요!");
		
		}
	}
	public static void main(String[] args) {
		MyFrame f=new MyFrame("계산기");
		f.setVisible(true);
	}

}
