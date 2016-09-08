package net.franciscovillegas.cei.dda.observer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JLabel;

public class OtroOberserver implements Observer {
	private JLabel lblNewLabel;
	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OtroOberserver window = new OtroOberserver();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OtroOberserver() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		lblNewLabel = new JLabel("New label");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 146, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -130, SpringLayout.SOUTH, frame.getContentPane());
		frame.getContentPane().add(lblNewLabel);
	}

	@Override
	public void notificar(String mensaje) {
		lblNewLabel.setText(mensaje);
	}
}
