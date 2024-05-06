package AWT.learning;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class Counter extends Frame {
	int count = 0;

	Counter() {
		Label header = new Label("Count the number of times you clicked");
		header.setBounds(50, 50, 300, 30);

		Button submit = new Button("Count");
		submit.setBounds(170, 100, 80, 20);
		
		Button reset = new Button("reset");
		reset.setBounds(60, 100, 80, 20);

		final Label ans = new Label();
		ans.setBounds(100, 140, 80, 20);
		

		ActionListener submitListen = new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				ans.setText("Count " + String.valueOf(++count));
				

			}
		};
		
		ActionListener resetListner=new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				ans.setText("Count 0");
				count=0;
			}
		};
		
		reset.addActionListener(resetListner);
		submit.addActionListener(submitListen);
		add(ans);
		add(reset);
		add(header);
		add(submit);
		setLayout(null);
		setVisible(true);
		setSize(500, 500);

	}

	public static void main(String[] args) {
		new Counter();
	}

}
