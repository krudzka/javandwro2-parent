package pl.jwrabel.trainings.javand2.gui.animate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by jakubwrabel on 01.03.2017.
 */
public class AnimateWindow extends JFrame {
	public static void main(String[] args) {
		new AnimateWindow();
	}

	public AnimateWindow() throws HeadlessException {
		setVisible(true);
		setSize(600, 400);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setTitle("My animate window!!!");

		JButton button = new JButton("Start animation");
		button.setPreferredSize(new Dimension(200, 50));
		add(button);

		AnimationPanel panel = new AnimationPanel();
		panel.setPreferredSize(new Dimension(300, 300));
		panel.setBackground(Color.ORANGE);
		add(panel);


		button.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.animate();
			}
		});

	}

}
