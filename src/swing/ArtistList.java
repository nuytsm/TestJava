package swing;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import databases.DatabaseConnectie;

public class ArtistList {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Programma");
		JPanel panel = new JPanel();
		frame.setSize(400, 300);
		frame.add(panel);
		
		DatabaseConnectie dbcon = new DatabaseConnectie();
		
		List<String> artists = dbcon.getArtists();
		System.out.println("Aantal artiesten: " + artists.size());
		JList list = new JList(artists.toArray());
		list.setPreferredSize(new Dimension(200, 200));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(list);
		panel.add(scrollPane);
//		
		frame.setVisible(true);
	}

}
