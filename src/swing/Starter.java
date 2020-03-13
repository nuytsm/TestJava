package swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Starter {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Programma");
		JPanel panel = new JPanel();
		frame.setSize(400, 300);
		frame.add(panel);
		JLabel guilabel = new JLabel("Dit is een gui label");
		JTextField textfield = new JTextField();
		textfield.setColumns(10);
		JTextField textfield2 = new JTextField();
		textfield2.setColumns(10);
		JButton button = new JButton("Knop");
		button.setSize(100, 30);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				guilabel.setText("" + (Integer.parseInt(textfield.getText()) * Integer.parseInt(textfield2.getText())));
			}
		});
		panel.add(textfield);
		panel.add(textfield2);
		panel.add(button);
		panel.add(guilabel);
		frame.setVisible(true);
	}

}
