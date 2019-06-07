package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionUtilsNews {
	public static Connection getMyConnection() throws SQLException {
		String hostName = "localhost";
		String dbName 	= "aloalo";
		String userName = "root";
		String password = "4797";
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;
	}



}
