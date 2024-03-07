package drive;

import java.util.List;

import dao.BoardDao;
import dto.Board;

public class DaoEx1 {
// Board에 값이 제대로 저장되었는지 확인하기 위해서 출력한다.
	public static void main(String[] args) {
		int num = 1;
		//새로운 객체를 생성하여 부를 수 없기 때문에 메소드를 통해 호출한다.
		BoardDao dao = BoardDao.getInstance();
		List<Board> lst = dao.selectList(); // selectList() 호출해보기
        System.out.println(lst); // toString 정의한 내용이 호출
        for(Board board: lst) {
         System.out.println(board.getWriter()); // 배열대로 내용이 호출
        }
        BoardDao dao1 = BoardDao.getInstance();
//        Board board = dao.selectOne(num);
//        System.out.println(board);
	}
}
