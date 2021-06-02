/*

A top left Panel is created which has a GridLayout (3r, 2c).
The A input and B input checkboxes and label are added to this.

A bottom left Panel is created which has a GridLayout (2r, 3c).
The AND, OR< etc radiobuttons are added to this.

A right Panel is created which has a GridLayout (1r, 1c).
The text area is added to this.

A south Panel is created which has a GridLayout (1r, 2c).
The buttons are added to this.


The main window has a BorderLayout.
A center Panel is created which has a GridLayout (1r, 2c).
A left  Panel is created which has a GridLayout (2r, 1c).

The panels are combined as follows:
left  Panel.add (top left Panel)
left  Panel.add (bottom left Panel)
center Panel.add (left  Panel)
center Panel.add (right  Panel)
main window.add (center Panel, Center)
main window.add (south Panel,  South)

Done !

*/

// Layout Managers
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

// Swing components
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;



public class Q04_SimpleSwingGUI extends JFrame
{
	// GUI Components:
	JCheckBox aInputCheckBox     = new JCheckBox ("A input");
	JCheckBox bInputCheckBox     = new JCheckBox ("B input");
	JLabel resultLabel           = new JLabel ("A AND B = false");

	ButtonGroup radioGroup       = new ButtonGroup ();
	JRadioButton andRadioButton  = new JRadioButton ("AND");
	JRadioButton orRadioButton   = new JRadioButton ("OR");
	JRadioButton notRadioButton  = new JRadioButton ("NOT");
	JRadioButton nandRadioButton = new JRadioButton ("NAND");
	JRadioButton norRadioButton  = new JRadioButton ("NOR");
	JRadioButton xorRadioButton  = new JRadioButton ("XOR");

	JTextArea truthTableTextArea = new JTextArea (10, 15);

	JButton defaultButton        = new JButton ("Default");
	JButton exitButton           = new JButton ("Exit");


	public Q04_SimpleSwingGUI ()
	{
		super ("Simple Swing GUI - Logic Gates 1 - by Mike O'Malley");

		JPanel topLeftPanel    = new JPanel (new GridLayout (3, 2, 1, 1));
		JPanel bottomLeftPanel = new JPanel (new GridLayout (2, 3, 1, 1));
		JPanel leftPanel       = new JPanel (new GridLayout (2, 1, 1, 1));
		JPanel rightPanel      = new JPanel ();
		JPanel centerPanel     = new JPanel (new GridLayout (1, 2, 1, 1));
		JPanel southPanel      = new JPanel (new GridLayout (1, 2, 1, 1));

		// topLeftPanel
		topLeftPanel.setBorder (new TitledBorder(new EtchedBorder(), "Gate interaction display"));

		resultLabel.setBorder (new TitledBorder(new EtchedBorder(), ""));

		topLeftPanel.add (aInputCheckBox);
		topLeftPanel.add (new JLabel (""));
		topLeftPanel.add (new JLabel (""));
		topLeftPanel.add (resultLabel);
		topLeftPanel.add (bInputCheckBox);
		topLeftPanel.add (new JLabel (""));

		// bottomLeftPanel
		bottomLeftPanel.setBorder (new TitledBorder(new EtchedBorder(), "Gate type"));

		bottomLeftPanel.add (andRadioButton);
		bottomLeftPanel.add (orRadioButton);
		bottomLeftPanel.add (notRadioButton);
		bottomLeftPanel.add (nandRadioButton);
		bottomLeftPanel.add (norRadioButton);
		bottomLeftPanel.add (xorRadioButton);

		radioGroup.add (andRadioButton);
		radioGroup.add (orRadioButton);
		radioGroup.add (notRadioButton);
		radioGroup.add (nandRadioButton);
		radioGroup.add (norRadioButton);
		radioGroup.add (xorRadioButton);

		// rightPanel
		rightPanel.setBorder (new TitledBorder(new EtchedBorder(), "Truth table"));
		rightPanel.add (truthTableTextArea);

		// southPanel
		southPanel.add (defaultButton);
		southPanel.add (exitButton);

		// Construct GUI from the panels created above.
		leftPanel.add (topLeftPanel);
		leftPanel.add (bottomLeftPanel);
		centerPanel.add (leftPanel);
		centerPanel.add (rightPanel);

		add (centerPanel, BorderLayout.CENTER);
		add (southPanel,  BorderLayout.SOUTH);

	}

	public static void main (String [] args)
	{
		Q04_SimpleSwingGUI myApp = new Q04_SimpleSwingGUI();

		myApp.setVisible (true);
      	myApp.setSize (450, 350);
      	myApp.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	}
}
