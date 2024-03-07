package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.Board;

public class BoardDao { // 싱글턴 클래스
	private static Connection conn;
	private static BoardDao dao = new BoardDao();

	private BoardDao() {
	} // 생성제한

	public static BoardDao getInstance() {
		BoardDao.getConnection();
		return dao;
		// 오직 메소드를 통해서만 객체를 접근할 수 있다.
		// 페이지마다 접속할 수 없도록 만든다. 즉 웹페이지에 접근시 한번만 한 상태에서 서비스한다.
	}

	// DB에 접속하는 코드를 단 하나로만 사용가능하게 한다.
	private static void getConnection() {
//		Connection conn = null; 굳이 안써도 되는데 왜 쓸까???
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1", "root", "mysql");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		return conn; 리턴은 지역변수일 때 사용하는데, 전역변수 conn이 있으므로 리턴이 없어도 상관은 없다.
	}
	
	
	public int selectCount() {
		String sql="select count(*) from board";
		PreparedStatement pstmt;
		try {
			pstmt=conn.prepareStatement(sql);
			ResultSet rs= pstmt.executeQuery();
			
			if(rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	public ArrayList<Board> select(int startRow, int size) {
		ArrayList<Board> list = new ArrayList<Board>();
		// List는 인터페이스 타입으로 다형서을 사용하기 위해서 사용
		String sql = "select * from board order by num desc limit ?,?";
		// 몇부터 몇까지 가져오라는 쿼리문
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, size);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Board board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"));
				list.add(board);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	

	// Board list에 jsp에서 호출한 값의 정보를 저장하여 보관, 즉 회원정보를 가지고 있다. 회원정보가 필요한 곳은 list를 호출하여
	// 사용
	// -----------------------------------
	public ArrayList<Board> selectList() {
		ArrayList<Board> list = new ArrayList<Board>();
		// List는 인터페이스 타입으로 다형서을 사용하기 위해서 사용
		String sql = "select * from board order by num desc";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Board board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"));
				list.add(board);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	// -------------------------------------
	public Board selectOne(int num, boolean inc) {
		Board board = null;
//		String sql = "select * from board where num=" + num;
		String sql = "select * from board where num=?"; // Prepared전용
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num); // Prepared전용
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				board = new Board(rs.getInt("num"), rs.getString("writer"), rs.getString("title"),
						rs.getString("content"), rs.getString("regtime"), rs.getInt("hits"));
			}
			if (inc) {
				pstmt = conn.prepareStatement("UPDATE board SET hits = hits + 1 where num=" + num);
				pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return board;
	}
	// ---------------------------------------
//	public void hitsUp(int num) {		
//		String sql = "UPDATE board SET hits = hits + 1 where num=" + num;
//		PreparedStatement pstmt;
//		try {
//			pstmt = conn.prepareStatement(sql);
//			int rs = pstmt.executeUpdate();
//			// 업데이트 잘됐는지 확인하는 문장
//			if (rs > 0) {
//			    System.out.println("업데이트가 성공적으로 수행되었습니다.");
//			} else {
//			    System.out.println("업데이트에 실패했습니다.");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}		
//	}
	// ------------------------------------------

	public int delete(int num) {
		int result = 0;
		try (PreparedStatement pstmt = conn.prepareStatement("delete form board wherenum=" + num);) {
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public int insert(Board board) {
		String sql = "insert into board(writer, title, content, regtime, hits) values (?,?,?,now(),0)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {

			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getContent());
			return pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public void update(Board board) {
		String sql = "update set board(writer, title, content, regtime, hits) values (?,?,?,now(),0)";
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
			// 쿼리 실행
			pstmt.setString(1, board.getWriter());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getContent());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
