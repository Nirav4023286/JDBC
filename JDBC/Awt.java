import javax.swing.*;
import java.awt.*;
class Awt
{
	public static void main(String args[])
	{
	 JFrame f = new JFrame("LOGIN FORM");
	 JLabel l1=new JLabel("USERNAME");
	 JLabel l2=new JLabel("PASSWORD");
	 JTextField t1=new JTextField(20);
	 JPasswordField t2=new JPasswordField(20);
	 JButton b1=new JButton("LOGIN");
	 JButton b2=new JButton("RESET");
	 f.setSize(300,200);
	 f.setLayout(new FlowLayout());
	 f.add(l1);
	 f.add(t1);
	 f.add(l2);
	 f.add(t2);
	 f.add(b1);
	 f.add(b2);
	 f.setVisible(true);
	}
}