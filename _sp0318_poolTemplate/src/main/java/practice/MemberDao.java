package practice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MemberDao {
	
	//jdbc 템플릿 고정형(jb접속을 커넥션 풀을 통해 자동으로 생성하기)
	private JdbcTemplate jdbcTemplate;
	public MemberDao(DataSource dataSource) { // 생성자
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	
	public int count() {
		Integer count=jdbcTemplate.queryForObject("select count(*)from member",Integer.class);
		return count;
	}
	
	public List<Member> selectAll() {
		List<Member> result= jdbcTemplate.query("select * from member",new RowMapper<Member>() {
			//RowMapper 인터페이스를 익명의 객체생성한다.  > rs를 생성해준다.모든 rs 리스트의 값을 셀렉트해서 자동으로 List 에 들어간다. 
			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member dto= new Member( // 이 부분은 자동으로 할 수 없고 무조건 코드를 작성해야한다. 
						rs.getInt("memberno"),
						rs.getString("id"),
						rs.getString("pw"),
						rs.getString("name"));
				return dto;
			}			
		});
		 return result;	
	}
	
	// 람다식으로 하기 매개변수만 주고 만들 수 있다. 인터페이스를 구성하는 메소드가 1개일때는 어디서든 사용가능하다!
	public List<Member> selectAll2() {
		List<Member> result= jdbcTemplate.query("select * from member",(rs, r)->{
			Member dto= new Member(
					rs.getInt("memberno"),
					rs.getString("id"),
					rs.getString("pw"),
					rs.getString("name")
					
					);
			return dto;
		}); 			
		 return result;	
	}
	
	public String selectMemberName(int memberno) {
		return jdbcTemplate.queryForObject("select name from member where memberno=?",String.class, memberno);
		//("select name from member where memberno="+memberno,String.class);
		
	}	
	public void insert(Member member) {
		jdbcTemplate.update("insert into member(id, pw, name) values(?,?,?)", member.getId(),member.getPw(),member.getName());		
	}
	
	public void update(Member member) {
		jdbcTemplate.update("update member set pw=?, name=? where memberno=?",
				member.getPw(),member.getName(),member.getMemberno());		
	}
	
	public void delete(int memberno) {
		jdbcTemplate.update("delete from member whrer memberno=?",
				String.class, memberno);		
	}
	
}
