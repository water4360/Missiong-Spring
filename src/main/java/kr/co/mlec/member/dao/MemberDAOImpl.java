package kr.co.mlec.member.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.mlec.member.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Autowired
	private SqlSessionTemplate session;
	
	@Override
	public MemberVO login(MemberVO vo) {
		MemberVO user = session.selectOne("member.dao.MemberDAO.login", vo);
		return user;
	}
	
	

}
