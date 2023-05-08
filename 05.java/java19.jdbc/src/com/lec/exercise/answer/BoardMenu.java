package com.lec.exercise.answer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class BoardMenu {
	private double ver;
	
	public BoardMenu(double ver) {
		this.ver = ver;
	}
	
	public void mainMenu() throws Exception {
			
		BoardDAOImpl bddao = BoardFactory.getInstance();
		
		while(true) {
			mainMenuText();
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			switch((char)br.read()) {
			case '1' :bddao.createBoard(); break;
			case '2' :bddao.listBoard(); break;
			case '3' :bddao.viewBoard(null); break;
			case '4' :bddao.updateBoard(null); break;
			case '5' :bddao.deleteBoard(null); break;
			case '6' :bddao.findByNameBoard(null); break;
			case '7' :bddao.findByEmailBoard(null); break;
			case '0' :System.out.println("프로그램 종료"); System.exit(0);
			
			}
		}
	}
	
	public void mainMenuText() {
		StringBuffer sb = new StringBuffer();
		sb.append("***** 게시판프로그램 V" + ver + "*****\n");
		sb.append("1. 신규회원등록\n");
		sb.append("2. 전체회원조회\n");
		sb.append("3. 회원상세조회\n");
		sb.append("4. 회원정보수정\n");
		sb.append("5. 회원정보삭제\n");
		sb.append("6. 이름으로 검색\n");
		sb.append("7. email로 검색\n");
		sb.append("0. 종료\n");
		sb.append("=========================\n");
		sb.append("처리할 작업번호를 입력하세요");
		System.out.println(sb.toString());
	}
	
	public void mainBoardMenu() {
		BoardDAOImpl bddao = BoardFactory.getInstance();
		
		while(true) {
			int menuNo = mainMenuUi();
			
			switch(menuNo) {
			case 1 :makeBoard(bddao); break;
			case 2 :listBoard(bddao); break;
			case 3 :contentView(bddao); break;
			case 4 :updateBoard(bddao); break;
			case 5 :deleteBoard(bddao); break;
			case 6 :findByName(bddao); break;
			case 7 :findByEmail(bddao); break;
			case 0 :System.out.println("프로그램 종료"); System.exit(0);
			
			}
		}
	}
	
	private void findByName(BoardDAOImpl bddao) {
		
	}
	
	private void findByEmail(BoardDAOImpl bddao) {
		
	}
	
	private void deleteBoard(BoardDAOImpl bddao) {
		
	}
	
	private void updateBoard(BoardDAOImpl bddao) {
		
	}
	
	private void contentView(BoardDAOImpl bddao) {
		
	}
	
	private void listBoard(BoardDAOImpl bddao) {
		
	}
	
	
	
	
	private void makeBoard(BoardDAOImpl bddao) {
		bddao.createBoard();
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