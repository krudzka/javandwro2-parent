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
	JTextField textFieldPLN;
	JTextField textFieldEUR;
	JButton jButton;
	JComboBox comboBox;
	JLabel labelEUR;

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

		textFieldPLN = new JTextField();
		textFieldPLN.setSize(200, 50);
		textFieldPLN.setLocation(0, 50);
		add(textFieldPLN);


		labelEUR = new JLabel("Podaj kwotę w EUR");
		labelEUR.setSize(200, 50);
		labelEUR.setLocation(0, 120);
		add(labelEUR);

		textFieldEUR = new JTextField();
		textFieldEUR.setSize(200, 50);
		textFieldEUR.setLocation(0, 190);
		add(textFieldEUR);


		jButton = new JButton("Przelicz");
		jButton.setSize(100, 50);
		jButton.setLocation(200, 100);
		add(jButton);

		String[] comboBoxContent = new String[]{"USD", "EUR", "CHF"};
		comboBox = new JComboBox<>(comboBoxContent);
		comboBox.setSize(200, 50);
		comboBox.setLocation(200, 0);
		add(comboBox);

		setListeners();
	}

	private void setListeners() {
		jButton.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				convertCurrency();
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

	private void convertCurrency() {
		String amountPLN = textFieldPLN.getText();
		try {
			amountPLN = amountPLN.replace(",", ".");
			double amountPLNDouble = Double.parseDouble(amountPLN);

			String selectedItem = (String) comboBox.getSelectedItem();

			labelEUR.setText("Kwota w " + selectedItem);
			double result = convert(amountPLNDouble, selectedItem);
			textFieldEUR.setText("" + result);
		} catch (NumberFormatException e1) {
			textFieldEUR.setText("Niepoprawna liczba");

			JOptionPane.showMessageDialog(getParent(), "Wrong number", "ERROR", JOptionPane.ERROR_MESSAGE);
		}

//				String.valueOf(amountEUR);
//				textFieldEUR.setText(Double.toString(amountEUR));
	}

	private double convert(double amountPLNDouble, String selectedItem) {
		double result;

		switch (selectedItem) {
			case "USD":
				result = amountPLNDouble / 4.0d;
				break;
			case "EUR":
				result = amountPLNDouble / 4.4d;
				break;
			default:
				result = amountPLNDouble / 4.2d;
		}
		return result;
	}
}
