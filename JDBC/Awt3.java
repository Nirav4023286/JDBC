import javax.swing.*;
import java.awt.*;
class LoginForm extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	LoginForm()
	{
	 super("LOGIN FORM");
	 setSize(300,200);
	 setLayout(new FlowLayout());
	 l1=new JLabel("USERNAME");
	 l2=new JLabel("PASSWORD");
	 t1=new JTextField(20);
	 t2=new JPasswordField(20);
	 b1=new JButton("LOGIN");
	 b2=new JButton("RESET");
	 b1.addActionListener(this);
	 b2.addActionListener(this);
	 add(l1);
	 add(t1);
	 add(l2);
	 add(t2);
	 add(b1);
	 add(b2);
	}
	void Login()
	{
	 String s1=t1.getText();
	 String s2=t2.getText();
	 if(s1.equals("admin") && s2.equals("pass"))
	{
	 System.out.print("Valid");
	}
	else
	{
	 System.out.println("INVALID");
	}
	}
	void Reset()
	{
	 t1.setText(" ");
	 t2.setText(" ");
	}
	public void ActionPerformed(ActionEvent e)
	{
	 System.out.println(e);
	object obj=e.getSource();
	if(obj==b1)
	{
	 Login();
	}
	else
	{
	 Reset();
	}
       }
}
class Awt3
{
	public static void main(String args[])
	{
	 LoginForm f=new LoginForm();
	 f.setVisible(true);
	}
}