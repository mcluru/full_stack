package com.lec.exercise.answer;

public class MemberVO {
	
	private String member_id;
	private String member_pw;
	private String member_name;
	private int member_age;
	private String member_gender;
	private String member_email;
	
	// 기본값으로 초기화하는 기본생성자
	public MemberVO() {
		this.member_id = null;
		this.member_pw = null;
		this.member_name = null;
		this.member_age = 0;
		this.member_gender = null;
		this.member_email = null;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public int getMember_age() {
		return member_age;
	}

	public void setMember_age(int member_age) {
		this.member_age = member_age;
	}

	public String getMember_gender() {
		return member_gender;
	}

	public void setMember_gender(String member_gender) {
		this.member_gender = member_gender;
	}

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}

	@Override
	public String toString() {
		return member_id + "\t\t" + member_pw + "\t\t" + member_name
				+ "\t\t" + member_age + "\t\t" + member_gender + "\t\t" + member_email;
	}
	
	
	
}
