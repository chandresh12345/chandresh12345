package jsp;
qpackage jsp;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Zubakasriya {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:tiger/scott@localhost:1521:productDb");
			Statement stmt=(Statement) con.createStatement();
			ResultSet rs=((java.sql.Statement) stmt).executeQuery("select* from emp;");

			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);

		}
	}

}
