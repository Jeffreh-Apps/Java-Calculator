import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.awt.Toolkit;

public class mainActivity {

	private JFrame frmFuckingCalculator;
	private static JTextField textField_Bottom;
	private static JTextField textField_Top;

	float mValueOne=0,mValueTwo=0, mValueAnswer=0, mValueP;
	
	boolean mAddition,mSubtract,mMultiplication,mDivision,mReciprocal,mSqrt,mPercent;
	String button="off";
	String negative="off";
	String powerTrigger="off";
	String isOff;
	
	
	
	double t,squareroot;
	private JTextField textField_Stacks;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainActivity window = new mainActivity();
					window.frmFuckingCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public mainActivity() {
		initialize();
		cs();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		layoutField = new JFrame();
		layoutField.setTitle("WOW Calculator!!");
		layoutField.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\eac-student\\Desktop\\jeseses.png"));
		layoutField.getContentPane().setForeground(Color.WHITE);
		layoutField.setForeground(new Color(255, 255, 255));
		layoutField.getContentPane().setBackground(Color.BLACK);
		layoutField.setResizable(false);
		layoutField.setBounds(100, 100, 316, 403);
		layoutField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layoutField.getContentPane().setLayout(null);
		
		textField_Top = new JTextField();
		textField_Top.setEditable(false);
		textField_Top.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_Top.setBounds(10, 38, 288, 28);
		layoutField.getContentPane().add(textField_Top);
		textField_Top.setColumns(10);
		
		textField_Bottom = new JTextField();
		textField_Bottom.setEditable(false);
		textField_Bottom.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_Bottom.setBounds(10, 62, 288, 50);
		layoutField.getContentPane().add(textField_Bottom);
		textField_Bottom.setColumns(10);
		
		textField_Stacks = new JTextField();
		textField_Stacks.setEditable(false);
		textField_Stacks.setEnabled(false);
		textField_Stacks.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Stacks.setBounds(10, 38, 50, 73);
		layoutField.getContentPane().add(textField_Stacks);
		textField_Stacks.setColumns(10);
		textField_Stacks.setVisible(false);
		
		JButton button_zero = new JButton("0");
		button_zero.setForeground(Color.WHITE);
		button_zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button=="on") {
					textField_Top.setText(textField_Top.getText().toString());
					mValueOne=mValueAnswer;
					button="off";
				}if(button=="off") {
					textField_Stacks.setText(textField_Stacks.getText()+"0");
					textField_Top.setText(textField_Top.getText()+"0");
					mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
					if(mAddition==true){
						mAddition=false;
						button="on";
					}
					if(mSubtract==true){
						mSubtract=false;
						button="on";
					}
					if(mMultiplication==true){
						mMultiplication=false;
						button="on";
					}
					if(mDivision==true){
						mDivision=false;
						button="on";
					}
					
				}
				
				}
			});
		button_zero.setFont(new Font("Rockwell", Font.BOLD, 15));
		button_zero.setBackground(Color.BLACK);
		button_zero.setBounds(10, 328, 110, 38);
		layoutField.getContentPane().add(button_zero);
		button_zero.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton button_one = new JButton("1");
		button_one.setForeground(Color.WHITE);
		button_one.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				if(button=="on") {
					textField_Top.setText(textField_Top.getText().toString());
					mValueOne=mValueAnswer;
					button="off";
				}if(button=="off") {
					textField_Stacks.setText(textField_Stacks.getText()+"1");
					textField_Top.setText(textField_Top.getText()+"1");
					mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
					if(mAddition==true){
						mAddition=false;
						button="on";
					}
					if(mSubtract==true){
						mSubtract=false;
						button="on";
					}
					if(mMultiplication==true){
						mMultiplication=false;
						button="on";
					}
					if(mDivision==true){
						mDivision=false;
						button="on";
					}
					
				}
				
				}
			});
		button_one.setFont(new Font("Rockwell", Font.BOLD, 13));
		button_one.setBackground(Color.BLACK);
		button_one.setBounds(10, 279, 50, 38);
		layoutField.getContentPane().add(button_one);
		button_one.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton button_two = new JButton("2");
		button_two.setForeground(Color.WHITE);
		button_two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button=="on") {
					textField_Top.setText(textField_Top.getText().toString());
					mValueOne=mValueAnswer;
					button="off";
				}if(button=="off") {
					textField_Stacks.setText(textField_Stacks.getText()+"2");
					textField_Top.setText(textField_Top.getText()+"2");
					mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
					if(mAddition==true){
						mAddition=false;
						button="on";
					}
					if(mSubtract==true){
						mSubtract=false;
						button="on";
					}
					if(mMultiplication==true){
						mMultiplication=false;
						button="on";
					}
					if(mDivision==true){
						mDivision=false;
						button="on";
					}
					
				}
				
				}
			});
		button_two.setFont(new Font("Rockwell", Font.BOLD, 13));
		button_two.setBackground(Color.BLACK);
		button_two.setBounds(70, 279, 50, 38);
		layoutField.getContentPane().add(button_two);
		button_two.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton button_three = new JButton("3");
		button_three.setForeground(Color.WHITE);
		button_three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button=="on") {
					textField_Top.setText(textField_Top.getText().toString());
					mValueOne=mValueAnswer;
					button="off";
				}if(button=="off") {
					textField_Stacks.setText(textField_Stacks.getText()+"3");
					textField_Top.setText(textField_Top.getText()+"3");
					mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
					if(mAddition==true){
						mAddition=false;
						button="on";
					}
					if(mSubtract==true){
						mSubtract=false;
						button="on";
					}
					if(mMultiplication==true){
						mMultiplication=false;
						button="on";
					}
					if(mDivision==true){
						mDivision=false;
						button="on";
					}
				}
			}
			});
		button_three.setFont(new Font("Rockwell", Font.BOLD, 13));
		button_three.setBackground(Color.BLACK);
		button_three.setBounds(130, 279, 50, 38);
		layoutField.getContentPane().add(button_three);
		button_three.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton button_four = new JButton("4");
		button_four.setForeground(Color.WHITE);
		button_four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button=="on") {
					textField_Top.setText(textField_Top.getText().toString());
					mValueOne=mValueAnswer;
					button="off";
				}if(button=="off") {
					textField_Stacks.setText(textField_Stacks.getText()+"3");
					textField_Top.setText(textField_Top.getText()+"3");
					mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
					if(mAddition==true){
						mAddition=false;
						button="on";
					}
					if(mSubtract==true){
						mSubtract=false;
						button="on";
					}
					if(mMultiplication==true){
						mMultiplication=false;
						button="on";
					}
					if(mDivision==true){
						mDivision=false;
						button="on";
					}
					
				}
				
				}
			});
		button_four.setFont(new Font("Rockwell", Font.BOLD, 13));
		button_four.setBackground(Color.BLACK);
		button_four.setBounds(10, 230, 50, 38);
		layoutField.getContentPane().add(button_four);
		button_four.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton button_five = new JButton("5");
		button_five.setForeground(Color.WHITE);
		button_five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button=="on") {
					textField_Top.setText(textField_Top.getText().toString());
					mValueOne=mValueAnswer;
					button="off";
				}if(button=="off") {
					textField_Stacks.setText(textField_Stacks.getText()+"4");
					textField_Top.setText(textField_Top.getText()+"4");
					mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
					if(mAddition==true){
						mAddition=false;
						button="on";
					}
					if(mSubtract==true){
						mSubtract=false;
						button="on";
					}
					if(mMultiplication==true){
						mMultiplication=false;
						button="on";
					}
					if(mDivision==true){
						mDivision=false;
						button="on";
					}
					
				}
				
				}
			});
		button_five.setFont(new Font("Rockwell", Font.BOLD, 13));
		button_five.setBackground(Color.BLACK);
		button_five.setBounds(70, 230, 50, 38);
		layoutField.getContentPane().add(button_five);
		button_five.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton button_six = new JButton("6");
		button_six.setForeground(Color.WHITE);
		button_six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button=="on") {
					textField_Top.setText(textField_Top.getText().toString());
					mValueOne=mValueAnswer;
					button="off";
				}if(button=="off") {
					textField_Stacks.setText(textField_Stacks.getText()+"6");
					textField_Top.setText(textField_Top.getText()+"6");
					mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
					if(mAddition==true){
						mAddition=false;
						button="on";
					}
					if(mSubtract==true){
						mSubtract=false;
						button="on";
					}
					if(mMultiplication==true){
						mMultiplication=false;
						button="on";
					}
					if(mDivision==true){
						mDivision=false;
						button="on";
					}
					
				}
				
				}
			});
		button_six.setFont(new Font("Rockwell", Font.BOLD, 13));
		button_six.setBackground(Color.BLACK);
		button_six.setBounds(130, 230, 50, 38);
		layoutField.getContentPane().add(button_six);
		button_six.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton button_seven = new JButton("7");
		button_seven.setForeground(Color.WHITE);
		button_seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button=="on") {
					textField_Top.setText(textField_Top.getText().toString());
					mValueOne=mValueAnswer;
					button="off";
				}if(button=="off") {
					textField_Stacks.setText(textField_Stacks.getText()+"7");
					textField_Top.setText(textField_Top.getText()+"7");
					mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
					if(mAddition==true){
						mAddition=false;
						button="on";
					}
					if(mSubtract==true){
						mSubtract=false;
						button="on";
					}
					if(mMultiplication==true){
						mMultiplication=false;
						button="on";
					}
					if(mDivision==true){
						mDivision=false;
						button="on";
					}
					
				}
				
				}
			});
		button_seven.setFont(new Font("Rockwell", Font.BOLD, 12));
		button_seven.setBackground(Color.BLACK);
		button_seven.setBounds(10, 181, 50, 38);
		layoutField.getContentPane().add(button_seven);
		button_seven.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton button_eight = new JButton("8");
		button_eight.setForeground(Color.WHITE);
		button_eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button=="on") {
					textField_Top.setText(textField_Top.getText().toString());
					mValueOne=mValueAnswer;
					button="off";
				}if(button=="off") {
					textField_Stacks.setText(textField_Stacks.getText()+"8");
					textField_Top.setText(textField_Top.getText()+"8");
					mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
					if(mAddition==true){
						mAddition=false;
						button="on";
					}
					if(mSubtract==true){
						mSubtract=false;
						button="on";
					}
					if(mMultiplication==true){
						mMultiplication=false;
						button="on";
					}
					if(mDivision==true){
						mDivision=false;
						button="on";
					}
					
				}
				
				}
			});
		button_eight.setFont(new Font("Rockwell", Font.BOLD, 13));
		button_eight.setBackground(Color.BLACK);
		button_eight.setBounds(70, 181, 50, 38);
		layoutField.getContentPane().add(button_eight);
		button_eight.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton button_nine = new JButton("9");
		button_nine.setForeground(Color.WHITE);
		button_nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(button=="on") {
					textField_Top.setText(textField_Top.getText().toString());
					mValueOne=mValueAnswer;
					button="off";
				}if(button=="off") {
					textField_Stacks.setText(textField_Stacks.getText()+"9");
					textField_Top.setText(textField_Top.getText()+"9");
					mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
					if(mAddition==true){
						mAddition=false;
						button="on";
					}
					if(mSubtract==true){
						mSubtract=false;
						button="on";
					}
					if(mMultiplication==true){
						mMultiplication=false;
						button="on";
					}
					if(mDivision==true){
						mDivision=false;
						button="on";
					}
					
				}
				
				}
			});
		button_nine.setFont(new Font("Rockwell", Font.BOLD, 13));
		button_nine.setBackground(Color.BLACK);
		button_nine.setBounds(130, 181, 50, 38);
		layoutField.getContentPane().add(button_nine);
		button_nine.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton addition = new JButton("+");
		addition.setForeground(Color.WHITE);
		addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_Bottom==null){
					textField_Bottom.setText("");
				}else{
					mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
					textField_Top.setText(textField_Top.getText().toString()+"+");
					mValueAnswer=mValueOne+mValueTwo;
					textField_Bottom.setText(mValueOne+mValueTwo+"");
					mAddition=true;
					textField_Stacks.setText(null);
				}
				
				
			}
		});
		addition.setFont(new Font("Rockwell", Font.BOLD, 15));
		addition.setBackground(Color.BLACK);
		addition.setBounds(190, 328, 50, 38);
		layoutField.getContentPane().add(addition);
		addition.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton substraction = new JButton("-");
		substraction.setForeground(Color.WHITE);
		substraction.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				if(textField_Bottom==null){
					textField_Bottom.setText("");
				}else{
					mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
					textField_Top.setText(textField_Top.getText().toString()+"-");
					mValueAnswer=mValueOne-mValueTwo;
					textField_Bottom.setText(mValueOne-mValueTwo+"");
					mAddition=true;
					textField_Stacks.setText(null);
			}
			}
		});
		substraction.setFont(new Font("Rockwell", Font.BOLD, 16));
		substraction.setBackground(Color.BLACK);
		substraction.setBounds(190, 279, 50, 38);
		layoutField.getContentPane().add(substraction);
		substraction.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton division = new JButton("/");
		division.setForeground(Color.WHITE);
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField_Bottom==null){
					textField_Bottom.setText("");
				}else{
					mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
					textField_Top.setText(textField_Top.getText().toString()+"/");
					mValueAnswer=mValueOne/mValueTwo;
					textField_Bottom.setText(mValueOne/mValueTwo+"");
					mAddition=true;
					textField_Stacks.setText(null);
				}
			}
		});
		
		JButton multiplication = new JButton("*");
		multiplication.setForeground(Color.WHITE);
		multiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_Bottom==null){
					textField_Bottom.setText("");
				}else{
					mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
					textField_Top.setText(textField_Top.getText().toString()+"*");
					mValueAnswer=mValueOne*mValueTwo;
					textField_Bottom.setText(mValueOne*mValueTwo+"");
					mAddition=true;
					textField_Stacks.setText(null);
			}
			}
		});
		multiplication.setFont(new Font("Rockwell", Font.BOLD, 13));
		multiplication.setBackground(Color.BLACK);
		multiplication.setBounds(190, 230, 50, 38);
		layoutField.getContentPane().add(multiplication);
		multiplication.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		division.setFont(new Font("Rockwell", Font.BOLD, 13));
		division.setBackground(Color.BLACK);
		division.setBounds(190, 181, 50, 38);
		layoutField.getContentPane().add(division);
		division.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
				//textField_1.setText(textField_1.getText().toString()+textField.getText().toString()+"");
				mValueAnswer=mValueOne+mValueTwo;
				textField_Bottom.setText(mValueAnswer+"");
				   textField_Stacks.setText(null);
				   
		    if(mReciprocal==true){
		    textField_Bottom.setText(1/mValueTwo+"");
		    mReciprocal=false;
		    }
		    
		    	if(mSqrt==true){
					squareroot = mValueTwo / 2;
					do
					{
						t = squareroot;
						squareroot = (t + (mValueTwo / t)) / 2;
					}
					while ((t - squareroot) !=0);
					
					textField_Bottom.setText(squareroot+"");
					mSqrt=false;
					button="off";
					if(mValueAnswer<0){
						negative="on";
					}
					if((t - squareroot) < 0){
						textField_Bottom.setText("not a number");
					}
				}
		    	
		    	if(mPercent==true){
					mValueAnswer=mValueTwo/100;
					textField_Bottom.setText(mValueTwo/100+"");
					mPercent=false;
		    }
		}
	});
		equal.setForeground(Color.WHITE);
		equal.setFont(new Font("Rockwell", Font.BOLD, 15));
		equal.setBackground(Color.BLACK);
		equal.setBounds(250, 279, 50, 87);
		layoutField.getContentPane().add(equal);
		equal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton sqrt = new JButton("\u221A");
		sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_Top.setText("sqrt(");
				mSqrt=true;
				textField_Bottom.setText(null);
			}
			
		});
		
		JButton dot = new JButton(".");
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_Top.setText(textField_Top.getText()+".");
				textField_Stacks.setText(textField_Stacks.getText()+".");
			}
		});
		dot.setForeground(Color.WHITE);
		dot.setFont(new Font("Rockwell", Font.BOLD, 20));
		dot.setBackground(Color.BLACK);
		dot.setBounds(130, 328, 50, 38);
		layoutField.getContentPane().add(dot);
		dot.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		sqrt.setForeground(Color.WHITE);
		sqrt.setFont(new Font("Rockwell", Font.BOLD, 13));
		sqrt.setBackground(Color.BLACK);
		sqrt.setBounds(250, 132, 50, 38);
	  	layoutField.getContentPane().add(sqrt);
		sqrt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton plus_minus = new JButton("\u00B1");
		plus_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mValueOne=Float.parseFloat(textField_Stacks.getText()+"");
				if(negative.equals("off")){
					textField_Stacks.setText("-"+textField_Stacks.getText());
					textField_Top.setText("-"+textField_Top.getText());
					negative="on";
				}else if(negative=="on"){
					mValueP=mValueOne+-mValueOne+-mValueOne;
					textField_Stacks.setText(mValueP+"");
					textField_Top.setText(mValueP+"");
					negative="off";
				}
			}
		});
		plus_minus.setForeground(Color.WHITE);
		plus_minus.setFont(new Font("Rockwell", Font.BOLD, 10));
		plus_minus.setBackground(Color.BLACK);
		plus_minus.setBounds(190, 132, 50, 38);
		layoutField.getContentPane().add(plus_minus);
		plus_minus.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton percent = new JButton("%");
		percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mValueOne=Float.parseFloat(textField.getText()+"");
				textField_Top.setText("%");
				mPercent=true;
				textField_Bottom.setText(null);
			}
		});
		percent.setForeground(Color.WHITE);
		percent.setFont(new Font("Rockwell", Font.BOLD, 13));
		percent.setBackground(Color.BLACK);
		percent.setBounds(250, 181, 50, 38);
		layoutField.getContentPane().add(percent);
		percent.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton reciprocal = new JButton("1/x");
		reciprocal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mReciprocal=true;
				textField_Top.setText("recip{");
				textField_Bottom.setText(null);
			}
		});
		reciprocal.setForeground(Color.WHITE);
		reciprocal.setFont(new Font("Rockwell", Font.PLAIN, 10));
		reciprocal.setBackground(Color.BLACK);
		reciprocal.setBounds(250, 230, 50, 38);
		layoutField.getContentPane().add(reciprocal);
		reciprocal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton backspace = new JButton("\u2190");
		backspace.setForeground(Color.WHITE);
		backspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length =textField_Stacks.getText().length();
				int number=length-1;
				
				if (length>0)
				{
				StringBuilder back=new StringBuilder(textField_Stacks.getText());
				back.deleteCharAt(number);
				textField_Top.setText(back.toString());
				textField_Stacks.setText(back.toString());
			}
			}
		
		
			
			
		});
		backspace.setFont(new Font("Times New Roman", Font.BOLD, 12));
		backspace.setBackground(Color.BLACK);
		backspace.setBounds(10, 132, 50, 38);
		layoutField.getContentPane().add(backspace);
		backspace.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton btnAbout = new JButton("ABOUT");
		btnAbout.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ImageIcon iconic = new ImageIcon(jise.class.getResource("icon.jpg"));
				iconic.setDescription("Made by Me\n18 yAGE\nMM/DD/YY\n\n\nCalculator 1.0\n\n");
				JFrame abt = new JFrame();
				JOptionPane.showMessageDialog(abt, iconic.getDescription(), "About", JOptionPane.WARNING_MESSAGE, iconic);
				abt.setBounds(0,0, 90,90);
			}
		});
		
		JButton clearentry = new JButton("CE");
		clearentry.setForeground(Color.WHITE);
		clearentry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_Bottom.setText(null);
				textField_Stacks.setText(null);
			}
		});
		clearentry.setFont(new Font("Rockwell", Font.BOLD, 10));
		clearentry.setBackground(Color.BLACK);
		clearentry.setBounds(70, 132, 50, 38);
		layoutField.getContentPane().add(clearentry);
		clearentry.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		JButton clear = new JButton("C");
		clear.setForeground(Color.WHITE);
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mValueOne=0;
				mValueTwo=0;
				mValueAnswer=0;
				textField_Top.setText(null);
				textField_Bottom.setText(null);
				textField_Stacks.setText(null);
			}
		});
		clear.setFont(new Font("Rockwell", Font.BOLD, 10));
		clear.setBackground(Color.BLACK);
		clear.setBounds(130, 132, 50, 38);
		layoutField.getContentPane().add(clear);
		clear.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		btnAbout.setBackground(Color.BLACK);
		btnAbout.setForeground(Color.WHITE);
		btnAbout.setBounds(209, 11, 89, 23);
		layoutField.getContentPane().add(btnAbout);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//SECRET KeyPress
		
		btnAbout.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		textField_Bottom.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		textField_Top.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		textField_Stacks.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent btn) {
				onKeyPress(btn);
			}
		});
		
		
		
		
		
		

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//KEYPRESS

	public void onKeyPress(KeyEvent btn) {
		//Numbers
		if(btn.getKeyCode() == KeyEvent.VK_0 || btn.getKeyCode() == KeyEvent.VK_NUMPAD0){
			if(button=="on") {
				textField_Top.setText(textField_Top.getText().toString());
				mValueOne=mValueAnswer;
				button="off";
			}if(button=="off") {
				textField_Stacks.setText(textField_Stacks.getText()+"0");
				textField_Top.setText(textField_Top.getText()+"0");
				mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
				if(mAddition==true){
					mAddition=false;
					button="on";
				}
				if(mSubtract==true){
					mSubtract=false;
					button="on";
				}
				if(mMultiplication==true){
					mMultiplication=false;
					button="on";
				}
				if(mDivision==true){
					mDivision=false;
					button="on";
				}
			}
		}else if(btn.getKeyCode() == KeyEvent.VK_1 || btn.getKeyCode() == KeyEvent.VK_NUMPAD1){
			if(button=="on") {
				textField_Top.setText(textField_Top.getText().toString());
				mValueOne=mValueAnswer;
				button="off";
			}if(button=="off") {
				textField_Stacks.setText(textField_Stacks.getText()+"1");
				textField_Top.setText(textField_Top.getText()+"1");
				mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
				if(mAddition==true){
					mAddition=false;
					button="on";
				}
				if(mSubtract==true){
					mSubtract=false;
					button="on";
				}
				if(mMultiplication==true){
					mMultiplication=false;
					button="on";
				}
				if(mDivision==true){
					mDivision=false;
					button="on";
				}
			}
		}else if(btn.getKeyCode() == KeyEvent.VK_2 || btn.getKeyCode() == KeyEvent.VK_NUMPAD2){
			if(button=="on") {
				textField_Top.setText(textField_Top.getText().toString());
				mValueOne=mValueAnswer;
				button="off";
			}if(button=="off") {
				textField_Stacks.setText(textField_Stacks.getText()+"2");
				textField_Top.setText(textField_Top.getText()+"2");
				mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
				if(mAddition==true){
					mAddition=false;
					button="on";
				}
				if(mSubtract==true){
					mSubtract=false;
					button="on";
				}
				if(mMultiplication==true){
					mMultiplication=false;
					button="on";
				}
				if(mDivision==true){
					mDivision=false;
					button="on";
				}
			}
		}else if(btn.getKeyCode() == KeyEvent.VK_3 || btn.getKeyCode() == KeyEvent.VK_NUMPAD3){
			if(button=="on") {
				textField_Top.setText(textField_Top.getText().toString());
				mValueOne=mValueAnswer;
				button="off";
			}if(button=="off") {
				textField_Stacks.setText(textField_Stacks.getText()+"3");
				textField_Top.setText(textField_Top.getText()+"3");
				mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
				if(mAddition==true){
					mAddition=false;
					button="on";
				}
				if(mSubtract==true){
					mSubtract=false;
					button="on";
				}
				if(mMultiplication==true){
					mMultiplication=false;
					button="on";
				}
				if(mDivision==true){
					mDivision=false;
					button="on";
				}
			}
		}else if(btn.getKeyCode() == KeyEvent.VK_4 || btn.getKeyCode() == KeyEvent.VK_NUMPAD4){
			if(button=="on") {
				textField_Top.setText(textField_Top.getText().toString());
				mValueOne=mValueAnswer;
				button="off";
			}if(button=="off") {
				textField_Stacks.setText(textField_Stacks.getText()+"4");
				textField_Top.setText(textField_Top.getText()+"4");
				mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
				if(mAddition==true){
					mAddition=false;
					button="on";
				}
				if(mSubtract==true){
					mSubtract=false;
					button="on";
				}
				if(mMultiplication==true){
					mMultiplication=false;
					button="on";
				}
				if(mDivision==true){
					mDivision=false;
					button="on";
				}
			}
		}else if(btn.getKeyCode() == KeyEvent.VK_5 || btn.getKeyCode() == KeyEvent.VK_NUMPAD5){
			if(button=="on") {
				textField_Top.setText(textField_Top.getText().toString());
				mValueOne=mValueAnswer;
				button="off";
			}if(button=="off") {
				textField_Stacks.setText(textField_Stacks.getText()+"5");
				textField_Top.setText(textField_Top.getText()+"5");
				mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
				if(mAddition==true){
					mAddition=false;
					button="on";
				}
				if(mSubtract==true){
					mSubtract=false;
					button="on";
				}
				if(mMultiplication==true){
					mMultiplication=false;
					button="on";
				}
				if(mDivision==true){
					mDivision=false;
					button="on";
				}
			}
		}else if(btn.getKeyCode() == KeyEvent.VK_6 || btn.getKeyCode() == KeyEvent.VK_NUMPAD6){
			if(button=="on") {
				textField_Top.setText(textField_Top.getText().toString());
				mValueOne=mValueAnswer;
				button="off";
			}if(button=="off") {
				textField_Stacks.setText(textField_Stacks.getText()+"6");
				textField_Top.setText(textField_Top.getText()+"6");
				mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
				if(mAddition==true){
					mAddition=false;
					button="on";
				}
				if(mSubtract==true){
					mSubtract=false;
					button="on";
				}
				if(mMultiplication==true){
					mMultiplication=false;
					button="on";
				}
				if(mDivision==true){
					mDivision=false;
					button="on";
				}
			}
		}else if(btn.getKeyCode() == KeyEvent.VK_7 || btn.getKeyCode() == KeyEvent.VK_NUMPAD7){
			if(button=="on") {
				textField_Top.setText(textField_Top.getText().toString());
				mValueOne=mValueAnswer;
				button="off";
			}if(button=="off") {
				textField_Stacks.setText(textField_Stacks.getText()+"7");
				textField_Top.setText(textField_Top.getText()+"7");
				mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
				if(mAddition==true){
					mAddition=false;
					button="on";
				}
				if(mSubtract==true){
					mSubtract=false;
					button="on";
				}
				if(mMultiplication==true){
					mMultiplication=false;
					button="on";
				}
				if(mDivision==true){
					mDivision=false;
					button="on";
				}
			}
		}else if(btn.getKeyCode() == KeyEvent.VK_8 || btn.getKeyCode() == KeyEvent.VK_NUMPAD8){
			if(button=="on") {
				textField_Top.setText(textField_Top.getText().toString());
				mValueOne=mValueAnswer;
				button="off";
			}if(button=="off") {
				textField_Stacks.setText(textField_Stacks.getText()+"8");
				textField_Top.setText(textField_Top.getText()+"8");
				mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
				if(mAddition==true){
					mAddition=false;
					button="on";
				}
				if(mSubtract==true){
					mSubtract=false;
					button="on";
				}
				if(mMultiplication==true){
					mMultiplication=false;
					button="on";
				}
				if(mDivision==true){
					mDivision=false;
					button="on";
				}
			}
		}else if(btn.getKeyCode() == KeyEvent.VK_9 || btn.getKeyCode() == KeyEvent.VK_NUMPAD9){
			if(button=="on") {
				textField_Top.setText(textField_Top.getText().toString());
				mValueOne=mValueAnswer;
				button="off";
			}if(button=="off") {
				textField_Stacks.setText(textField_Stacks.getText()+"9");
				textField_Top.setText(textField_Top.getText()+"9");
				mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
				if(mAddition==true){
					mAddition=false;
					button="on";
				}
				if(mSubtract==true){
					mSubtract=false;
					button="on";
				}
				if(mMultiplication==true){
					mMultiplication=false;
					button="on";
				}
				if(mDivision==true){
					mDivision=false;
					button="on";
				}
			}
		}
		//Operation
		else if(btn.getKeyCode() == KeyEvent.VK_ADD || btn.getKeyCode() == KeyEvent.VK_PLUS){
			if(textField_Bottom==null){
				textField_Bottom.setText("");
			}else{
				mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
				textField_Top.setText(textField_Top.getText().toString()+"+");
				mValueAnswer=mValueOne+mValueTwo;
				textField_Bottom.setText(mValueOne+mValueTwo+"");
				mAddition=true;
				textField_Stacks.setText(null);
			}
		}else if(btn.getKeyCode() == KeyEvent.VK_MINUS || btn.getKeyCode() == KeyEvent.VK_SUBTRACT){
			if(textField_Bottom==null){
				textField_Bottom.setText("");
			}else{
				mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
				textField_Top.setText(textField_Top.getText().toString()+"-");
				mValueAnswer=mValueOne+mValueTwo;
				textField_Bottom.setText(mValueOne+mValueTwo+"");
				mAddition=true;
				textField_Stacks.setText(null);
			}
		}else if(btn.getKeyCode() == KeyEvent.VK_DIVIDE || btn.getKeyCode() == KeyEvent.VK_SLASH){
			if(textField_Bottom==null){
				textField_Bottom.setText("");
			}else{
				mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
				textField_Top.setText(textField_Top.getText().toString()+"/");
				mValueAnswer=mValueOne/mValueTwo;
				textField_Bottom.setText(mValueOne/mValueTwo+"");
				mAddition=true;
				textField_Stacks.setText(null);
			}
		}else if(btn.getKeyCode() == KeyEvent.VK_MULTIPLY || btn.getKeyCode() == KeyEvent.VK_ASTERISK){
			if(textField_Bottom==null){
				textField_Bottom.setText("");
			}else{
				mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
				textField_Top.setText(textField_Top.getText().toString()+"*");
				mValueAnswer=mValueOne*mValueTwo;
				textField_Bottom.setText(mValueOne*mValueTwo+"");
				mAddition=true;
				textField_Stacks.setText(null);
		}
		}else if(btn.getKeyCode() == KeyEvent.VK_EQUALS || btn.getKeyCode() == KeyEvent.VK_ENTER){
			mValueTwo=Float.parseFloat(textField_Stacks.getText()+"");
			//textField_1.setText(textField_1.getText().toString()+textField.getText().toString()+"");
			mValueAnswer=mValueOne+mValueTwo;
			textField_Bottom.setText(mValueAnswer+"");
			   textField_Stacks.setText(null);
			   
	    if(mReciprocal==true){
	    textField_Bottom.setText(1/mValueTwo+"");
	    mReciprocal=false;
	    }
	    
	    	if(mSqrt==true){
				squareroot = mValueTwo / 2;
				do
				{
					t = squareroot;
					squareroot = (t + (mValueTwo / t)) / 2;
				}
				while ((t - squareroot) !=0);
				
				textField_Bottom.setText(squareroot+"");
				mSqrt=false;
				button="off";
				if(mValueAnswer<0){
					negative="on";
				}
				if((t - squareroot) < 0){
					textField_Bottom.setText("not a number");
				}
			}
	    	
	    	if(mPercent==true){
				mValueAnswer=mValueTwo/100;
				textField_Bottom.setText(mValueTwo/100+"");
				mPercent=false;
	    }
		}
			//
		else if(btn.getKeyCode() == KeyEvent.VK_DECIMAL || btn.getKeyCode() == KeyEvent.VK_PERIOD){
			textField_Top.setText(textField_Top.getText()+".");
			textField_Stacks.setText(textField_Stacks.getText()+".");
		}else if(btn.getKeyCode() == KeyEvent.VK_S){ // SQRT
			textField_Top.setText("sqrt(");
			mSqrt=true;
			textField_Bottom.setText(null);
		}else if(btn.getKeyCode() == KeyEvent.VK_P){ // PERCENTAGE
			textField_Top.setText("%");
			mPercent=true;
			textField_Bottom.setText(null);
		}else if(btn.getKeyCode() == KeyEvent.VK_R){ // RECIPROCAL
			mReciprocal=true;
			textField_Top.setText("recip{");
			textField_Bottom.setText(null);
		}else if(btn.getKeyCode() == KeyEvent.VK_Q){ // PLUS or MINUS
			mValueOne=Float.parseFloat(textField_Stacks.getText()+"");
			if(negative.equals("off")){
				textField_Stacks.setText("-"+textField_Stacks.getText());
				textField_Top.setText("-"+textField_Top.getText());
				negative="on";
			}else if(negative=="on"){
				mValueP=mValueOne+-mValueOne+-mValueOne;
				textField_Stacks.setText(mValueP+"");
				textField_Top.setText(mValueP+"");
				negative="off";
			}
		}
		//C, CE, <-
		else if(btn.getKeyCode() == KeyEvent.VK_C || btn.getKeyCode() == KeyEvent.VK_CLEAR){
			mValueOne=0;
			mValueTwo=0;
			mValueAnswer=1;
			textField_Top.setText(null);
			textField_Bottom.setText(null);
			textField_Stacks.setText(null);
		}else if(btn.getKeyCode() == KeyEvent.VK_V || btn.getKeyCode() == KeyEvent.VK_CLEAR){
			textField_Bottom.setText(null);
			textField_Stacks.setText(null);
		}else if(btn.getKeyCode() == KeyEvent.VK_B || btn.getKeyCode() == KeyEvent.VK_BACK_SPACE){
			int length =textField_Stacks.getText().length();
			int number=length-1;
			
			if (length>0)
			{
			StringBuilder back=new StringBuilder(textField_Stacks.getText());
			back.deleteCharAt(number);
			textField_Top.setText(back.toString());
			textField_Stacks.setText(back.toString());
		}
		}
	
		
	}

}
