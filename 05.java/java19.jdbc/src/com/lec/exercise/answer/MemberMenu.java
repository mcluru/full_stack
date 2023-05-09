package com.lec.exercise.answer;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MemberMenu {
	private double ver;
	
	public MemberMenu(double ver) {
		this.ver = ver;
	}
	
	public void mainMemberMenu() {
		MemberDAOImpl mbdao = MemberFactory.getInstance();
		
		while(true) {
			int menuNo = mainMenuUi();
			
			switch(menuNo) {
			case 1 :makeMember(mbdao); break;
			case 2 :listMember(mbdao); break;
			case 3 :contentView(mbdao); break;
			case 4 :updateMember(mbdao); break;
			case 5 :deleteMember(mbdao); break;
			case 6 :findByName(mbdao); break;
			case 7 :findByEmail(mbdao); break;
			case 0 :System.out.println("프로그램 종료"); System.exit(0);
			
			}
		}
	}
	
	private void findByEmail(MemberDAOImpl mbdao) {
		String email = JOptionPane.showInputDialog("검색할 이메일을 입력하세요");
		ArrayList<MemberVO> members = mbdao.findByEmailMember(email);
		System.out.println("==============================================================================================================");
		System.out.println("아이디\t\t비밀번호\t\t이름\t\t나이\t\t성별\t\t이메일");
		System.out.println("==============================================================================================================");
		for(MemberVO member:members) {
			System.out.println(member.toString());
		}
	}
	
	private void findByName(MemberDAOImpl mbdao) {
		String name = JOptionPane.showInputDialog("검색할 이름을 입력하세요");
		ArrayList<MemberVO> members = mbdao.findByNameMember(name);
		// select * from member where name like '%name%';
		System.out.println("==============================================================================================================");
		System.out.println("아이디\t\t비밀번호\t\t이름\t\t나이\t\t성별\t\t이메일");
		System.out.println("==============================================================================================================");
		for(MemberVO member:members) {
			System.out.println(member.toString());
		}
	}
	
	private void deleteMember(MemberDAOImpl mbdao) {
		String id = JOptionPane.showInputDialog("삭제할 아이디를 입력하세요");
		mbdao.deleteMember(id);
		// delete from member where member_id=?
	}
	
	private void updateMember(MemberDAOImpl mbdao) {
		String id = JOptionPane.showInputDialog("수정할 아이디를 입력하세요");
		mbdao.updateMember(id);
		// update member set member_pw=?,.... where member_id = id;
	}
	
	private void contentView(MemberDAOImpl mbdao) {
		String id = JOptionPane.showInputDialog("조회할 아이디를 입력하세요");
		if((id == null) || id.equals("")) return;
		else {
			MemberVO member = mbdao.viewMember(id);
			System.out.println("==============================================================================================================");
			System.out.println("아이디\t\t비밀번호\t\t이름\t\t나이\t\t성별\t\t이메일");
			System.out.println("==============================================================================================================");
			System.out.println(member.toString());
		}
		// select * from member where id = id;
	}
	
	private void listMember(MemberDAOImpl mbdao) {
		ArrayList<MemberVO> members = mbdao.listMember();
		System.out.println("==============================================================================================================");
		System.out.println("아이디\t\t비밀번호\t\t이름\t\t나이\t\t성별\t\t이메일");
		System.out.println("==============================================================================================================");
		
		for(MemberVO member:members) {
			System.out.println(member.toString());
		}
		System.out.println("--------- 게시글목록 출력 종료 --------\n\n");
	}
	
	
	
	
	private void makeMember(MemberDAOImpl mbdao) {
		mbdao.createMember();
	}
	
	private int mainMenuUi() {
		String menuNo = JOptionPane.showInputDialog(
			"===== 게시판관리 프로그램 V1.0 =====\n\n" + 
			"1. 신규회원등록\n" +
			"2. 전체회원조회\n" +
			"3. 회원상세조회\n" +
			"4. 회원정보수정\n" +
			"5. 회원정보삭제\n" +
			"6. 이름으로 검색\n" +
			"7. email로 검색\n" +
			"0. 종료\n\n" +
			"처리할 작업번호를 입력하세요"
			);
		if((menuNo == null) || (menuNo.equals(""))) {
			return 0;
		} else {
			return Integer.parseInt(menuNo);
		}
	}

}