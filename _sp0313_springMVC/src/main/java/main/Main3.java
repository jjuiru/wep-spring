package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.AppCtx;
import spring.Client;

// 싱글턴 확인하기
public class Main3 {

	public static void main(String[] args) {
		AbstractApplicationContext ctx= new AnnotationConfigApplicationContext(AppCtx.class);
		Client client1= ctx.getBean(Client.class);
		Client client2= ctx.getBean(Client.class);


		System.out.println(client1==client2);
		ctx.close();
	}
}
