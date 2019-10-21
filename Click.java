import javax.swing.*;
import java.awt.event.*;
public class Click
{
	public static void main(String[] args)
	{
		// Making new instances
		// Making a new JFrame instance
		JFrame f=new JFrame("Another Java Swing or GUI Application hueh...");
		// Making a new JButton instance
		JButton b=new JButton("Bored.");
		// Making a new instance of JTextField
		JTextField tf=new JTextField();
		// Setting where the JTextField should be
		tf.setBounds(200, 600, 100, 40);
		// Adding an action listener to the JButton
		b.addActionListener(new ActionListener()
				{
			       public void actionPerformed(ActionEvent e)
			       {
				       tf.setText("You Clicked The Button!");
			       }
				});
		// Setting the default place and size for the button
		b.setBounds(200, 530, 100, 40);
		// Adding the JButton to the frame
		f.add(b); f.add(tf);
		// Setting the default JFrame size
		f.setSize(300, 600);
		// Setting layout thingy
		f.setLayout(null);
		// Making the frame visible
		f.setVisible(true);
	}
}
