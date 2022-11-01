package org.zerock.controller.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.board.BoardDto;
import org.zerock.domain.board.PageInfo;
import org.zerock.service.board.BoardService;

@Controller
@RequestMapping("board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	@GetMapping("register")
	public void register() {
		//게시물 작성 , 뷰로 포워드
	}
	
	@PostMapping("register")
	public String register(BoardDto board, RedirectAttributes rttr) {
		//req param 수집 / 가공
		
		//business logic -> service가 수행
		int cnt = service.register(board);
	
		if(cnt ==1) {
			rttr.addFlashAttribute("message", "새 게시물이 등록되었습니다.");
		}else {
			rttr.addFlashAttribute("message", "새 게시물이 등록되지 않았습니다.");
		}
		// /board/list로 redirect 원한다
		return "redirect:/board/list";
	}
	
	@GetMapping("list")
	public void list(@RequestParam(name = "page", defaultValue = "1")int page, PageInfo pageInfo, Model model) {
		// req param 수집 
		// business logic
		List<BoardDto> list = service.listBoard(page, pageInfo);
		
		// add attribute
		model.addAttribute("boardList",list);
		//forward
	}
	
	@GetMapping("get")
	public void get(@RequestParam(name = "id") int id,Model model) {
		//business logic(게시물 db에서 가져오기)
		BoardDto board = service.get(id);
		model.addAttribute("board",board);
		//forward
	}
	
	@GetMapping("modify")
	public void modify(int id, Model model) {
		BoardDto board = service.get(id);
		model.addAttribute("board",board);
	}
	
	@PostMapping("modify")
	public String modify(BoardDto board, RedirectAttributes rttr) {
		int cnt = service.update(board);
		
		if(cnt ==1)
			rttr.addFlashAttribute("message",board.getId()+ "번 id가 수정 되었습니다.");
		else
			rttr.addFlashAttribute("message",board.getId()+ "번 id가 수정 되지않았습니다.");
		
		return "redirect:/board/list";
	}
	
	@PostMapping("remove")
	public String remove(int id, RedirectAttributes rttr){
		int cnt = service.remove(id);
		
		if(cnt==1)
			rttr.addFlashAttribute("message", id+"번 게시물이 삭제되었습니다.");
		else
			rttr.addFlashAttribute("message", id+"번 게시물이 삭제되지 않았습니다.");
		return "redirect:/board/list";
	}
}
