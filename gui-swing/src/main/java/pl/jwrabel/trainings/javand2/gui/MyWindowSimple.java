package pl.jwrabel.trainings.javand2.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by jakubwrabel on 01.03.2017.
 */
public class MyWindowSimple extends JFrame {
	private JButton button;
	private JTextField textField;
	private JTextArea textArea;
	private final JComboBox<String> comboBox;

	public static void main(String[] args) {
		new MyWindowSimple();
	}

	public MyWindowSimple() throws HeadlessException {
		// Window common setup
		setVisible(true);
		setSize(600, 400);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setTitle("My awesome window!!!");

		// Button setup
		button = new JButton("Click me");
		button.setPreferredSize(new Dimension(200, 50));
		add(button);

		// TextField setup
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(300, 50));
		add(textField);

		// TextArea setup
		textArea = new JTextArea();
		textArea.setPreferredSize(new Dimension(300, 100));
		add(textArea);

		// ComboBox setup
		comboBox = new JComboBox<>();
		comboBox.setPreferredSize(new Dimension(200, 50));
		add(comboBox);

		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
		comboBox.setModel(comboBoxModel);

		comboBoxModel.addElement("Audi");
		comboBoxModel.addElement("Volkswagen");
		comboBoxModel.addElement("Mazda");


		setListeners();
	}

	private void setListeners() {
		// KeyListener for MyWindowSimple
		addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {
			}

			public void keyPressed(KeyEvent e) {

			}

			public void keyReleased(KeyEvent e) {
				System.out.println("Pressed key with char [" + e.getKeyChar() + "]");
				System.out.println("Pressed key with keyCode: " + e.getKeyChar());

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					System.out.println("Enter pressed!");
				}

			}
		});

		// change listener for ComboBox
		comboBox.addActionListener(new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("ComboBox item changed to: " + comboBox.getSelectedItem());
			}
		});

		// click listener for button
		button.addMouseListener(
				new MouseListener() {
					public void mouseClicked(MouseEvent e) {
						String name = textField.getText();
						textArea.setText("Selected comboBox item: " + comboBox.getSelectedItem() + "\nHello " + name);
					}

					public void mousePressed(MouseEvent e) {
					}

					public void mouseReleased(MouseEvent e) {
					}

					public void mouseEntered(MouseEvent e) {
					}

					public void mouseExited(MouseEvent e) {
					}
				}
		);
	}

}
