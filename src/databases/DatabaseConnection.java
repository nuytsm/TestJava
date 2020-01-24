package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	
	public static void main(String a[]){
        
        try {
        	Connection con = DriverManager.
                getConnection("jdbc:sqlite:\\\\IONAD1\\FolderRedirectionLeerkrachten$\\mnuyts\\Application Data\\DBeaverData\\workspace6\\.metadata\\sample-database-sqlite-1\\Chinook.db");
        	System.out.println(con.getMetaData().getURL());
            Statement stmt = con.createStatement();
            stmt.execute("SELECT * FROM Artist");
            ResultSet resultset = stmt.getResultSet();
            while (resultset.next()) {
            	System.out.println(resultset.getString("name"));
            }         
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
