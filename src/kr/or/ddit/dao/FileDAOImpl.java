package kr.or.ddit.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import config.SqlMapClientFactory;
import kr.or.ddit.vo.FileVO;

public class FileDAOImpl implements IFileDAO{
	private static FileDAOImpl dao;
	private static SqlMapClient smc;
	private FileDAOImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	public static FileDAOImpl getInstance() {
		if(dao == null) dao = new FileDAOImpl();
		return dao;
	}
	@Override
	public List<FileVO> fileAllSelect() {
		List<FileVO> list = null;
		try {
			list = smc.queryForList("file.fileAllSelect");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public FileVO fileOneSelect(int fileNo) {
		FileVO fvo = new FileVO();
		try {
			fvo = (FileVO) smc.queryForObject("file.fileOneSelect", fileNo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fvo;
	}
	@Override
	public int fileInsert(FileVO fvo) {
		int cnt = 0;
		try {
//			Object obj = (Object)smc.insert("file.fileInsert", fvo);
//			if(obj == null) cnt = 1;
			
			cnt = (int)smc.insert("file.fileInsert", fvo);
			// selectKey값 리턴
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
	@Override
	public int fileDelete(int fileNo) {
		int cnt = 0;
		try {
			cnt = smc.delete("file.fileDelete", fileNo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}
}
