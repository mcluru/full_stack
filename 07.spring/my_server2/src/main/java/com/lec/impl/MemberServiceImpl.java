package com.lec.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lec.domain.Member;
import com.lec.persistence.MemberRepository;
import com.lec.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberRepository memberRepo;
	
	@Override
	public Member getMember(Member member) {
		Optional<Member> findMember = memberRepo.findById(member.getId());
		if(findMember.isPresent()) return findMember.get();
		else return null;
	}

	@Override
	public void insertMember(Member member) {
		member.setRole("USER");
		memberRepo.save(member);
	}

	@Override
	public void insertAdmin(Member member) {
		member.setCell("-");
        member.setRole("ADMIN");
		memberRepo.save(member);
	}

}
