package com.lec.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.lec.domain.Member;
import com.lec.domain.PageInfo;
import com.lec.service.AdminService;
import com.lec.service.MemberService;

@Controller
@SessionAttributes({"loginss", "pageInfo"})
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

	
	@GetMapping("/admin_join")
	public String insertAdminView() {
		return "admin/admin_join";
	}
	
	@PostMapping("/insert_admin")
	public String insertAdmin(Member member) {
		memberService.insertAdmin(member);
		return "redirect:admin_main";
	}
	
	
	
	@RequestMapping("/member_list")
	public String memberList(Model model,
						@RequestParam(defaultValue = "0") int page,
						@RequestParam(defaultValue = "10") int pageSize,
						@RequestParam(defaultValue="id") String searchType,
						@RequestParam(defaultValue="") String searchWord) {
		
		Pageable pageable = PageRequest.of(page, pageSize, Sort.by("id").descending());
		Page<Member> pageResult = memberService.getMemberList(pageable, searchType, searchWord);
		
		
		List<Member> memberList = pageResult.getContent();
		
		for (Member member : memberList) {
		    System.out.println(member.toString());
		}
		
		int resultTotalCnt = pageResult.getNumberOfElements();
		
		System.out.println(resultTotalCnt);
		
		PageInfo pageInfo = new PageInfo((int)pageResult.getTotalElements(), page, pageSize, searchType, searchWord);
		
		model.addAttribute("pageable", pageable);		// 쿼리문 실행 전 페이징 정보
		model.addAttribute("pageInfo", pageInfo);		// 쿼리문 실행 후 페이징 정보
		model.addAttribute("pageResult", pageResult);	// 페이징 처리된 데이터
		
		model.addAttribute("pg", page);
		model.addAttribute("bp", pageInfo.getBeginPage());
		model.addAttribute("ep", pageInfo.getEndPage());
		model.addAttribute("ns", pageInfo.getNaviSize());
		model.addAttribute("ps", pageSize);
		model.addAttribute("tp", pageInfo.getTotalPage());
		model.addAttribute("st", searchType);
		model.addAttribute("sw", searchWord);	
		
		return "admin/member_list";
	}
	
	
	@RequestMapping("/admin_list")
	public String adminList(Model model,
						@RequestParam(defaultValue = "0") int page,
						@RequestParam(defaultValue = "10") int pageSize,
						@RequestParam(defaultValue="id") String searchType,
						@RequestParam(defaultValue="") String searchWord) {
		
		Pageable pageable = PageRequest.of(page, pageSize, Sort.by("id").descending());
		Page<Member> pageResult = memberService.getAdminList(pageable, searchType, searchWord);
		
		
		List<Member> memberList = pageResult.getContent();
		
		for (Member member : memberList) {
		    System.out.println(member.toString());
		}
		
		int resultTotalCnt = pageResult.getNumberOfElements();
		
		System.out.println(resultTotalCnt);
		
		PageInfo pageInfo = new PageInfo((int)pageResult.getTotalElements(), page, pageSize, searchType, searchWord);
		
		model.addAttribute("pageable", pageable);		// 쿼리문 실행 전 페이징 정보
		model.addAttribute("pageInfo", pageInfo);		// 쿼리문 실행 후 페이징 정보
		model.addAttribute("pageResult", pageResult);	// 페이징 처리된 데이터
		
		model.addAttribute("pg", page);
		model.addAttribute("bp", pageInfo.getBeginPage());
		model.addAttribute("ep", pageInfo.getEndPage());
		model.addAttribute("ns", pageInfo.getNaviSize());
		model.addAttribute("ps", pageSize);
		model.addAttribute("tp", pageInfo.getTotalPage());
		model.addAttribute("st", searchType);
		model.addAttribute("sw", searchWord);	
		
		return "admin/admin_list";
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
