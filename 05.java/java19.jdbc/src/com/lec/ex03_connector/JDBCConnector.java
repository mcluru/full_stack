package com.lec.ex03_connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnector {

	public static Connection getConnection() {
		
		String DRV = "oracle.jdbc.OracleDriver";
		String URL = "jdbc:oracle:thin:@localhost:1521:xe";	//oracle connection정보
		String USR = "scott";
		String PWD = "tiger";
		
		try {
			Class.forName(DRV);
			return DriverManager.getConnection(URL, USR, PWD);
		} catch (Exception e) {
			return null;
		}
	}

	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		
		try {
			if(rs != null) rs.close();
			if(stmt != null) rs.close();
			if(conn != null) rs.close();
		} catch (Exception e) {
		}
	}
	
}
