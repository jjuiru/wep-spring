package AutoExQ;

public class Tire {
	

	private String postion;
	
	//pojo
	public void roll() {
		System.out.print(postion+",");
		System.out.println("바퀴가 돈다.");	
	}

	public String getPostion() {
		return postion;
	}

	public void setPostion(String postion) {
		this.postion = postion;
	}
	
}
