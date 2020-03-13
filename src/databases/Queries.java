package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Queries {
	
	Connection con;

	public static void main(String a[]) {

		try {
			Queries queries = new Queries();
			queries.con = DriverManager.getConnection(
					"jdbc:sqlite:\\\\IONAD1\\FolderRedirectionLeerkrachten$\\mnuyts\\Application Data\\DBeaverData\\workspace6\\.metadata\\sample-database-sqlite-1\\Chinook.db");
			queries.createSelectQuery();
			queries.createInsertQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createSelectQuery() throws SQLException {
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM Artist WHERE name LIKE ? ");
		List<String> searchforName = searchforName(ps, "Iron Maiden");
		System.out.println(searchforName);
	}

	private List<String> searchforName(PreparedStatement ps, String name) throws SQLException {
		List<String> artists = new ArrayList<String>();
		ps.setString(1, "%"+ name + "%");
		ps.execute();
		ResultSet resultset = ps.getResultSet();
		while (resultset.next()) {
			artists.add(resultset.getString("name"));
		}
		return artists;
	}
	
	private void createInsertQuery() throws SQLException {
		PreparedStatement ps = con.prepareStatement("INSERT INTO Artist(name) VALUES(?)");
		ps.setString(1, "Motorhead");
		ps.execute();
	}

}
