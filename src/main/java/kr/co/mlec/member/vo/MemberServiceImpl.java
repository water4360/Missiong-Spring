package kr.co.mlec.member.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mlec.member.dao.MemberDAO;
import kr.co.mlec.member.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDAO memDao;
	
	@Override
	public MemberVO login(MemberVO vo) {
		return memDao.login(vo);
	}

	
	
}
