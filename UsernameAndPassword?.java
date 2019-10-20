import javax.swing.*;
public class UsernameAndPassword?
{
	public static void main(String[] args)
	{
		// Making a new instance of JFrame
		JFrame f=new JFrame("My First Java GUI Application!");
		// Making a new Instance of JButton
		JButton b=new JButton("Click Dong.");
		// Putting the default size and place of the button to the frame
		b.setBounds(400, 430, 100, 40);
		// Adding the JButton to the JFrame
		f.add(b);
		// Setting the default Frame size
		f.setSize(800, 700);
		// Set layout thingy
		f.setLayout(null);
		// Making the JFrame or/ Frame visible
		f.setVisible(true);
		// Making JTextField new instances
		JTextField tf=new JTextField("Username Pls??");
		JTextField tfd=new JTextField("Password Pls??");
		// Adding a boolean if the textfields are editable or not
		tfd.setEditable(true);
		tf.setEditable(true);
		// Placing the default place for the textfields
		tf.setBounds(400, 320, 100, 40);
		tfd.setBounds(400, 370, 100, 40);
		f.add(tfd);
		f.add(tf);
		// Printing a success message if there's no error
		System.out.println("Thanks for Downloading! now the program will load!");
	}
}
