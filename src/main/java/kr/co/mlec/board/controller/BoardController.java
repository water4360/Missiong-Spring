package kr.co.mlec.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
//		return "board/list";
		return "board/list2";
	}
	
	@GetMapping("/board/detail")
	public String detail(HttpServletRequest request, @RequestParam("no") int no) {
//		System.out.println("넘어오는 번호 : " + no);
		
		//no번에 해당하는 게시글 조회
		BoardVO vo = boardService.getOneBoard(no);
		request.setAttribute("board", vo);
		return "board/detail";
	}
	
	/**
	 * URL에 바로 게시글넘버를 추가해서 조회하는 경우.
	 * path의 {no}로 들어오는 값(패스변수)을 boardNo로 받겠다는 뜻.
	 * 그러고보니 void네?
	 * 요청url과 리턴할 jsp값이 같은 경우에는 void 쓸 수 있음!!!
	 * 즉 요청url 자체가 주소가 되는 것임.
	 */
	@GetMapping("/board/{no}")
	public String detail2(@PathVariable("no") int boardNo, HttpServletRequest request) {
//		System.out.println("pathVariable로 들어오는 번호 : " + boardNo);
		//no번에 해당하는 게시글 조회
		BoardVO vo = boardService.getOneBoard(boardNo);
		request.setAttribute("board", vo);
		return "board/detail";
	}
	
	
	
	
}
