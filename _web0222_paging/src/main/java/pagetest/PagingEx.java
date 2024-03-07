package pagetest;

public class PagingEx {

	public static void main(String[] args) {
		int totalPage=20;
		for(int i=1; i<=30; i++) {
			pageTest(i,totalPage);
		}

	}

	public static void pageTest(int currentPage, int totalPages) {
		int modVal = currentPage % 5; // 현재 페이지의 번호를 하단 목록 번호의 갯수
		// 현재 페이지가 1이라면 나머지 1 발생 , 2,3,4, 5일땐 0
		int startPage = currentPage / 5 * 5 + 1; // 0*5+1 =1 전부
		if (modVal == 0)
			startPage -= 5;

		// startPage,endPage: 화면 하단에 보여줄 페이지 이동 링크의 시작 번호와 끝 번호
		int endPage = startPage + 4;
		if (endPage > totalPages) endPage = totalPages;
		System.out.println("startPage: " + startPage + ", emdPage: " + endPage);
	}
}
