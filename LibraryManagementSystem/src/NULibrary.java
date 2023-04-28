import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NULibrary extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NULibrary frame = new NULibrary();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NULibrary() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome to NU Library System");
		lblWelcome.setFont(new Font("Segoe UI", Font.BOLD, 22));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(10, 10, 417, 46);
		contentPane.add(lblWelcome);
		
		JButton btnbooks = new JButton("View Books");
		btnbooks.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnbooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnbooks.setBounds(119, 97, 200, 53);
		contentPane.add(btnbooks);
		
		JButton btnauthors = new JButton("View Authors");
		btnauthors.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnauthors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnauthors.setBounds(119, 198, 200, 53);
		contentPane.add(btnauthors);
		
		JButton btnNewButton = new JButton("Rent a Book");
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 20));
		btnNewButton.setBounds(119, 291, 200, 53);
		contentPane.add(btnNewButton);
	}

}
