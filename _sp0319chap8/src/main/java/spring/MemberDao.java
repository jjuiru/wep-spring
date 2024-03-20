package spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

@Component
public class MemberDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public MemberDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Member selectByEmail(String email) {
		List<Member> results = jdbcTemplate.query(
				"select * from MEMBER where EMAIL = ?", //객체를 오버라이딩으로 재정의 해서 생산성을 높인다. 
				new RowMapper<Member>() { // 
					@Override
					public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
						Member member = new Member(
								rs.getString("EMAIL"),
								rs.getString("PASSWORD"),
								rs.getString("NAME"),
								rs.getTimestamp("REGDATE").toLocalDateTime());
						member.setId(rs.getLong("ID"));
						return member;
					}
				}, email);

		return results.isEmpty() ? null : results.get(0);
	}
	
	public Member selectByEmail2(String email) {
		Member results = jdbcTemplate.queryForObject( // 하나만 가져온다. >값이 반드시 나와야 한다.나오지 않으면 exception이 발생한다.
				"select * from MEMBER where EMAIL = ?",
				new RowMapper<Member>() {
					@Override
					public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
						Member member = new Member(
								rs.getString("EMAIL"),
								rs.getString("PASSWORD"),
								rs.getString("NAME"),
								rs.getTimestamp("REGDATE").toLocalDateTime());
						member.setId(rs.getLong("ID"));
						return member;
					}
				}, email);

		return results;
	}
	
	public Member selectByEmail3(String email) {
		List<Member> results = jdbcTemplate.query(
				"select * from MEMBER where EMAIL = ?",
				(rs, rowNum) -> {
						Member member = new Member(
								rs.getString("EMAIL"),
								rs.getString("PASSWORD"),
								rs.getString("NAME"),
								rs.getTimestamp("REGDATE").toLocalDateTime());
						member.setId(rs.getLong("ID"));
						return member;
				}, email);

		return results.isEmpty() ? null : results.get(0);
	}

	public void insert(Member member) {
		KeyHolder keyHolder =new GeneratedKeyHolder(); //자동증가열을 가진 키에 대해서만 사용된다. 
		jdbcTemplate.update(new PreparedStatementCreator() {		
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstmt=con.prepareStatement
						("INSERT INTO member(email, password, name, regdate)VALUES(?, ?, ?, now())",new String[]{"ID"});
				
				pstmt.setString(1, member.getEmail());
				pstmt.setString(2, member.getPassword());
				pstmt.setString(3, member.getName());
				return pstmt;
			}
		}, keyHolder);
		Number keyValue=keyHolder.getKey();
		member.setId(keyValue.longValue()); // 불러온 객체를 바로 받아 객체에 저장하기 위해
		
	}	
		
	public void insert2(Member member) {
		jdbcTemplate.update("INSERT INTO member(email, password, name, regdate)VALUES(?, ?, ?, now())",
				member.getEmail(),member.getPassword(),member.getName());
	}

	public void update(Member member) {
		jdbcTemplate.update("update member set name=?, password=? where email=?",
				member.getName(),member.getPassword(),member.getEmail());
	}

	public List<Member> selectAll() {
		List<Member> results = jdbcTemplate.query(
				"select * from MEMBER", //객체를 오버라이딩으로 재정의 해서 생산성을 높인다. 
				new RowMapper<Member>() { // 
					@Override
					public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
						Member member = new Member(
								rs.getString("EMAIL"),
								rs.getString("PASSWORD"),
								rs.getString("NAME"),
								rs.getTimestamp("REGDATE").toLocalDateTime());
						member.setId(rs.getLong("ID"));
						return member;
					}
				});

		return results;
	}
	
	public int count() {
		return jdbcTemplate.queryForObject("select count(*) from MEMBER", Integer.class);
	}
}
