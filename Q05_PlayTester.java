

//Class PlayListener is an action listener import javax.swing.JButton;
import javax.swing.JFrame;


//Complete the two missing import statements below:
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;


class PlayListener  implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		System.out.println("Play is selected");
	}
}


// Class PlayTester is a GUI to use PlayListener
public class Q05_PlayTester extends JFrame
{
	JButton bt;

	Q05_PlayTester()
	{
		JButton bt = new JButton("Start Play");
		add(bt);
		//Write your code here to install PlayListner
		//Write your code related to ‘Start Play’ button-click
		//event handled by the PlayListener

		//Missing lines of codes
		bt.addActionListener (new PlayListener ());
	}


	public static void main(String [] args)
	{
		Q05_PlayTester aGame = new Q05_PlayTester();
		aGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aGame.setSize(300, 300);
		aGame.setVisible(true);
	}
}
