package com.game.tikTac;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class gameStructure implements ActionListener {
	JFrame jr;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	String str="";
	int con=0;
	boolean win=false;
	Color color;
	
	public gameStructure() {
		
		 jr= new JFrame();
		jr.setSize(400,400);
		jr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jr.setVisible(true);
		jr.setLayout(new GridLayout(3,3));
		
		b1=new JButton();
		b1.addActionListener(this);
		jr.add(b1);
		
		b2=new JButton();
		b2.addActionListener(this);
		jr.add(b2);
		
		b3=new JButton();
		b3.addActionListener(this);
		jr.add(b3);
		
		b4=new JButton();
		b4.addActionListener(this);
		jr.add(b4);
		
		b5=new JButton();
		b5.addActionListener(this);
		jr.add(b5);
		
		b6=new JButton();
		b6.addActionListener(this);
		jr.add(b6);
		
		b7=new JButton();
		b7.addActionListener(this);
		jr.add(b7);
		
		b8=new JButton();
		b8.addActionListener(this);
		jr.add(b8);
		
		b9=new JButton();
		b9.addActionListener(this);
		jr.add(b9);
		 
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		con=con+1;
		if(con%2==0) {
			str="o";
			color=color.BLACK;
			
		}else {
			str="x";
			color=color.BLUE;
		}
		
	
		if(e.getSource()==b1) {
			b1.setFont(new Font("arbic",Font.BOLD,40));
			b1.setText(str);
			b1.setBackground(color);
			b1.setEnabled(false);
			
		}
		if(e.getSource()==b2) {
			b2.setFont(new Font("arbic",Font.BOLD,40));
			b2.setText(str);
			b2.setBackground(color);
			b2.setEnabled(false);
			
		}
		if(e.getSource()==b3) {
			b3.setFont(new Font("arbic",Font.BOLD,40));
			b3.setText(str);
			b3.setBackground(color);
			b3.setEnabled(false);
			
		}
		if(e.getSource()==b4) {
			b4.setFont(new Font("arbic",Font.BOLD,40));
			b4.setText(str);
			b4.setBackground(color);
			b4.setEnabled(false);
		}
		if(e.getSource()==b5) {
			b5.setFont(new Font("arbic",Font.BOLD,40));
			b5.setText(str);
			b5.setBackground(color);
			b5.setEnabled(false);
		}
		
		if(e.getSource()==b6) {
			b6.setFont(new Font("arbic",Font.BOLD,40));
			b6.setText(str);
			b6.setBackground(color);
			b6.setEnabled(false);
		}
		if(e.getSource()==b7) {
			b7.setFont(new Font("arbic",Font.BOLD,40));
			b7.setText(str);
			b7.setBackground(color);
			b7.setEnabled(false);
			
		}
		if(e.getSource()==b8) {
			b8.setFont(new Font("arbic",Font.BOLD,40));
			b8.setText(str);
			b8.setBackground(color);
			b8.setEnabled(false);
		}
		if(e.getSource()==b9) {
			b9.setFont(new Font("arbic",Font.BOLD,40));
			b9.setText(str);
			b9.setBackground(color);
			b9.setEnabled(false);
			
		}
		
		winsStruture();
		whoWin();
	}
	 void winsStruture() {
		 
		 if(b1.getText()==b2.getText()&& b2.getText()==b3.getText()&& b3.getText()!="") {
			 win=true;
			 
		 }
		 else if (b4.getText()==b5.getText()&&b5.getText()==b6.getText()&&b6.getText()!="") {
			 win=true;
		}
		 else if (b7.getText()==b8.getText()&&b8.getText()==b9.getText()&&b9.getText()!="") {
			 win=true;
			}
		 else if (b1.getText()==b4.getText()&&b4.getText()==b7.getText()&&b7.getText()!="") {
			 win=true;
			}
		 else if (b2.getText()==b5.getText()&&b5.getText()==b8.getText()&&b5.getText()!="") {
			 win=true;
			}
		 else if (b3.getText()==b6.getText()&&b6.getText()==b9.getText()&&b6.getText()!="") {
			 win=true;
			}
		 else if (b1.getText()==b5.getText()&&b5.getText()==b9.getText()&&b5.getText()!="") {
			 win=true;
			}
		 else if (b3.getText()==b5.getText()&&b5.getText()==b7.getText()&&b5.getText()!="") {
			 win=true;
			}else {
				win=false;
			}
		 
		 
		 
	 }
	void whoWin() {
		if(win==true) {
			JOptionPane.showMessageDialog(jr, str+" wins");
			restartGame();
		}
		else if(win==false&&con==9) {
			JOptionPane.showMessageDialog(jr, "match draw");
			restartGame();
		}
	
		
		
	}
	void restartGame() {
		int j=JOptionPane.showConfirmDialog(jr,"Do you want to restart Game?");
		
//		System.out.println(j);
		if(j==0) {
			 str="";
			 con=0;
			 
			 b1.setText("");
			 b2.setText("");
			 b3.setText("");
			 b4.setText("");
			 b5.setText("");
			 b6.setText("");
			 b7.setText("");
			 b8.setText("");
			 b9.setText("");


			 b1.setBackground(null);
			 b2.setBackground(null);
			 b3.setBackground(null);
			 b4.setBackground(null);
			 b5.setBackground(null);
			 b6.setBackground(null);
			 b7.setBackground(null);
			 b8.setBackground(null);
			 b9.setBackground(null);
		
			 
			 
			allButtonEnable(true);
		}else if(j==1 || j==2 ||j== -1) {
			System.exit(0);
			
		}else
		{
			allButtonEnable(false);
		}
	}
	
	void allButtonEnable(boolean b) {
		b1.setEnabled(b);
		b2.setEnabled(b);
		b3.setEnabled(b);
		b4.setEnabled(b);
		b5.setEnabled(b);
		b6.setEnabled(b);
		b7.setEnabled(b);
		b8.setEnabled(b);
		b9.setEnabled(b);
		
	}
	public static void main(String[] args) {
		new gameStructure();
		
		
		
	}

	
}
