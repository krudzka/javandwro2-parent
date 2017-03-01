package pl.jwrabel.trainings.javand2.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by jakubwrabel on 01.03.2017.
 */
public class MyWindowSimpleNullLayout extends JFrame {
	private JButton button;
	private JTextField textField;
	private JTextArea textArea;
	private final JComboBox<String> comboBox;

	public static void main(String[] args) {
		new MyWindowSimpleNullLayout();
	}

	public MyWindowSimpleNullLayout() throws HeadlessException {
		// Window common setup
		setVisible(true);
		setSize(600, 400);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(null);
		setTitle("My awesome window!!!");

		// Button setup
		button = new JButton("Click me");
		button.setSize(200, 50);
		button.setLocation(0, 70);
		add(button);

		// TextField setup
		textField = new JTextField();
		textField.setSize(200, 50);
		textField.setLocation(0, 0);
		add(textField);

		// TextArea setup
		textArea = new JTextArea();
		textArea.setSize(250, 100);
		textArea.setLocation(250, 50);
		add(textArea);

		// ComboBox setup
		comboBox = new JComboBox<>();
		comboBox.setSize(200, 50);
		comboBox.setLocation(0, 150);
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
