package kr.co.mlec.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO dao;
	
	@Override
	public List<BoardVO> getAllBoardList() {
		List<BoardVO> list = dao.selectAllBoard();
		return list;
	}

	@Override
	public BoardVO getOneBoard(int no) {
		BoardVO vo = dao.selectBoardByNo(no);
		return vo;
	}

	@Override
	public void addBoard(BoardVO vo) {
		dao.insertBoard(vo);
	}

}
