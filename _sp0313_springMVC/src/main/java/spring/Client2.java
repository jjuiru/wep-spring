package spring;

public class Client2{
	private String host;


	public void setHost(String host) {
		System.out.println("2세터실행");
		this.host = host;
	}

	public void send(){
		System.out.println("Client2.send()to"+ host);

	}
	
	public void connect() {
		System.out.println("Client2.connect()실행");

	}

	public void close(){ //커스텀모드에서는 매개변수를 줄 수 없다.
		System.out.println("Client2.close() 실행");

	}

}
