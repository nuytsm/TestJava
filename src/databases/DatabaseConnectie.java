package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectie {
	
	public static void main(String[] args) throws SQLException {
		//1 verbinding leggen met database
		
		Connection con = DriverManager.
                getConnection("jdbc:sqlite:\\\\IONAD1\\FolderRedirectionLeerkrachten$\\mnuyts\\Application Data\\DBeaverData\\workspace6\\.metadata\\sample-database-sqlite-1\\Chinook.db");
		
		//2 een sql query uitvoeren
		
		Statement statement = con.createStatement();
		statement.execute("SELECT * FROM ARTIST");
		
		//3 resultaat van de sql query opvragen
		ResultSet resultSet = statement.getResultSet();
		
		//4 resultaat van de sql query tonen
		while (resultSet.next()) {
			System.out.println(resultSet.getString("name"));
		}       
		
		
	}

}
