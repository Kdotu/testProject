package kr.or.ddit.vo;

public class BoardVO {
	private int board_no       ;
	private String board_title    ;
	private String board_content  ;
	private String board_writer   ;
	private String board_regdate  ;
	private int file_no        ;

	public BoardVO() {}

	public BoardVO(int board_no, String board_title, String board_content, String board_writer, String board_regdate,
			int file_no) {
		super();
		this.board_no = board_no;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_writer = board_writer;
		this.board_regdate = board_regdate;
		this.file_no = file_no;
	}

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_content() {
		return board_content;
	}

	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}

	public String getBoard_writer() {
		return board_writer;
	}

	public void setBoard_writer(String board_writer) {
		this.board_writer = board_writer;
	}

	public String getBoard_regdate() {
		return board_regdate;
	}

	public void setBoard_regdate(String board_regdate) {
		this.board_regdate = board_regdate;
	}

	public int getFile_no() {
		return file_no;
	}

	public void setFile_no(int file_no) {
		this.file_no = file_no;
	}

	@Override
	public String toString() {
		return "BoardVO [board_no=" + board_no + ", board_title=" + board_title + ", board_content=" + board_content
				+ ", board_writer=" + board_writer + ", board_regdate=" + board_regdate + ", file_no=" + file_no + "]";
	}
	
	
	
	
	
}
