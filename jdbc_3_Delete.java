import java.sql.*;
import java.util.*;
public class jdbc_3_Delete
{
public static void main(String args[])throws Exception
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
Statement st=con.createStatement();
Scanner sc=new Scanner(System.in);
System.out.println("Enter student rno");
int no=sc.nextInt();
int k=st.executeUpdate("delete from student where rno="+no);
if(k>=1)
System.out.println("Record delete");
st.close();
con.close();
}
}