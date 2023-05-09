package com.lec.exercise.answer;

public class MemberFactory {
	
	// 외부에서 생성금지
	private MemberFactory() {}
	private static MemberDAOImpl mbdao = null;
	
	public static MemberDAOImpl getInstance() {
		if(mbdao == null) mbdao = new MemberDAOImpl();
		return mbdao;
	}
}
