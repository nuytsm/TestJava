package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextEditor {
	
	ReadFile rf = new ReadFile();
	
	public static void main(String[] args) {
		TextEditor te = new TextEditor();
		te.createFrame();
	}
	
	public void createFrame() {
		JFrame frame = new JFrame("TextEditor");
		frame.setSize(400, 600);
		JPanel panel = createPanel();
		frame.add(panel);
		
		addTextArea(panel);
		addSaveKnop(panel);
		
		frame.setVisible(true);
	}

	private void addSaveKnop(JPanel panel) {
		JButton knop = new JButton("Save");
		knop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rf.writeToFile();
			}
		});
		panel.add(knop);
	}

	private JPanel createPanel() {
		JPanel panel = new JPanel();
		return panel;
	}

	private void addTextArea(JPanel panel) {
		JTextArea textarea = new JTextArea(20,20);
		JScrollPane sp = new JScrollPane(textarea);
		
		
		textarea.setText(rf.read());
		
		panel.add(sp);
	}

}
