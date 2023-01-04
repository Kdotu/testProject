package kr.or.ddit.service;

import java.util.List;

import kr.or.ddit.dao.FileDAOImpl;
import kr.or.ddit.vo.FileVO;

public class FileServiceImpl implements IFileService{
	private static FileServiceImpl service;
	private FileDAOImpl dao;
	private FileServiceImpl() {
		dao = FileDAOImpl.getInstance();
	}
	public static FileServiceImpl getInstance() {
		if(service == null) service = new FileServiceImpl();
		return service;
	}
	@Override
	public List<FileVO> fileAllSelect() {
		return dao.fileAllSelect();
	}
	@Override
	public FileVO fileOneSelect(int fileNo) {
		return dao.fileOneSelect(fileNo);
	}
	@Override
	public int fileInsert(FileVO fvo) {
		return dao.fileInsert(fvo);
	}
	@Override
	public int fileDelete(int fileNo) {
		return dao.fileDelete(fileNo);
	}
}
