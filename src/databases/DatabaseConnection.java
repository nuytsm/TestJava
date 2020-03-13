package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.graalvm.compiler.api.replacements.Snippet.VarargsParameter;

public class DatabaseConnection {
	
	Connection con;
	
	public static void main(String a[]){
		DatabaseConnection dbc = new DatabaseConnection();
        
        try {
        	dbc.con = DriverManager.
                getConnection("jdbc:sqlite:\\\\IONAD1\\FolderRedirectionLeerkrachten$\\mnuyts\\Application Data\\DBeaverData\\workspace6\\.metadata\\sample-database-sqlite-1\\Chinook.db");
            
        	ResultSet variabeleresultset = dbc.executeStatement();
        	dbc.printResultSet(variabeleresultset);
        	
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	private void printResultSet(ResultSet resultset) throws SQLException {
		while (resultset.next()) {
			System.out.println(resultset.getString("name"));
		}
	}

	public ResultSet executeStatement() throws SQLException {
		Statement statement = con.createStatement();
		statement.execute("Select * from artist");
		return statement.getResultSet();
	}

}
