package kr.or.ddit.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.vo.BoardVO;

public interface IBoardService {
	/**
	 * 전체 게시글 목록 불러오기 
	 * @return
	 */
	public List<BoardVO> boardSelect();
	
	
	/**
	 *  게시글 등록하기
	 * @param bvo
	 * @return
	 */
	public int boardInsert(BoardVO bvo);
	
	/**
	 * 게시글 삭제하기
	 * @param map
	 * @return
	 */
	public int boardUpdate(Map<String,Object> map);
	
	/**
	 * 게시글 수정하기
	 * @param bono
	 * @return
	 */
	public int boardDelete(int bono);
	
	
}
