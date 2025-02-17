package gioco_impiccato;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swingimpiccato extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingimpiccato frame = new swingimpiccato();
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
	public swingimpiccato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		hangman gioco = new hangman(parola, 5);
		
		JLabel lblNewLabel = new JLabel("Tentativi rimasti: ");
		lblNewLabel.setBounds(10, 21, 96, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Parola:");
		lblNewLabel_1.setBounds(10, 59, 82, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(56, 59, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel tentativi = new JLabel("dfsada");
		tentativi.setBounds(102, 21, 46, 14);
		contentPane.add(tentativi);
		
		JLabel lblNewLabel_3 = new JLabel("inserisci la parola qua sotto\r\n");
		lblNewLabel_3.setBounds(146, 21, 130, 14);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(156, 56, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField.getText().trim();
				
				
			}
		});
		btnNewButton.setBounds(163, 114, 89, 23);
		contentPane.add(btnNewButton);
	}
}
