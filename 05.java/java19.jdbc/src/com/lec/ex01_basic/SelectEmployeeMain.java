package com.lec.ex01_basic;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectEmployeeMain {
	
	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";	//oracle connection정보
	final static String USR = "scott";
	final static String PWD = "tiger";
	
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) {
		// 실습. select empno, ename, job from emp;
		// 사원정보를 employee.html(table태그)출력파일로 저장
		// "src/com/lec/ex01_basie.employee.html"

		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);
			
			String sql = "select empno, ename, job from emp";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			Path path = Paths.get("src/com/lec/ex01_basic.employee.html");
			FileChannel fc = FileChannel.open(path, StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
			
			String data = "<table border=\"1\">\t";
			data += "<thead>\t";
			data += "<tr><td>사원번호</td><td>사원이름</td><td>직급</td></tr>\t";
			data += "</thead>\t";
			data += "<tbody>\t";
			
			while(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				
				data += "<tr>";
				data += "<td>";
				data += empno;
				data += "</td>";
				data += "<td>";
				data += ename;
				data += "</td>";
				data += "<td>";
				data += job;
				data += "</td>";
				data += "</tr>";
			}
			data += "</tbody>";
			data += "</table>";
			
			Charset cs = Charset.defaultCharset();
			ByteBuffer buffer = cs.encode(data);
			
			
			fc.write(buffer);
					
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB연결실패");
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// dummy
			}
		}
		
	}

}

// <table border="1">
// <thead>
// <tr><td>사원번호</td><td>사원이름</td><td>직급</td></tr>
// </thead>
// <tbody>
// </tbody>
// </table>