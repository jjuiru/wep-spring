package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Board;
import dto.Member;

public class MemberDao {
	private static Connection conn;
	private static MemberDao dao = new MemberDao();

	private MemberDao() {};
	
	public static MemberDao getInstance() {
	MemberDao.getConnection();
	return dao;
	}	
	private static void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "mysql");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Member> selectList() {
		ArrayList<Member> list = new ArrayList<Member>();
		// List는 인터페이스 타입으로 다형서을 사용하기 위해서 사용
		String sql = "select * from member order by id desc";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Member member = new Member(rs.getString("id"), rs.getString("email"), rs.getString("name"));
				list.add(member);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	// -------------------------------------
	public Member selectOne(String id) {
		Member member = null;
		String sql = "select * from member where id=?"; // Prepared전용
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id); // Prepared전용
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				member = new Member(rs.getString("id"), rs.getString("email"), rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return member;
	}
	
	public int delete(String id ,int num) {
		int result = 0;
		try (PreparedStatement pstmt = conn.prepareStatement("delete form member where id=" + id);) {
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int insert(Member member, String id) {
		String sql1 = "select * from member where id= id";
		String sql = "insert into member(id, email, name) values (?,?,?)";
		int result=0;
		try (PreparedStatement pstmt1 = conn.prepareStatement(sql1);
		     PreparedStatement pstmt = conn.prepareStatement(sql)
				) {
			ResultSet rs = pstmt1.executeQuery();
			if (rs.next()) {
				result=0;
			}else {

			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getEmail());
			pstmt.setString(3, member.getName());
			result= pstmt.executeUpdate();
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public void update(Member member) {
		String sql = "update set  member(id, email, name) values (?,?,?)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getEmail());
			pstmt.setString(3, member.getName());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
