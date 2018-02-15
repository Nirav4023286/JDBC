	import java.util.*;
	import java.sql.*;
	class Student
	{
		int rollno;
		String name,contactno,address;

		void get()
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter student info: ");
			System.out.println("RollNo: ");
			rollno = s.nextInt();
			System.out.println("Name: ");
			name = s.next();
			System.out.println("Address: ");
			address = s.next();
			System.out.println("ContactNo: ");
			contactno = s.next();
		}
		void show()
		{
			System.out.println("Student info: ");
			System.out.println("RollNo: " + rollno  );
			System.out.println("Name: " + name  );
			System.out.println("Address: "+ address  );
			System.out.println("ContactNo: " +contactno );
		}
		void show(int n)
		{
			System.out.println( rollno +" | " + name +" | "+ address +" | "  +contactno );
		}

		void save()
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection c = DriverManager.getConnection("jdbc:odbc:myDS");
				Statement s = c.createStatement();
				String query = "insert into Student values("+rollno+",'"+name+"','"+address+"','"+contactno+"')";
				int n = s.executeUpdate(query);
				 n = s.executeUpdate(query);
				System.out.println("SUCCESS");
			}
			catch(Exception e)
			{
			}
		}

	}

	class JDBC
	{
		public static void main(String str[])
		{
			Student s = new Student();
			s.get();
			s.show();
			s.save();
		}
	}