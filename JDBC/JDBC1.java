import java.util.*;
import java.sql.*;
class Employee
{
           int eid,salary;
           String ename,add,department;
            void getInfo()
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Employee Info: ");
	System.out.println("Emp id: ");
	eid = s.nextInt();
	System.out.println("Emp Salary: ");
	salary = s.nextInt();
	System.out.println("Name: ");
	ename = s.next();
	System.out.println("Address: ");
	add = s.next();
	System.out.println("Department: ");
	department = s.next();
	}
            void showInfo()
	{
	System.out.println("Student info: ");
	System.out.println("Emp id: " +eid  );
	System.out.println("Salary: "+salary);
	System.out.println("Name: " +ename  );
	System.out.println("Address: "+add);
	System.out.println("Department: "+department);
	}
            void showInfo(int n)
	{
	System.out.println(eid +"  " +salary+" "+ ename +"  "+ add+" "+department );
	}

             void save()
	{
	try
	{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection c = DriverManager.getConnection("jdbc:odbc:myDD");
	Statement s = c.createStatement();
	String query = "insert into Employee values("+eid+","+salary+",'"+ename+"','"+add+"','"+department+"')";
	int n = s.executeUpdate(query);
	 n = s.executeUpdate(query);
	System.out.println("SUCCESS");
	}
	catch(Exception e)
	{
	System.out.println(""+e.getMessage());
	}
	}
}
class JDBC1
{
	public static void main(String str[])
	{
	Employee m = new Employee();
	m.getInfo();
	m.showInfo();
	m.save();
	}
}