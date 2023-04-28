import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel USERNAME = new JLabel("USERNAME");
		USERNAME.setFont(new Font("Segoe UI", Font.BOLD, 12));
		USERNAME.setBounds(87, 79, 110, 38);
		contentPane.add(USERNAME);
		
		JLabel lblNewLabel = new JLabel("Library Management ");
		lblNewLabel.setBounds(0, 10, 534, 47);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		JLabel PASSWORD = new JLabel("PASSWORD");
		PASSWORD.setFont(new Font("Segoe UI", Font.BOLD, 12));
		PASSWORD.setBounds(87, 139, 110, 38);
		contentPane.add(PASSWORD);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(207, 86, 234, 27);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Segoe UI", Font.BOLD, 12));
		passwordField.setBounds(207, 145, 234, 27);
		contentPane.add(passwordField);
		
		JButton login = new JButton("LOGIN");
		login.setFont(new Font("Segoe UI", Font.BOLD, 12));
		login.setBounds(198, 274, 158, 21);
		contentPane.add(login);
		
		JLabel lblSelectUser = new JLabel("SELECT USER");
		lblSelectUser.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblSelectUser.setBounds(87, 201, 110, 38);
		contentPane.add(lblSelectUser);
		
		JComboBox selectusercomboBox = new JComboBox();
		selectusercomboBox.setModel(new DefaultComboBoxModel(new String[] {"ADMIN", "LIBRARIAN"}));
		selectusercomboBox.setFont(new Font("Segoe UI", Font.BOLD, 12));
		selectusercomboBox.setToolTipText("");
		selectusercomboBox.setBounds(207, 207, 234, 27);
		contentPane.add(selectusercomboBox);
	}
}
