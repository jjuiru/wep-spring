package service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MemberDao;
import dto.MemberDto;

@Service
public class GetMemberListPrintService {

	@Autowired
	private MemberDao memberDao;
	
	public ArrayList<MemberDto> getMemberListPrintService() {
		return memberDao.selectAllList();
	}
}
