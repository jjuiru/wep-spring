package dto;

public class Board {
	// 컬럼명을 필드이름과 같게한다.
private int num;
private String writer;
private String title;
private String content;
private String regtime;
private int hits;

// 모든 필드를 저장하는 생성자와 get,setter를 만든다.
public Board(int num, String writer, String title, String content, String regtime, int hits) {
	this.num = num;
	this.writer = writer;
	this.title = title;
	this.content = content;
	this.regtime = regtime;
	this.hits = hits;
}

public Board(String writer, String title, String content) {
	this(0,writer, title, content, "",0); //생성자 호출
//	this.writer = writer;
//	this.title = title;
//	this.content = content;
}

public Board(int num, String writer, String title, String content) {
	this(num ,writer, title, content, "",0); //생성자 호출
}

public int getNum() {
	return num;
}
public String getWriter() {
	return writer;
}
public String getTitle() {
	return title;
}
public String getContent() {
	return content;
}
public String getRegtime() {
	return regtime;
}
public int getHits() {
	return hits;
}
public void setNum(int num) {
	this.num = num;
}
public void setWriter(String writer) {
	this.writer = writer;
}
public void setTitle(String title) {
	this.title = title;
}
public void setContent(String content) {
	this.content = content;
}
public void setRegtime(String regtime) {
	this.regtime = regtime;
}
public void setHits(int hits) {
	this.hits = hits;
}

//테스트용  tostring
@Override
public String toString() {
	return "Board [num=" + num + ", writer=" + writer + ", title=" + title + ", content=" + content + ", regtime="
			+ regtime + ", hits=" + hits + "]";
}


}
