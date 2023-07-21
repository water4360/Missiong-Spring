package kr.co.mlec.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.vo.BoardVO;

@Controller //얘가 없으면 스프링 컨테이너가 해석할 수 없음
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	//index.jsp에서 a링크로 받은 board 처리!
	@GetMapping("/board")
	public String list(HttpServletRequest request) {
		 // 공유영역 4가지 중 주요 영역 2가지
		 // request, session
		List<BoardVO> list = boardService.getAllBoardList();
		request.setAttribute("boardList", list);
		return "board/list";
	}
	
	@GetMapping("/board/detail")
	public String detail(HttpServletRequest request, @RequestParam("no") int no) {
//		System.out.println("넘어오는 번호 : " + no);
		
		//no번에 해당하는 게시글 조회
		BoardVO vo = boardService.getOneBoard(no);
		request.setAttribute("board", vo);
		return "board/detail";
	}
}
