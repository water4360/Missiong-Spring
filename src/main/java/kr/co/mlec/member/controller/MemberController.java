package kr.co.mlec.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kr.co.mlec.member.service.MemberService;
import kr.co.mlec.member.vo.MemberVO;


@SessionAttributes("loginUser")
@Controller
public class MemberController {

	@Autowired
	private MemberService memService;

	@GetMapping("/login")
	public String loginForm() {
		return "/login/login";
	}

	@PostMapping("/login")
	public String login(MemberVO vo, Model model) {
		MemberVO user = memService.login(vo);

		if (user == null) {
			// 로그인 실패시 다시 로그인.
			return "login/login";
		}
		
		// 로그인 성공시 메인으로.
		model.addAttribute("loginUser", user);
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout(SessionStatus status) {
//		session.removeAttribute("loginUser"); //이렇게 단일 객체 삭제도 가능.
//		session.invalidate();
		status.setComplete();
		return "redirect:/";
	}

}
