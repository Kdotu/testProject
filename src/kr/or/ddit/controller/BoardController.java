package kr.or.ddit.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import kr.or.ddit.service.BoardServiceImpl;
import kr.or.ddit.service.FileServiceImpl;
import kr.or.ddit.vo.BoardVO;
import kr.or.ddit.vo.FileVO;

@MultipartConfig(
	fileSizeThreshold = 1024 * 1024 * 10,	
	maxFileSize = 1024 * 1024 * 30,
	maxRequestSize = 1024 * 1024 * 100
)
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BoardServiceImpl boardService = BoardServiceImpl.getInstance();
	FileServiceImpl fileService = FileServiceImpl.getInstance();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		
		request.setCharacterEncoding("UTF-8");

		if(command.equals("/board/boardSelect.do")) {
			boardList(request,response);
		}
		
		if(command.equals("/board/boardInsert.do")) {
			// 등록 폼으로 이동시켜주기
			request.getRequestDispatcher("/boardRegistForm.jsp").forward(request, response);
		}
		
		if(command.equals("/board/boardUpdate.do")) {
			// 수정 폼으로 이동시켜주기
			request.getRequestDispatcher("/boardRegistForm.jsp").forward(request, response);
		}
		
		// 글 삭제
		if(command.equals("/board/boardDelete.do")) {
			boardDelete(request,response);
		}
	}
	
	private void boardList(HttpServletRequest request, HttpServletResponse response) {
		List<BoardVO> list = boardService.boardSelect();
		request.setAttribute("BoardList", list);
		try {
			request.getRequestDispatcher("/boardList.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void boardDelete(HttpServletRequest request, HttpServletResponse response) {
		int bono = Integer.parseInt(request.getParameter("boardNo"));
		boardService.boardDelete(bono);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		
		request.setCharacterEncoding("UTF-8");
		
		if(command.equals("/board/boardInsert.do")) {
			boardInsert(request,response);
		}
		if(command.equals("/board/boardUpdate.do")) {
			boardUpdate(request,response);
		}
	}


	private void boardUpdate(HttpServletRequest request, HttpServletResponse response) {
		String stype = request.getParameter("stype");
		String sword = request.getParameter("sword");
		int bono = Integer.parseInt(request.getParameter("bono"));
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("stype",stype);
		map.put("sword",sword);
		map.put("bono",bono);
		
		boardService.boardUpdate(map);
	}

	private void boardInsert(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// 게시글 등록하는 메서드
		BoardVO bvo = new BoardVO();
		FileVO fvo = new FileVO();

		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		String filePath = "d:/d_other/upload";
		
		File f = new File(filePath);
		
		if(!f.exists()) {
			f.mkdirs();
		}
		
		String fileName = ""; // 원래의 파일명이 저장될 변수
		List<FileVO> fileList = new ArrayList<FileVO>();
		
		for(Part part : request.getParts()) {
			fileName = extractFileName(part);
		}
		
				
		if(fvo != null) {
//		fvo.setFile_savename(file_savename);
//		fvo.setFile_origin(file_origin);
			fvo.setFile_writer(writer);
			
			int file_no = fileService.fileInsert(fvo);
			bvo.setFile_no(file_no);
		}
		
		bvo.setBoard_title(title);
		bvo.setBoard_writer(writer);
		bvo.setBoard_content(content);
		
		boardService.boardInsert(bvo);
	}

	private String extractFileName(Part part) {
		
		
		
		
		return null;
	}
}
