package servlet;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//커넥션풀을 등록해순 config
@Configuration
public class DbConfig {

	@Bean(destroyMethod = "close") //빈이 소멸될때 호출될 메소드이다. 접속을 끊어주는 기능
	public DataSource dataSource() {
		DataSource ds= new DataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver"); //jar 대신 dependency로 로드된다.
		ds.setUrl("jdbc:mysql://localhost/project2?characterEncoding=utf8"); //db 위치정보
		ds.setUsername("root"); //접속아이디
		ds.setPassword("mysql"); //패스워드

		ds.setInitialSize(2); //처음 2개의 연결을 미리 만들어둔다. 생략하면 10, 100 값으로 자동 설정
		ds.setMaxActive(10); //최대 생성 갯수
		return ds;
		}		
	}

