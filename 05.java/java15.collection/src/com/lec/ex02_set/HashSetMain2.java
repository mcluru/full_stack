package com.lec.ex02_set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetMain2 {

	public static void main(String[] args) {
		
		Set<Member1> members = new HashSet<>();
		
		members.add(new Member1("손흥민", 31));
		members.add(new Member1("손흥민", 31));
		members.add(new Member1("손흥민", 20));
		members.add(new Member1("이강인", 23));
		System.out.println("총 객체수 = " + members.size());
		
		for(Member1 member:members) {
			System.out.println(member.toString() + ", " + member.hashCode());
		}
		
		
	}

}

class Member1 {
	String name;
	int age;
	
	public Member1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	// hashCode와 equals - eclipse의 자동완성
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member1 other = (Member1) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		// name과 age가 같은경우 동일객체로 판단해서 true리턴
//		// 아닐 경우 false가 되도록 equals메서드를 재정의
//		if(obj instanceof Member1) {
//			Member1 member = (Member1) obj;
//			return (member.name.equals(this.name) && (member.age == this.age));
//		}
//		return false;
//	}
	
	
	// hashCode와 equals - eclipse의 자동완성
	
	
	
	
	
}