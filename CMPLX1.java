import javax.swing.*;
import java.awt.event.*;
public class CMPLX1
{
  public static void main(String[] args)
  {
    // Making a new instance for JFrame, JButtons, JTextAreas
    JFrame fone=new JFrame("CMPLX1");
    JFrame ftwo=new JFrame("Like US!!!");
    JButton bone=new JButton("Click Me!");
    JButton btwo=new JButton("Don't Click Me!");
    JButton likeus=new JButton();
    JTextField first=new JTextField();
    JTextField second=new JTextField();
    JTextArea result=new JTextArea();
    // Setting default bounds for JButtons, JTextFields, and JTextAreas.
    bone.setBounds(20, 450, 150, 50);
    btwo.setBounds(20, 250, 130, 50);
    first.setBounds(20, 330, 300, 50);
    second.setBounds(20, 150, 300, 50);
    fone.add(bone); fone.add(btwo); fone.add(first); fone.add(second); fone.add(result);
    bone.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        first.setText("https://github.com/BrokeWebDeveloper and STAR all of my repository");
      }
    });
    btwo.addActionListener(new ActionListener()
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		ftwo.setSize(400, 300);
    		ftwo.setVisible(true);
    	}
    });
    fone.setSize(400, 300);
    fone.setLayout(null);
    fone.setVisible(true);
  }
}
