package kr.co.mlec;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mlec.member.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/spring-mvc.xml"})
public class LoginTest {
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Test
	public void 로그인테스트() throws Exception {
		MemberVO vo = new MemberVO();
		vo.setId("admin");
		vo.setPassword("1234");
		
		MemberVO user = session.selectOne("member.dao.MemberDAO.login", vo);
		System.out.println("있는 user니? " + user==null);
	}

}
