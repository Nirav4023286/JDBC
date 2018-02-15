import javax.swing.*;
import java.awt.*;
class Registration extends JFrame
{
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	Registration()
	{
	 super("REGISTRATION");
	 setSize(300,200);
	 setLayout(new FlowLayout());
	 l1=new JLabel("FIRST NAME");
	 l2=new JLabel("LASTNAME");
	 l3=new JLabel("EMAIL");
	 l4=new JLabel("ADDRESS");
	 l5=new JLabel("CONTACTNO");
	 t1=new JTextField(20);
	 t2=new JTextField(20);
	 t3=new JTextField(20);
	 t4=new JTextField(20);
	 t5=new JTextField(20);
	 b1=new JButton("REGISTER");
	 b2=new JButton("RESET");
	 add(l1);
	 add(t1);
	 add(l2);
	 add(t2);
	 add(l3);
	 add(t3);
	 add(l4);
	 add(t4);
	 add(l5);
	 add(t5);
	 add(b1);
	 add(b2);
	}
}
class Awt2
{
	public static void main(String args[])
	{
	 Registration r=new Registration();
	 r.setVisible(true);
	}
}