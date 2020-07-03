package fmoonblue.spring.web.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import fmoonblue.spring.web.board.BoardVO;

@Repository
public class BoardDAOSpring {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private final String BOARD_INSERT =
			"insert into myboard(seq, title, writer, content) values(?, ?, ?, ?)";
//	private final String BOARD_INSERT = "insert into myboard(seq, title, writer, content) "
//			+ "values((select nvl(max(seq), 0)+1 from myboard), ?, ?, ?)";
	private final String BOARD_UPDATE = "update myboard set title=?, " + "content=? where seq=?";
	private final String BOARD_DELETE = "delete myboard where seq=?";
	private final String BOARD_GET = "select * from myboard where seq=?";
	private final String BOARD_LIST = "select * from myboard order by seq desc";

//	public void insertBoard(BoardVO vo) {
//		System.out.println("Spring JDBC로 insertBoard() 기능 처리");
//		jdbcTemplate.update(BOARD_INSERT, vo.getTitle(), vo.getWriter(), vo.getContent());
//	}
	public void insertBoard(BoardVO vo) {
		System.out.println("Spring JDBC로 insertBoard() 기능 처리"); 
		jdbcTemplate.update(BOARD_INSERT, vo.getSeq(), vo.getTitle(), vo.getWriter(), vo.getContent());
	}

	public void updateBoard(BoardVO vo) {
		System.out.println("Spring JDBC로 updateBoard() 기능 처리");
		jdbcTemplate.update(BOARD_UPDATE, vo.getTitle(), vo.getContent(), vo.getSeq());
	}

	public void deleteBoard(BoardVO vo) {
		System.out.println("Spring JDBC로 deleteBoard() 기능 처리");
		jdbcTemplate.update(BOARD_DELETE, vo.getSeq());
	}

	public BoardVO getBoard(BoardVO vo) {
		System.out.println("Spring JDBC로 getBoard() 기능 처리");
		Object[] args = { vo.getSeq() };
		return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("Spring JDBC로 getBoardList() 기능 처리");
		return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());

		/*
		 * 만약 BOardRowMapper 클래스를 미리 만들어 놓지않았다면 
		 * return jdbcTemplate.query(BOARD_LIST, enw ROWMAPER(){
		 * @Override
			public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				BoardVO board = new BoardVO();
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getDate("regdate"));
				board.setCnt(rs.getInt("cnt"));
				return board;
			}
			}
			을 작성해놔야함
		 */
	}
}
