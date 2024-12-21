import java.sql.*;
import java.util.*;
public class jdbc_4_Update
{
public static void main(String arsg[])throws Exception
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
Statement st=con.createStatement();
Scanner sc=new Scanner(System.in);
System.out.println("Enter student rno");
int no=sc.nextInt();
System.out.println("Enter student name");
String name=sc.next();
int k=st.executeUpdate("update student set sname='"+name+"' where rno="+no);
if(k>=1)
System.out.println("Update suc");
st.close();
con.close();
}
}