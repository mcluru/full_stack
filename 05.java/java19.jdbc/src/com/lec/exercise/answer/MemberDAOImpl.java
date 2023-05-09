package com.lec.exercise.answer;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MemberDAOImpl implements MemberDAOService {
	
	private MemberVO inputMember() {
		MemberVO member = new MemberVO();
		
		String member_id = JOptionPane.showInputDialog("아이디를 입력하세요");
		String member_pw = JOptionPane.showInputDialog("비밀번호를 입력하세요");
		String member_name = JOptionPane.showInputDialog("이름을 입력하세요");
		int member_age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));
		String member_gender = JOptionPane.showInputDialog("성별을 입력하세요");
		String member_email = JOptionPane.showInputDialog("이메일을 입력하세요");
		
		member.setMember_id(member_id);
		member.setMember_pw(member_pw);
		member.setMember_name(member_name);
		member.setMember_age(member_age);
		member.setMember_gender(member_gender);
		member.setMember_email(member_email);
		return member;
	}

	@Override
	public void createMember() {
		MemberVO member = inputMember();
		
		ConnectionFactory cf = new ConnectionFactory(); //getConnection메소드 사용을 위해 객체생성
		Connection conn = cf.getConnection(); //connection : DB와 연결하는 객체
		PreparedStatement pstmt = null;	//PreparedStatement : SQL구문 실행역할. 매개변수 set해줘야함
		String sql = cf.getInsert();	//insert쿼리문을 sql문자열변수에 담음
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMember_id());
			pstmt.setString(2, member.getMember_pw());
			pstmt.setString(3, member.getMember_name());
			pstmt.setInt(4, member.getMember_age());
			pstmt.setString(5, member.getMember_gender());
			pstmt.setString(6, member.getMember_email());
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
	public ArrayList<MemberVO> listMember() {
		ArrayList<MemberVO> MemberList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVO member = new MemberVO();
				member.setMember_id(rs.getString("member_id"));
				member.setMember_pw(rs.getString("member_pw"));
				member.setMember_name(rs.getString("member_name"));
				member.setMember_age(rs.getInt("member_age"));
				member.setMember_gender(rs.getString("member_gender"));
				member.setMember_email(rs.getString("member_email"));
				
				MemberList.add(member);
			}
		} catch (SQLException e) {
			System.out.println("회원목록 조회 실패");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
			}
		}
		return MemberList;
	}

	@Override
	public MemberVO viewMember(String id) {
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect()
					+ " where member_id = '" + id + "'";
		MemberVO member = new MemberVO();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				member.setMember_id(id);
				member.setMember_pw(rs.getString("member_pw"));
				member.setMember_name(rs.getString("member_name"));
				member.setMember_age(rs.getInt("member_age"));
				member.setMember_gender(rs.getString("member_gender"));
				member.setMember_email(rs.getString("member_email"));
			} else {
				System.out.println("아이디(" + id + ") - 회원이 없습니다!!");
			}
		} catch (Exception e) {
			System.out.println("회원 조회 실패");
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
			}
		}
		return member;
	}

	@Override
	public void updateMember(String id) {
		MemberVO member = viewMember(id);
		
		String member_pw = JOptionPane.showInputDialog("비밀번호를 입력하세요!", member.getMember_pw());
		String member_name = JOptionPane.showInputDialog("이름을 입력하세요!", member.getMember_name());
		int member_age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요!", member.getMember_age()));
		String member_gender = JOptionPane.showInputDialog("성별을 입력하세요!", member.getMember_gender());
		String member_email = JOptionPane.showInputDialog("이메일을 입력하세요!", member.getMember_email());
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		String sql = cf.getUpdate();
		//update member set member_pw=?, member_name=?, member_age=?, member_gender=?, member_email=? where member_id=?
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member_pw);
			pstmt.setString(2, member_name);
			pstmt.setInt(3, member_age);
			pstmt.setString(4, member_gender);
			pstmt.setString(5, member_email);
			pstmt.setString(6, id);
			int row = pstmt.executeUpdate();			
			System.out.println("회원아이디(" + id + ") - 게시글이 성공적으로 수정되었습니다!!");
			
		} catch (Exception e) {
			System.out.println("업데이트 실패");
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
	public void deleteMember(String id) {
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		String sql = cf.getDelete();
		//delete from member where member_id=?
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			System.out.println("아이디(" + id + ") - 게시글이 성공적으로 삭제되었습니다!!");
			
		} catch (Exception e) {
			System.out.println("삭제 실패");
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
	public ArrayList<MemberVO> findByNameMember(String name) {

		ArrayList<MemberVO> memberList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect()
				   + " where member_name like '%" + name + "%'"
				   + " order by member_id desc";
		// select * from member where name like '%name%';
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVO member = new MemberVO();
				member.setMember_id(rs.getString("member_id"));
				member.setMember_pw(rs.getString("member_pw"));
				member.setMember_name(name);
				member.setMember_age(rs.getInt("member_age"));
				member.setMember_gender(rs.getString("member_gender"));
				member.setMember_email(rs.getString("member_email"));
				memberList.add(member);
			}
		} catch (Exception e) {
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
		return memberList;
	}

	@Override
	public ArrayList<MemberVO> findByEmailMember(String email) {

		ArrayList<MemberVO> memberList = new ArrayList<>();
		
		ConnectionFactory cf = new ConnectionFactory();
		Connection conn = cf.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = cf.getSelect()
				   + " where member_email like '%" + email + "%'"
				   + " order by member_id desc";
		//select * from member
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVO member = new MemberVO();
				member.setMember_id(rs.getString("member_id"));
				member.setMember_pw(rs.getString("member_pw"));
				member.setMember_name(rs.getString("member_name"));
				member.setMember_age(rs.getInt("member_age"));
				member.setMember_gender(rs.getString("member_gender"));
				member.setMember_email(email);
				memberList.add(member);
			}
		} catch (Exception e) {
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
		return memberList;
	}

}
