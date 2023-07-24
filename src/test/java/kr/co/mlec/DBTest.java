package kr.co.mlec;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.vo.BoardVO;


//여기서의 classpath = src/main/resources
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/spring-mvc.xml"})
public class DBTest {

	@Autowired
	private DataSource ds;
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Autowired
	private BoardDAO boardDAO;
	
	@Autowired
	private BoardService boardService;
	
	
	@Ignore
	@Test
	public void dataSource테스트() throws Exception {
		assertNotNull(ds);
		System.out.println(ds);
	}
	
	@Ignore
	@Test
	public void sqlSession테스트() throws Exception {
		assertNotNull(session);
		System.out.println(session);
	}
	
	@Ignore
	@Test
	public void 전체게시글조회테스트() throws Exception {
		List<BoardVO> list = session.selectList("board.dao.BoardDAO.selectAllBoard");
		for(BoardVO vo : list) {
			System.out.println(vo);
		}
	}
	
	@Ignore
	@Test
	public void 전체게시글조회BoardDAO테스트() throws Exception {
		//BoardDAO가 스프링에서 잘 돌고 있는지 확인용.
		List<BoardVO> list = boardDAO.selectAllBoard();
		for(BoardVO vo : list) {
			System.out.println(vo);
		}
	}
	
	@Ignore
	@Test
	public void 서비스통해서전체게시글조회테스트() throws Exception {
		List<BoardVO> list = boardService.getAllBoardList();
		for(BoardVO vo : list) {
			System.out.println(vo);
		}
	}
	
	@Test
	public void 상세게시글조회테스트() throws Exception {
		BoardVO vo = boardService.getOneBoard(41);
		System.out.println(vo);
	}
}
