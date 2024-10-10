package pkg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
public class UI extends JFrame {
	private JTextField searchField;
	private JButton searchButton;
	private JButton button2;
	private JTextArea resultArea;
	public UI() {
		setTitle("Book Search Application");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		JPanel topPanel = new JPanel();
		topPanel.add(new JLabel("Search for a book by title: "));
		searchField = new JTextField(20);
		topPanel.add(searchField);
		searchButton = new JButton("Search");
		topPanel.add(searchButton);
		button2 = new JButton("button");
		topPanel.add(button2);
		add(topPanel, BorderLayout.NORTH);
		resultArea = new JTextArea();
		resultArea.setEditable(false);
		add(new JScrollPane(resultArea), BorderLayout.CENTER);
		searchButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				designUI();
			}
		});
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new UI().setVisible(true);
			
			}
		 
	});
		
		
	}
	private void designUI()
	{
		this.searchButton.setBackground(Color.green);
		this.setSize(600,500);
	}
}
