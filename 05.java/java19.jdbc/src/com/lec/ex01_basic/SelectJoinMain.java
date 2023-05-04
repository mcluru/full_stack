package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class SelectJoinMain {
	
	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";	//oracle connection정보
	final static String USR = "scott";
	final static String PWD = "tiger";
	
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

	public static void main(String[] args) {
		// 실습 JOptionPane으로 부서번호 입력받아서 부서명출력하기
		// select empno, ename, emp.deptno, dname
		//  from emp emp, dept dpt
		//  where emp.deptno = ?
		//   and emp.deptno = dpt.deptno;
		// 사원번호, 사원이름, 부서번호, 부서이름
		
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("부서번호를 입력하세요"));
		
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);
			
			String sql = "select empno, ename, emp.deptno, dname from emp emp, dept dpt where emp.deptno = ? and emp.deptno = dpt.deptno";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			System.out.println("사원번호   사원이름   부서번호   부서이름");
			System.out.println("=========================================");
			while(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				int deptno = rs.getInt(3);
				String dname = rs.getString(4);
				
				System.out.print(empno + "\t");
				System.out.print(ename + "\t");
				System.out.print(deptno + "\t");
				System.out.println(dname + "\t");
			}
			
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
