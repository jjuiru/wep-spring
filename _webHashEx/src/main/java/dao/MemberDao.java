package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
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
	

	// -------------------------------------
	public HashMap<String, Member> select() {
		HashMap<String, Member> hash = new HashMap<>();
		String sql = "select * from member";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Member member = new Member(rs.getString("id"),rs.getString("name"),rs.getString("email"));
				hash.put(member.getId(),member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return hash;
	}
	
	
}
