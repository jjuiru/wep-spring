package servlet;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TodoList {

	private int num;
	private String content;
	
	public TodoList(String content) {
		super();
		this.content = content;
}

	public TodoList(int num, String content) {
		this.num=num;
		this.content = content;
	}
}