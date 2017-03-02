package pl.jwrabel.trainings.javand2.gui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by jakubwrabel on 02.03.2017.
 */
public class CurrencyCalculator extends JFrame {
	public static void main(String[] args) {
		new CurrencyCalculator();
	}

	public CurrencyCalculator() throws HeadlessException {
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);

		JLabel labelPLN = new JLabel("Podaj kwotę w PLN");
		labelPLN.setSize(200, 50);
		labelPLN.setBorder(new LineBorder(Color.blue, 3));
		labelPLN.setLocation(0, 0);
		add(labelPLN);

		JTextField textFieldPLN = new JTextField();
		textFieldPLN.setSize(200, 50);
		textFieldPLN.setLocation(0, 50);
		add(textFieldPLN);


		JLabel labelEUR = new JLabel("Podaj kwotę w EUR");
		labelEUR.setSize(200, 50);
		labelEUR.setLocation(0, 120);
		add(labelEUR);

		JTextField textFieldEUR = new JTextField();
		textFieldEUR.setSize(200, 50);
		textFieldEUR.setLocation(0, 190);
		add(textFieldEUR);


		JButton jButton = new JButton("Przelicz");
		jButton.setSize(100, 50);
		jButton.setLocation(200, 100);
		add(jButton);

		jButton.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String amountPLN = textFieldPLN.getText();
				try {
					amountPLN = amountPLN.replace(",", ".");
					double amountPLNDouble = Double.parseDouble(amountPLN);
					double amountEUR = amountPLNDouble / 4.4d;
					textFieldEUR.setText("" + amountEUR);

				} catch (NumberFormatException e1) {
					textFieldEUR.setText("Niepoprawna liczba");

					JOptionPane.showMessageDialog(getParent(), "Wrong number", "ERROR", JOptionPane.ERROR_MESSAGE);
				}

//				String.valueOf(amountEUR);
//				textFieldEUR.setText(Double.toString(amountEUR));
			}

			@Override
			public void mousePressed(MouseEvent e) {

			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {

			}

			@Override
			public void mouseExited(MouseEvent e) {

			}
		});

	}
}
