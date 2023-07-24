package kr.co.mlec.board.service;

import java.util.List;

import kr.co.mlec.board.vo.BoardVO;

/**
 * 주문현황
 * 상품테이블, 회원테이블 
 */

public interface BoardService {

	/**
	 * 전체 게시글 조회
	 */
	public List<BoardVO> getAllBoardList();
	
	/**
	 * 게시글 상세조회 
	 */
	public BoardVO getOneBoard(int no);
}
