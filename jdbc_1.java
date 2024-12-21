import java.sql.*;
public class jdbc_1{
public static void main(String args[])throws Exception
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("Jdbc:Odbc:CDJ");
Statement st=con.createStatement();
int k=st.executeUpdate("insert into student values(3,'krish',97)");
if(k>1)
System.out.println("Record Insert");
st.close();
con.close();
}
}