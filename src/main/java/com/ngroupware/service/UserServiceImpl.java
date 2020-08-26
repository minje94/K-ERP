package com.ngroupware.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ngroupware.dao.UserDAO;
import com.ngroupware.vo.GroupVO;
import com.ngroupware.vo.UserVO;


@Service
public class UserServiceImpl implements UserService {

	@Inject
	private UserDAO dao;
	
	@Override
	public void register(UserVO vo) throws Exception {
		dao.register(vo);
	}

	@Override
	public UserVO login(UserVO vo) throws Exception {
		return dao.login(vo);
	}

	@Override
	public UserVO userinfo(String u_id) throws Exception {
		return dao.userinfo(u_id);
	}

	@Override
	public void socialReg(UserVO userVO) throws Exception {
		dao.socialReg(userVO);
	}

	@Override
	public int socialAlreadyChk(UserVO userVO) throws Exception {
		return dao.socialAlreadyChk(userVO);
	}
	
	@Override
	public List<UserVO> userList(GroupVO groupVO) throws Exception {
		return dao.userList(groupVO);
	}

	@Override
	public int userListCount(GroupVO groupVO) throws Exception {
		return dao.userListCount(groupVO);
	}

	@Override
	public String userMail(String u_id) throws Exception {
		return dao.userMail(u_id);
	}
	
	@Override
	// id 체크
	public int userIdCheck(UserVO userVO) throws Exception {
		int result = dao.userIdCheck(userVO);
		return result;
	}
	

}