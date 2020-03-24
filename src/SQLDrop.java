import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class SQLDrop {
	
	public static void main(String args[]) {
		try {
			//open db connection
			Class.forName("org.sqlite.jdbc");
			Connection c =DriverManager.getConnection("jdb:sqlite:./db/company.db");
			c.createStatement().execute("Pragma foreign_keys=ON");
			System.out.println("Database connection openned");
			
			//Drop tables: begin
			Statement stmt1 = c.createStatement();
			String sql1 = "Drop table Clientes" ;
			stmt1.executeUpdate(sql1);
			stmt1.close();
			Statement stmt2 = c.createStatement();
			String sql2 = "Drop table Zonas" ;
			stmt2.executeUpdate(sql2);
			stmt2.close();
			Statement stmt3 = c.createStatement();
			String sql3 = "Drop table Atracciones" ;
			stmt3.executeUpdate(sql3);
			stmt3.close();
			Statement stmt4 = c.createStatement();
			String sql4 = "Drop table Cargos" ;
			stmt4.executeUpdate(sql4);
			stmt4.close();
			Statement stmt5 = c.createStatement();
			String sql5 = "Drop table Puestos" ;
			stmt5.executeUpdate(sql5);
			stmt5.close();
			Statement stmt6 = c.createStatement();
			String sql6 = "Drop table Empleados" ;
			stmt6.executeUpdate(sql6);
			stmt6.close();
			Statement stmt7 = c.createStatement();
			String sql7 = "Drop table Ofertas" ;
			stmt7.executeUpdate(sql7);
			stmt7.close();
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
