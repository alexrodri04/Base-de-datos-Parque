package test;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class SQLDr {
	
	public static void main(String args[]) {
		try {
			//open db connection
			Class.forName("org.sqlite.jdbc");
			Connection c =DriverManager.getConnection("jdb:sqlite:./db/company.db");
			c.createStatement().execute("Pragma foreign_keys=ON");
			System.out.println("Database connection openned");
			
			//Drop tables: begin
			Statement stmt1 = c.createStatement();
			String sql1 = "Drop table employees" ;
			stmt1.executeUpdate(sql1);
			stmt1.close();
			Statement stmt2 = c.createStatement();
			String sql2 = "Drop table departments" ;
			stmt2.executeUpdate(sql2);
			stmt2.close();
			Statement stmt3 = c.createStatement();
			String sql3 = "Drop table authors" ;
			stmt3.executeUpdate(sql3);
			stmt3.close();
			//...
			System.out.println("Tables removed");
			//Close DB connection
			c.close();
			System.out.println("DB connection closed");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
