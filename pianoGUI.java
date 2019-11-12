
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.security.SecureRandom;

public class pianoGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pianoGUI window = new pianoGUI();
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
	public pianoGUI() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
		private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	/**
	 * Creates a checkbox to allow the user to choose if they cna see the staff position of the note they play.
	 */
		JCheckBox showStaff;
		showStaff = new JCheckBox("Show Staff Position");
		showStaff.setSelected(false);
		showStaff.setBounds(0,425,150,50);
		frame.getContentPane().add(showStaff);
	/**
	 * Creates a checkbox to allow the user to play the keys using a different instrument.
	 */
		JCheckBox electricPiano;
		electricPiano = new JCheckBox("Electric Piano");
		electricPiano.setSelected(false);
		electricPiano.setBounds(850,425,150,15);
		frame.getContentPane().add(electricPiano);
		
		/*
		 *Creates checkbox for steel drum to play with steel drums
		 */
		JCheckBox steelDrum;
		steelDrum = new JCheckBox("Steel Drum");
		steelDrum.setSelected(false);
		steelDrum.setBounds(850,445,150,15);
		frame.getContentPane().add(steelDrum);
		
		/*
		 * This makes a new button that acts as a key on the piano. Specifically the white ones.
		 * I do this code repeatedly for all of the keys on my piano.
		 */
		JButton button_17 = new JButton("");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(47, "Low B");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())//Checks to see if the showStaff checkbox is selected
				{
				/**
				 * Generates an  image of the note that was just played
				 */
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		
		button_17.setBackground(Color.WHITE);
		button_17.setBounds(25, 150, 49, 273);
		frame.getContentPane().add(button_17);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(48, "Low C");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button.setBackground(Color.WHITE);
		button.setBounds(84, 150, 49, 273);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(50, "Low D");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(143, 150, 49, 273);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(52, "Low E");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(202, 150, 49, 273);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(53, "Low F");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(261, 150, 49, 273);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(55, "Low G");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(320, 150, 49, 273);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(57, "Middle A");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(379, 150, 49, 273);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(59, "Middle B");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(438, 150, 49, 273);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(60, "Middle C");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_7.setBackground(Color.WHITE);
		button_7.setBounds(497, 150, 49, 273);
		frame.getContentPane().add(button_7);
		/*
		 * This specific button plays and shows a random note on the keyboard
		 */
		JButton button_20 = new JButton("Random Note");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SecureRandom rand = new SecureRandom();
				key b = new key((rand.nextInt(26)+47), "Random Note");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
			
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				
			}
		});
		button_20.setBackground(Color.GRAY);
		button_20.setBounds(400, 425, 200, 50);
		frame.getContentPane().add(button_20);
		
		JButton button_8 = new JButton("");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(62, "Middle D");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_8.setBackground(Color.WHITE);
		button_8.setBounds(556, 150, 49, 273);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(64, "Middle E");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_9.setBackground(Color.WHITE);
		button_9.setBounds(615, 150, 49, 273);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(65, "Middle F");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_10.setBackground(Color.WHITE);
		button_10.setBounds(674, 150, 49, 273);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(67, "Middle G");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_11.setBackground(Color.WHITE);
		button_11.setBounds(733, 150, 49, 273);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(69, "High A");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_12.setBackground(Color.WHITE);
		button_12.setBounds(792, 150, 49, 273);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(71, "High B");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_13.setBackground(Color.WHITE);
		button_13.setBounds(851, 150, 49, 273);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(72, "High C");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_14.setBackground(Color.WHITE);
		button_14.setBounds(910, 150, 49, 273);
		frame.getContentPane().add(button_14);
		
		/*
		 * This makes a new button that acts as a key on the piano. Specifically the black ones.
		 * I do this for all of the black keys
		 */
		JButton btnSharp = new JButton("#");
		btnSharp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(49, "Low C Sharp");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		
		JButton button_18 = new JButton("#");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(46, "Low A Sharp");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_18.setVerticalAlignment(SwingConstants.BOTTOM);
		button_18.setBackground(Color.BLACK);
		button_18.setBounds(10, 24, 39, 116);
		frame.getContentPane().add(button_18);
		btnSharp.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSharp.setBackground(Color.BLACK);
		btnSharp.setBounds(116, 24, 39, 116);
		frame.getContentPane().add(btnSharp);
		
		JButton btnSharp_1 = new JButton("#");
		btnSharp_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(51, "Low D Sharp");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		btnSharp_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSharp_1.setBackground(Color.BLACK);
		btnSharp_1.setBounds(180, 24, 39, 116);
		frame.getContentPane().add(btnSharp_1);
		
		JButton btnSharp_2 = new JButton("#");
		btnSharp_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(54, "Low F Sharp");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		btnSharp_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSharp_2.setBackground(Color.BLACK);
		btnSharp_2.setBounds(290, 24, 39, 116);
		frame.getContentPane().add(btnSharp_2);
		
		JButton btnSharp_3 = new JButton("#");
		btnSharp_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(56, "Low G Sharp");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		btnSharp_3.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSharp_3.setBackground(Color.BLACK);
		btnSharp_3.setBounds(350, 24, 39, 116);
		frame.getContentPane().add(btnSharp_3);
		
		JButton btnSharp_4 = new JButton("#");
		btnSharp_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(58, "Middle A Sharp");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		btnSharp_4.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSharp_4.setBackground(Color.BLACK);
		btnSharp_4.setBounds(414, 24, 39, 116);
		frame.getContentPane().add(btnSharp_4);
		
		JButton btnSharp_5 = new JButton("#");
		btnSharp_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(61, "Middle C Sharp");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		btnSharp_5.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSharp_5.setBackground(Color.BLACK);
		btnSharp_5.setBounds(529, 24, 39, 116);
		frame.getContentPane().add(btnSharp_5);
		
		JButton btnSharp_6 = new JButton("#");
		btnSharp_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(63, "Middle D Sharp");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		btnSharp_6.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSharp_6.setBackground(Color.BLACK);
		btnSharp_6.setBounds(590, 24, 39, 116);
		frame.getContentPane().add(btnSharp_6);
		
		JButton btnSharp_7 = new JButton("#");
		btnSharp_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(66, "Middle F Sharp");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		btnSharp_7.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSharp_7.setBackground(Color.BLACK);
		btnSharp_7.setBounds(705, 24, 39, 116);
		frame.getContentPane().add(btnSharp_7);
		
		JButton btnSharp_8 = new JButton("#");
		btnSharp_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(68, "Middle G Sharp");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		btnSharp_8.setVerticalAlignment(SwingConstants.BOTTOM);
		btnSharp_8.setBackground(Color.BLACK);
		btnSharp_8.setBounds(765, 24, 39, 116);
		frame.getContentPane().add(btnSharp_8);
		
		JButton button_15 = new JButton("#");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(70, "High A Sharp");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_15.setVerticalAlignment(SwingConstants.BOTTOM);
		button_15.setBackground(Color.BLACK);
		button_15.setBounds(826, 24, 39, 116);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("#");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				key b = new key(73, "High C Sharp");
				if(electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playElectricPiano();// plays for electric piano
				}else if(steelDrum.isSelected() && !electricPiano.isSelected())
				{
					b.playSteelDrum();//plays but for steel drum
				}
				else if(!electricPiano.isSelected() && !steelDrum.isSelected())
				{
					b.playKey();//Plays the key created for this button
				}
				if(showStaff.isSelected())
				{
				JFrame note = new JFrame();
				ImageIcon icon = new ImageIcon(key.getNoteNumber()+".jpg");
				JLabel noteName = new JLabel(icon);
				note.add(noteName);
				note.pack();
				note.setVisible(true);
				}
			}
		});
		button_16.setVerticalAlignment(SwingConstants.BOTTOM);
		button_16.setBackground(Color.BLACK);
		button_16.setBounds(937, 24, 39, 116);
		frame.getContentPane().add(button_16);
	}

}