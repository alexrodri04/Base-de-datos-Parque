package dbController;

import java.sql.Connection;
import java.sql.ResultSet;

public class SQLCheck {
	
	public static boolean checkDBExists(String dbName, Connection c){

	    try {
	        Class.forName("org.sqlite.JDBC"); 

	        ResultSet resultSet = c.getMetaData().getCatalogs();

	        while (resultSet.next()) {
	        
	          String databaseName = resultSet.getString(1);
	          System.out.println(databaseName+ "Este es el nombre");
	            if(databaseName.equals(dbName)){
	                return true;
	            }
	        }
	        resultSet.close();

	    }
	    catch(Exception e){
	        e.printStackTrace();
	    }

	    return false;
	}
}
