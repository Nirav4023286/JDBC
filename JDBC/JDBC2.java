import java.util.*;
import java.sql.*;
class Employee
{
	int eid;
	String ename,salary,department;
	void getInfo()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Employee info: ");
	System.out.println("enter eid: ");
	eid=s.nextInt();	
	System.out.println("enter emp name: ");
	ename=s.next();
	System.out.println("enter emp salary: ");
	salary=s.next();
	System.out.println("Enter the department: ");
	department=s.next();
	}
	void showInfo()
	{
		System.out.println("Employee id: "+eid);
		System.out.println("Employee name: "+ename);
		System.out.println("employee salary: "+salary);
		System.out.println("Department: "+department);
	}
	void showInfo(int n)
	{
		System.out.println(eid+" | "+ename+ " | "+salary+" | "+department);
	}
	void save()
	{
	  try
	  {
	   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   Connection c=DriverManager.getConnection("jdbc:odbc:MyDU");
	   Statement s=c.createStatement();
	   String query="insert into Employee values("+eid+",'"+ename+"','"+salary+"','"+department+"')";
	   int n=s.executeUpdate(query);
	   n=s.executeUpdate(query);
                     System.out.println("SUCCESS");
	   }
	   catch(Exception e)
	   {}
	}
	void showAllEmployee()
	{
	       try
	{
	           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   Connection c=DriverManager.getConnection("jdbc:odbc:MyDU");
	   Statement s=c.createStatement();
	   String query="select * from Employee";
 	   ResultSet rs =s.executeQuery(query);
	    while(rs.next())
	    {
	      int eid=rs.getInt(1);
	      String nm=rs.getString(2);
	      String sal=rs.getString(3);
	      String dep=rs.getString(4);
	     System.out.println(eid+ " | " +nm+ " | "+sal+" |"+dep);
	     }
	     System.out.println("SUCCESS");
	    }
	   catch(Exception e)
	   {}
	}
	void Department()
	{
	Scanner w =new Scanner(System.in);
	  System.out.println("Enter the department: ");
	department=w.next();
	  try
	{
	           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	   Connection c=DriverManager.getConnection("jdbc:odbc:myDU");
	   Statement s=c.createStatement();
	   String query="select * from Employee where department='"+department+"'";
 	   ResultSet rs =s.executeQuery(query);
	    while(rs.next())
	    {
	      int eid=rs.getInt(1);
	      String nm=rs.getString(2);
	      String sal=rs.getString(3);
	      String depa=rs.getString(4);
	     System.out.println(eid+ " | " +nm+ " | "+sal+ " | "+depa);
	     }
	     System.out.println("SUCCESS");
	    }
	   catch(Exception e)
	   {}
	}
	}
class JDBC2
{
	  public static void main(String args[])
	{
 	 Employee l=new Employee();
	 l.getInfo();
	 l.showInfo();
	 l.save();
	 l.showAllEmployee();
	 l.Department();
	}	
}    	 