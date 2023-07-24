package kr.co.mlec.member.dao;

import kr.co.mlec.member.vo.MemberVO;

/**
 * T_MEMBER(회원테이블) CRUD 목적.
 * 그러므로 상속받은 DAO의 어노테이션은 Repository여야 함.
 * @author User
 *
 */
public interface MemberDAO {
	
	/**
	 * id, password가 일치하는 회원 조회
	 * @param member id, password
	 * @return 조회된 회원데이터
	 */
	MemberVO login(MemberVO vo);

}
