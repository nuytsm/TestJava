package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiStarter {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("XX");
		frame.setSize(500, 600);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		JLabel text = new JLabel();
		
		JButton knop = new JButton("Knop");
		
		panel.add(knop);
		panel.add(text);
		knop.addActionListener(new ActionListener() {
			int counter = 0;
			
			@Override
			public void actionPerformed(ActionEvent e) {
				counter++;
				text.setText("Er werd zoveel keer geklikt: " + counter);
			}
		});
		
		frame.setVisible(true);
	}

}
