package AWT.learning;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWT_Calaculator extends Frame implements ActionListener {
	
	TextField display;
	Button num1,num2,num3,num4,num5,num6,num7,num8,num9,num0,add,sub,mul,div,equal;
	
	public AWT_Calaculator() {
		
		
		
		 display = new TextField("0");

		 num1 = new Button("1");
		 num2 = new Button("2");
		 num3 = new Button("3");
		 add = new Button("+");
		 num4 = new Button("4");
		 num5 = new Button("5");
		 num6 = new Button("6");
		 sub = new Button("-");
		 num7 = new Button("7");
		 num8 = new Button("8");
		 num9 = new Button("9");
		 mul = new Button("*");
		 equal = new Button("=");
		 num0 = new Button("0");
		 div = new Button("/");

		display.setBounds(10, 50, 185, 20);
		num1.setBounds(10, 80, 45, 20);
		num2.setBounds(55, 80, 45, 20);
		num3.setBounds(100, 80, 45, 20);
		add.setBounds(145, 80, 45, 20);
		num4.setBounds(10, 110, 45, 20);
		num5.setBounds(55, 110, 45, 20);
		num6.setBounds(100, 110, 45, 20);
		sub.setBounds(145, 110, 45, 20);
		num7.setBounds(10, 140, 45, 20);
		num8.setBounds(55, 140, 45, 20);
		num9.setBounds(100, 140, 45, 20);
		mul.setBounds(145, 140, 45, 20);
		equal.setBounds(10, 170, 60, 20);
		num0.setBounds(70, 170, 60, 20);
		div.setBounds(130, 170, 60, 20);

		add(display);
		add(num1);
		add(num2);
		add(num3);
		add(add);
		add(num4);
		add(num5);
		add(num6);
		add(sub);
		add(num7);
		add(num8);
		add(num9);
		add(mul);
		add(equal);
		add(num0);
		add(div);

		
		num1.addActionListener( this);
		num2.addActionListener( this);
		num3.addActionListener( this);
		add.addActionListener( this);
		num4.addActionListener( this);
		num5.addActionListener( this);
		num6.addActionListener( this);
		sub.addActionListener( this);
		num7.addActionListener( this);
		num8.addActionListener( this);
		num9.addActionListener( this);
		mul.addActionListener( this);
		equal.addActionListener( this);
		num0.addActionListener( this);
		div.addActionListener( this);
		
		

		setSize(500, 500);
		setLayout(null);
		setVisible(true);
		setTitle("Calculator");
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==num1) {
		String expression=display.getText();
		expression+="1";
		display.setText(expression);
		}
		 if(e.getSource()==num2) {
			String expression=display.getText();
			expression+="2";
			display.setText(expression);
			}
		if(e.getSource()==num3) {
			String expression=display.getText();
			expression+="3";
			display.setText(expression);
			}
		if(e.getSource()==num4) {
			String expression=display.getText();
			expression+="0";
			display.setText(expression);
			}
		if(e.getSource()==num5) {
			String expression=display.getText();
			expression+="5";
			display.setText(expression);
			}
			if(e.getSource()==num6) {
				String expression=display.getText();
				expression+="6";
				display.setText(expression);
				}
			if(e.getSource()==num7) {
				String expression=display.getText();
				expression+="7";
				display.setText(expression);
				}
			if(e.getSource()==num8) {
				String expression=display.getText();
				expression+="8";
				display.setText(expression);
				}
			if(e.getSource()==num9) {
				String expression=display.getText();
				expression+="9";
				display.setText(expression);
				}
				if(e.getSource()==num0) {
					String expression=display.getText();
					expression+="0";
					display.setText(expression);
					}
				if(e.getSource()==add) {
					String expression=display.getText();
					expression+="+";
					display.setText(expression);
					}
				if(e.getSource()==sub) {
					String expression=display.getText();
					expression+="-";
					display.setText(expression);
					}
				if(e.getSource()==mul) {
					String expression=display.getText();
					expression+="*";
					display.setText(expression);
					}
					if(e.getSource()==div) {
						String expression=display.getText();
						expression+="/";
						display.setText(expression);
						}
					if(e.getSource()==equal) {
						String expression=display.getText();
						int a,b,i;
						char operator='+';
						
						String tema = "",temb="";
						
						for( i=0;i<expression.length();i++) {
							if(Character.isDigit(expression.charAt(i))) {
								tema+=expression.charAt(i);
							}
							else {
								operator=expression.charAt(i);
								break;
							}
						}
						temb=expression.substring(i+1);
						a=Integer.parseInt(tema);
						b=Integer.parseInt(temb);
						int result = 0 ;
						
						switch (operator) {
						case '+':
							result=a+b;
							break;
						case '-':
							result=a-b;
							break;
						case '/':
							result=a/b;
							break;
						case '*':
							result=a+b;
							break;

						default:
							break;
						}
						display.setText(String.valueOf(result));
						}
					
	}

	public static void main(String[] args) {
		new AWT_Calaculator();

	}

}
