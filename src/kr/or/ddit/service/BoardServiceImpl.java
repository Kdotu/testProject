package kr.or.ddit.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.dao.BoardDAOImpl;
import kr.or.ddit.vo.BoardVO;

public class BoardServiceImpl implements IBoardService {

	private static BoardServiceImpl service;
	private BoardDAOImpl dao;
	private BoardServiceImpl() { dao = BoardDAOImpl.getInstnace();}
	public static BoardServiceImpl getInstance() {
		if(service == null) service = new BoardServiceImpl();
		return service;
	}
	
	public List<BoardVO> boardSelect(){
		return dao.boardSelect();
	}
	
	public int boardInsert(BoardVO bvo) {
		return dao.boardInsert(bvo);
	}
	
	public int boardUpdate(Map<String,Object> map) {
		return dao.boardUpdate(map);
	}
	
	public int boardDelete(int bono) {
		
		return dao.boardDelete(bono);
	}
	

	
	
	
	
	
	
}
