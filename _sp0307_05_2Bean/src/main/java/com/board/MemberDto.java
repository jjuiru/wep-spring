package com.board;

public class MemberDto {
	private int memberno;
	private String id;
	private String pw; //email 저장
	private String name;
	public MemberDto(int memberno, String id, String pw, String name) {
		super();
		this.memberno = memberno;
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	public MemberDto(){};
	public int getMemberno() {
		return memberno;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MemberDto [memberno=" + memberno + ", id=" + id + ", pw=" + pw + ", name=" + name + "]";
	}
	
	
}
