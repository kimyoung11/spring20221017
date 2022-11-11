package org.zerock.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.board.BoardDto;
import org.zerock.domain.member.MemberDto;
import org.zerock.service.member.MemberService;

@Controller
@RequestMapping("member")
public class MemberController {

	@Autowired
	private MemberService service;
	
	@GetMapping("signup")
	public void signup() {
		
	}
	
	@PostMapping("signup")
	public String signup(@ModelAttribute MemberDto member, RedirectAttributes rttr) {
		System.out.println(member);
		
		int cnt = service.insert(member);

		rttr.addFlashAttribute("message1", "회원가입 되었습니다.");
		return "redirect:/board/list";
		
	}
	
	@GetMapping("list")
	public void list(Model model) {
		model.addAttribute("memberList",service.list());
	}
	
	@GetMapping({"info", "modify"}) 
	public void get(String id, Model model) {
		model.addAttribute("member",service.getById(id));
	}
	
	@PostMapping("modify")
	public String modify(MemberDto member, String oldPassword, RedirectAttributes rttr) {
		rttr.addAttribute("id", member.getId());
		
		if(member.getPassword().equals(oldPassword)) {
			int cnt = service.modify(member);
			
			if (cnt == 1) {
				rttr.addFlashAttribute("message", "회원 정보가 수정되었습니다.");
				return "redirect:/member/info";
			} else {
				rttr.addFlashAttribute("message", "회원 정보가 수정되지 않았습니다.");
				return "redirect:/member/modify";
			}

		}
		else {
			rttr.addFlashAttribute("message", "암호가 일치하지 않습니다.");
			return "redirect:/member/modify";
		}
		
	}
	
	@PostMapping("remove")
	public String remove(String id) {
		service.remove(id);
		return "redirect:/member/list";
	}
}


