package kr.or.ddit.vo;

public class FileVO {
	private int file_no      ;
	private String file_writer  ;
	private String file_origin  ;
	private String file_savename;
	private int file_size    ;
	private String file_date    ;
	
	public FileVO() {}

	public FileVO(int file_no, String file_writer, String file_origin, String file_savename, int file_size,
			String file_date) {
		super();
		this.file_no = file_no;
		this.file_writer = file_writer;
		this.file_origin = file_origin;
		this.file_savename = file_savename;
		this.file_size = file_size;
		this.file_date = file_date;
	}

	public int getFile_no() {
		return file_no;
	}

	public void setFile_no(int file_no) {
		this.file_no = file_no;
	}

	public String getFile_writer() {
		return file_writer;
	}

	public void setFile_writer(String file_writer) {
		this.file_writer = file_writer;
	}

	public String getFile_origin() {
		return file_origin;
	}

	public void setFile_origin(String file_origin) {
		this.file_origin = file_origin;
	}

	public String getFile_savename() {
		return file_savename;
	}

	public void setFile_savename(String file_savename) {
		this.file_savename = file_savename;
	}

	public int getFile_size() {
		return file_size;
	}

	public void setFile_size(int file_size) {
		this.file_size = file_size;
	}

	public String getFile_date() {
		return file_date;
	}

	public void setFile_date(String file_date) {
		this.file_date = file_date;
	}

	@Override
	public String toString() {
		return "FileVO [file_no=" + file_no + ", file_writer=" + file_writer + ", file_origin=" + file_origin
				+ ", file_savename=" + file_savename + ", file_size=" + file_size + ", file_date=" + file_date + "]";
	}
	
	
	
	
}
