package kr.or.ddit.vo;

public class BoardCommentVO {
	private int comment_no       ;
	private String comment_content  ;
	private String comment_writer   ;
	private String comment_regdate  ;
	private int board_no         ;
	
	public BoardCommentVO() {}

	public BoardCommentVO(int comment_no, String comment_content, String comment_writer, String comment_regdate,
			int board_no) {
		super();
		this.comment_no = comment_no;
		this.comment_content = comment_content;
		this.comment_writer = comment_writer;
		this.comment_regdate = comment_regdate;
		this.board_no = board_no;
	}

	public int getComment_no() {
		return comment_no;
	}

	public void setComment_no(int comment_no) {
		this.comment_no = comment_no;
	}

	public String getComment_content() {
		return comment_content;
	}

	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}

	public String getComment_writer() {
		return comment_writer;
	}

	public void setComment_writer(String comment_writer) {
		this.comment_writer = comment_writer;
	}

	public String getComment_regdate() {
		return comment_regdate;
	}

	public void setComment_regdate(String comment_regdate) {
		this.comment_regdate = comment_regdate;
	}

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	@Override
	public String toString() {
		return "BoardCommentVO [comment_no=" + comment_no + ", comment_content=" + comment_content + ", comment_writer="
				+ comment_writer + ", comment_regdate=" + comment_regdate + ", board_no=" + board_no + "]";
	}
	
	
	
	
	
}
