package Run;

import java.sql.Connection;

import dbController.Conexion;
import dbController.SQLCheck;

public class run {
	
	public static void main(String[] args) {
		String string = "parque.db" ;
		Connection c = Conexion.openConnection();
		if(SQLCheck.checkDBExists(string,c)) {
			System.out.println("Existe");
		}else System.out.println("No existe");
	}
}
