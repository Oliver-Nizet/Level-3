package dataStructures;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SantaList implements MouseListener {
	JFrame frame;
	JPanel panel;
	String[] images = new String[] { "vbucks-fortnite.jpg", "2125953_1.jpg", "back.jpg" };

	public static void main(String[] args) {
		SantaList sl = new SantaList();
	}

	SantaList() {
		frame = new JFrame();
		panel = new JPanel();
		frame.add(panel);
		frame.setVisible(true);
		frame.addMouseListener(this);

		frame.pack();

	}

	public ArrayList<JLabel> labels() {
		ArrayList<JLabel> labels = new ArrayList<>();
		for (int i = 0; i < images.length; i++) {
			JLabel label = loadImageFromJavaProject(images[i]);
			labels.add(label);
		}
		return labels;
	}

	private JLabel loadImageFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			return new JLabel(icon);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private JLabel loadImageFromJavaProject(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Random r = new Random();
		ArrayList<JLabel> labels = labels();
		JLabel image = labels.get(r.nextInt(labels.size()));
		panel.removeAll();
		panel.add(image);
		frame.setVisible(false);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
