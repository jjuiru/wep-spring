package practice;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//memberDao에 커넥션풀 객체를 생성해 주입해주는 config
@Configuration
public class DbQueryConfig {
	
	@Autowired
	private DataSource dataSource;
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao(dataSource);
	}
}
