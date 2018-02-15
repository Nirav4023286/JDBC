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
	   Connection c=DriverManager.getConnection("jdbc:odbc:myDD");
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
	   Connection c=DriverManager.getConnection("jdbc:odbc:myDD");
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
	   Connection c=DriverManager.getConnection("jdbc:odbc:myDD");
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
class JDBC3
{
	  public static void main(String args[])
	{
	 int ch;
	 Employee b =new Employee();
	do
	{
	  Scanner s= new Scanner(System.in);
	  System.out.println("Employee Record");
	  System.out.println("\n1.Add a record\n2.show records\n3.Show all EMployee\n4.show By Department\n5.Exit");	 
	  System.out.println("Enter the choice: ");
	  ch=s.nextInt();
	switch(ch)
	{
	 case 1:System.out.println("Adding Record");
		b.getInfo();
		break;
	 case 2:System.out.println("Showing record");
		b.showInfo();
		b.save();
		break;
	 case 3:b.showAllEmployee();
		break;
	 case 4:System.out.println("Showing By Department");
		b.Department();
   	 	break;
	 case 5:break;
	 default:System.out.println("Invalid choice");
	}
       }while(ch!=5);
      }
     }