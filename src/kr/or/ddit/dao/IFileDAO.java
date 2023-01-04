package kr.or.ddit.dao;

import java.util.List;

import kr.or.ddit.vo.FileVO;

public interface IFileDAO {
	/**
	 * 파일 전체를 불러오는 메서드
	 * @return
	 */
	public List<FileVO> fileAllSelect();
	
	/**
	 * 파일 하나의 정보를 불러오는 메서드
	 * @param fileNo
	 * @return
	 */
	public FileVO fileOneSelect(int fileNo);
	
	/**
	 * 파일 하나를 등록하는 메서드
	 * @param fvo
	 * @return
	 */
	public int fileInsert(FileVO fvo);
	
	/**
	 * 파일 번호를 인수값으로 받아 파일을 삭제하는 메서드
	 * @param fileNo
	 * @return
	 */
	public int fileDelete(int fileNo);
}
