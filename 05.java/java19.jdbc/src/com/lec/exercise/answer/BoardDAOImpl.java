package com.lec.exercise.answer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BoardDAOImpl implements BoardDAOService {
	
	private BoardVO inputBoard() {
		BoardVO board = new BoardVO();
		
		String member_id = JOptionPane.showInputDialog("아이디를 입력하세요");
		String member_pw = JOptionPane.showInputDialog("비밀번호를 입력하세요");
		String member_name = JOptionPane.showInputDialog("이름을 입력하세요");
		int member_age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));
		String member_gender = JOptionPane.showInputDialog("성별을 입력하세요");
		String member_email = JOptionPane.showInputDialog("이메일을 입력하세요");
		
		board.setMember_id(member_id);
		board.setMember_pw(member_pw);
		board.setMember_name(member_name);
		board.setMember_age(member_age);
		board.setMember_gender(member_gender);
		board.setMember_email(member_email);
		return board;
	}

	@Override
	public void createBoard() {
		BoardVO board = inputBoard();
		
		ConnectionFactory cf = new ConnectionFactory(); //getConnection메소드 사용을 위해 객체생성
		Connection conn = cf.getConnection(); //connection : DB와 연결하는 객체
		PreparedStatement pstmt = null;	//PreparedStatement : SQL구문 실행역할. 매개변수 set해줘야함
		String sql = cf.getInsert();	//insert쿼리문을 sql문자열변수에 담음
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getMember_id());
			pstmt.setString(2, board.getMember_pw());
			pstmt.setString(3, board.getMember_name());
			pstmt.setInt(4, board.getMember_age());
			pstmt.setString(5, board.getMember_gender());
			pstmt.setString(6, board.getMember_email());
			int row = pstmt.executeUpdate();
			System.out.println(row+"건이 성공적으로 등록되었습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
			}
		}
		
	}

	@Override
	public ArrayList<BoardVO> listBoard() {
		ArrayList<BoardVO> boardList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect()
				   + " where rownum between 1 and 10";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setMember_id(rs.getString("member_id"));
				board.setMember_pw(rs.getString("member_pw"));
				board.setMember_name(rs.getString("member_name"));
				board.setMember_age(rs.getInt("member_age"));
				board.setMember_gender(rs.getString("member_gender"));
				board.setMember_email(rs.getString("member_email"));
				
				boardList.add(board);
			}
		} catch (SQLException e) {
			System.out.println("게시글목록 조회 실패");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
			}
		}
		return boardList;
	}

	@Override
	public BoardVO viewBoard(String member_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBoard(String member_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(String member_id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<BoardVO> findByNameBoard(String member_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<BoardVO> findByEmailBoard(String member_email) {
		// TODO Auto-generated method stub
		return null;
	}

}
