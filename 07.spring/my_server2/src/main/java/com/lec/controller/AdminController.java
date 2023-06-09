package com.lec.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.lec.domain.Member;
import com.lec.service.MemberService;

@Controller
@SessionAttributes("loginss")
public class AdminController {
	
	@Autowired
	private SessionCheckAspect sessionCheckAspect;
	@Autowired
	private MemberService memberService;

	
	@GetMapping("/adminmain")
	public String adminMainCheck(SessionStatus status, HttpSession session) {
        return "redirect:admin_main";
    }

	@GetMapping("/admin_main")
	public String adminMain() {
		return "admin/admin_main";
	}
	
	@GetMapping("/admin_list")
	public String adminList() {
		return "admin/admin_list";
	}
	
	@GetMapping("/admin_join")
	public String insertAdminView() {
		return "admin/admin_join";
	}
	
	@PostMapping("/insert_admin")
	public String insertAdmin(Member member) {
		memberService.insertAdmin(member);
		return "redirect:admin_main";
	}
	
	@GetMapping("/member_list")
	public String memberList() {
		return "admin/member_list";
	}
	
	@GetMapping("/category_list")
	public String categoryList() {
		return "admin/category_list";
	}
	
	@GetMapping("/goods_list")
	public String goodsList() {
		return "admin/goods_list";
	}
	
	@GetMapping("/admin_logout")
	public String adminLogout(SessionStatus status) {
		status.setComplete();
		return "redirect:login_admin";
	}
	
}
