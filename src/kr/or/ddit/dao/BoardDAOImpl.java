package kr.or.ddit.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import config.SqlMapClientFactory;
import kr.or.ddit.vo.BoardVO;

public class BoardDAOImpl implements IBoardDAO {
	private static BoardDAOImpl dao;
	private SqlMapClient smc;
	private BoardDAOImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	public static BoardDAOImpl getInstnace() {
		if(dao == null) dao = new BoardDAOImpl();
		return dao;
	}
	@Override
	public List<BoardVO> boardSelect() {
		List<BoardVO> list = null;
		try {
			list = smc.queryForList("board.boardSelect");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public int boardInsert(BoardVO bvo) {
		int cnt = 0;
		try {
			Object obj = (Object)smc.insert("board.boardInsert", bvo);
			if(obj == null) cnt = 1;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	@Override
	public int boardUpdate(Map<String, Object> map) {
		int cnt = 0;
		try {
			cnt = smc.update("board.boardUpdate",map);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	@Override
	public int boardDelete(int bono) {
		int cnt = 0;
		try {
			cnt = smc.delete("board.boardDelete", bono);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
}
