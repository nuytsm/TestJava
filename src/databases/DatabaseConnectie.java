package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import swing.ArtistList;

public class DatabaseConnectie {
	
	public static void main(String[] args) throws SQLException {
		
		
		
		
	}
	
	public List<String> getArtists(){
				//1 verbinding leggen met database
				Connection con;
				try {
					con = DriverManager.
							getConnection("jdbc:sqlite:\\\\IONAD1\\FolderRedirectionLeerkrachten$\\mnuyts\\Application Data\\DBeaverData\\workspace6\\.metadata\\sample-database-sqlite-1\\Chinook.db");
					//2 een sql query uitvoeren
					
					Statement statement = con.createStatement();
					statement.execute("SELECT * FROM ARTIST");
					
					//3 resultaat van de sql query opvragen
					ResultSet resultSet = statement.getResultSet();
					
					//4 resultaat van de sql query tonen
					List<String> artistList = new ArrayList<>();
					
					while (resultSet.next()) {
						artistList.add(resultSet.getString("name"));
					}    
					return artistList;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return new ArrayList<String>(0);
				
	}

}
