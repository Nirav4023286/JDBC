import javax.swing.*;
import java.awt.*;
class Awt1
{
	public static void main(String args[])
	{
	 JFrame f = new JFrame("REGISTRATION FORM");
	 JLabel l1=new JLabel("FIRST NAME");
	 JLabel l2=new JLabel("LASTNAME");
	 JLabel l3=new JLabel("EMAIL");
	 JLabel l4=new JLabel("ADDRESS");
	 JLabel l5=new JLabel("CONTACTNO");
	 JTextField t1=new JTextField(20);
	 JTextField t2=new JTextField(20);
	 JTextField t3=new JTextField(20);
	 JTextField t4=new JTextField(20);
	 JTextField t5=new JTextField(20);
	 JButton b1=new JButton("REGISTER");
	 JButton b2=new JButton("RESET");
	 f.setSize(300,200);
	 f.setLayout(new FlowLayout());
	 f.add(l1);
	 f.add(t1);
	 f.add(l2);
	 f.add(t2);
	 f.add(l3);
	 f.add(t3);
	 f.add(l4);
	 f.add(t4);
	 f.add(l5);
	 f.add(t5);
	 f.add(b1);
	 f.add(b2);
	 f.setVisible(true);
	}
}