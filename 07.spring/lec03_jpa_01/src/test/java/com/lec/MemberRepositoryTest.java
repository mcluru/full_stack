package com.lec;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lec.domain.Member;
import com.lec.persistence.MemberRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {
	
	@Autowired
	private MemberRepository memberRepo;
	
	
	@Test
	public void testInsertMember() {
		Member member = new Member();
		member.setId("hong");
		member.setPassword("12345");
		member.setName("홍길동");
		member.setEmail("hong@gamil.com");
		memberRepo.save(member);
	}
	
}
