package com.lec.exercise.answer;

import java.util.ArrayList;

public interface BoardDAOService {
	
	void createBoard(); 			// 1. 신규회원등록
	ArrayList<BoardVO> listBoard();	// 2. 전체회원조회
	BoardVO viewBoard(String member_id);		// 3. 회원상세조회
	void updateBoard(String member_id);		// 4. 회원정보수정
	void deleteBoard(String member_id);		// 5. 회원정보삭제

	ArrayList<BoardVO> findByNameBoard(String member_name);	// 6. 이름으로 검색
	ArrayList<BoardVO> findByEmailBoard(String member_email);	// 7. email로 검색
	
}
