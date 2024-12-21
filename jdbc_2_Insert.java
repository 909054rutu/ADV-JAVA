import java.sql.*;
import java.util.*;
public class jdbc_2_Insert
{
public static void main(String args[])throws Exception
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
Statement st=con.createStatement();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Roll No");
int rno=sc.nextInt();
System.out.println("Enter Name");
String name=sc.next();
System.out.println("Enter per");
float per=sc.nextFloat();
int k=st.executeUpdate("insert into student values("+rno+",'"+name+"',"+per+")");
if(k>=1)
System.out.println("Record inserted");
st.close();
con.close();
}
}