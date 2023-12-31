package kr.co.mlec.reply.dao;

import java.util.List;

import kr.co.mlec.reply.vo.ReplyVO;

public interface ReplyDAO {
	
	/**
	 * 댓글등록
	 * @param vo
	 */
	void insertReply(ReplyVO vo);
	
	/**
	 * 해당 게시글의 전체 댓글 불러오기
	 * @param boardNo 게시물번호
	 * @return 전체댓글목록
	 */
	List<ReplyVO> selectAllReply(int boardNo);
}
