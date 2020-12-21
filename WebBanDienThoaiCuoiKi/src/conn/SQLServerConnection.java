package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnection {
	public static Connection initializeDatabase()
		throws SQLException, ClassNotFoundException
	{
		String dbDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL ="jdbc:sqlserver://localhost:1433";
		String dbName ="BanDienThoai";
		String dbUsername ="dinhkhang";
		String dbPassword ="khang";
		String connectionURL = dbURL + ";databaseName=" + dbName;
		Connection conn = null;
		try {
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(connectionURL,dbUsername, dbPassword);
			System.out.println("connection successfully");
		}
		catch(Exception ex){
			System.out.println("connection failure");
			ex.printStackTrace();
		}
		return conn;
	}
}
