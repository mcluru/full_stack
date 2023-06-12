package com.lec.service;

import com.lec.domain.Member;

public interface MemberService {

	Member getMember(Member member);
	void insertMember(Member member);
	void insertAdmin(Member member);

}