package com.sbs.example.reply;

public class Reply {
    private int id;
    private String regDate;
    private String BODY;
    private int boardId;
    private int articleId;
    private int memberId;
	private String writer;
    private String passwd;
    
    public Reply(int id, String regDate, String bODY, int boardId, int articleId, int memberId, String writer,
			String passwd) {
		super();
		this.id = id;
		this.regDate = regDate;
		BODY = bODY;
		this.boardId = boardId;
		this.articleId = articleId;
		this.memberId = memberId;
		this.writer = writer;
		this.passwd = passwd;
	}
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getBODY() {
		return BODY;
	}
	public void setBODY(String bODY) {
		BODY = bODY;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}
