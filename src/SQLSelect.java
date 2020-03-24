import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class SQLSelect {

	public static void main(String args[]) {
		try {
			//Open DB connection
			Class.forName("org.sqlite.JDBC");
			Connection c =DriverManager.getConnection("JDBC:sqlite:./db/parque.db");
			c.createStatement().execute("Pragma foreign_keys=ON");
			System.out.println("Database connection openned");
			
			//Select data
			Statement stmt = c.createStatement();
			String sql = "SELECT id,nombre,fecha_nacimiento FROM Clientes";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("Id");
				System.out.println(id);
				String nombre = rs.getString("Nombre");
				System.out.println(nombre);
				String fecha_nacimiento = rs.getString("Fecha_nacimiento");
				System.out.println(fecha_nacimiento);
			}
			//FALTA LA OBTENCION DE INFORMACION DE 2 TABLAS MAS
			rs.close();
			stmt.close();
			System.out.println("Busqueda Completada");
			//Close DB connection
			c.close();
			System.out.println("DB connection closed");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
