package com.ngroupware.dao;

import java.util.List;

import com.ngroupware.vo.GroupPointVO;
import com.ngroupware.vo.GroupVO;
import com.ngroupware.vo.UserVO;

public interface GroupDAO {
	
	//그룹생성
	public void GroupCreate(GroupVO groupVO) throws Exception;
		
	//그룹 목록 조회
	public List<GroupVO> GroupList(UserVO userVO) throws Exception;
		
	//출석 생성시 그룹원들의 attend를 추가하기 위해 그룹원 이름 가져오기!
	public List<GroupVO> groupMemberList(GroupVO groupVO) throws Exception;
	
	//초대현황
	public List<GroupVO> groupCheck(UserVO userVO) throws Exception;
	
	//초대 yes
	public void groupYes(GroupVO groupVO) throws Exception;
	
	//초대 no
	public void groupNo(GroupVO groupVO) throws Exception;
	
	//그룹 총 개수
	public int GroupListCount(UserVO userVO) throws Exception;
	
	// 원하는 그룹의 관리자 찾기
	public GroupVO findMaster (GroupVO groupVO) throws Exception;

	// 유저 포인트 넣기
	public void userPoint(GroupPointVO groupPointVO) throws Exception;
	
	// 탑 랭크 유저들 뽑아오기 3위까지
	public List<GroupPointVO> findTopRankList(GroupVO groupVO) throws Exception;
	
	// 내 순위 찾아오기
	public GroupPointVO findMyRank(GroupVO groupVO) throws Exception;
	
	// 소켓 접속했을때 세션 아이디 넣기
	public void socketConnection(GroupVO groupVO) throws Exception;
	
	// 해당 그룹에 소켓 접속 인원 list 가져오기
	public List<GroupVO> socketConnectionList(GroupVO groupVO) throws Exception;
	
	//선택한 그룹 가져오기
	public GroupVO groupRead(GroupVO groupVO) throws Exception;
	
	//그룹 user 추가 
	public void userPlus(GroupVO groupVO) throws Exception;
	
	//그룹 추가신청 메일온거에서 인증 url 누른사람 g_flag = 0 으로 업데이트 해주기
	public void userPlusMailAuth(GroupVO groupVO) throws Exception;
	
	//그룹 폐쇄
	public void groupLock(GroupVO groupVO) throws Exception;
}
