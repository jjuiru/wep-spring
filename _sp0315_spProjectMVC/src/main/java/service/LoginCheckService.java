package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemberDao;
import dto.MemberDto;

@Service
public class LoginCheckService {

	@Autowired
	private MemberDao memberDao;
	@Autowired
	 MemberDto dtoList;
	public boolean loginCheckServece(String id, String pw ) {
		dtoList= memberDao.selectOne(id, pw);
		System.out.println(dtoList);
		if(dtoList.getId()!=null && dtoList.getPw()!=null) {
			return true;
		}
		return false;
	}
}
