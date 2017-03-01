package pl.jwrabel.trainings.javand2.gui.animate;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jakubwrabel on 01.03.2017.
 */
public class AnimationPanel extends JPanel {
	private int y = 0;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.RED);
		g.fillOval(getWidth() / 2, y, 30, 30);
	}

	public void animate() {
		Timer timer = new Timer(30, null);
		timer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				y++;
				repaint();

				if (y >= getHeight() - 30) {
					timer.stop();
				}
			}
		});
		timer.start();
	}
}
