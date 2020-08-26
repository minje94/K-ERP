package com.ngroupware.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ngroupware.vo.GroupVO;
import com.ngroupware.vo.UserVO;

@Repository
public class UserDAOImpl implements UserDAO {

	@Inject
	private SqlSession sqlSession;

	@Override
	public void register(UserVO vo) throws Exception {
		sqlSession.insert("userMapper.register", vo);
	}

	@Override
	public UserVO login(UserVO vo) throws Exception {
		return sqlSession.selectOne("userMapper.login", vo);
	}

	@Override
	public UserVO userinfo(String u_id) throws Exception {
		return sqlSession.selectOne("userMapper.userInfo", u_id);
	}

	@Override
	public void socialReg(UserVO userVO) throws Exception {
		sqlSession.insert("userMapper.socialReg", userVO);
	}

	@Override
	public int socialAlreadyChk(UserVO userVO) throws Exception {
		return sqlSession.selectOne("userMapper.socialAlreadyChk", userVO);
	}
	
	@Override
	public List<UserVO> userList(GroupVO groupVO) throws Exception {
		return sqlSession.selectList("userMapper.userList", groupVO);
	}

	@Override
	public int userListCount(GroupVO groupVO) throws Exception {
		return sqlSession.selectOne("userMapper.userListCount", groupVO);
	}

	@Override
	public String userMail(String u_id) throws Exception {
		return sqlSession.selectOne("userMapper.userMail", u_id);
	}
	
	@Override
	//id체크
	public int userIdCheck(UserVO userVO) throws Exception {
		int result = sqlSession.selectOne("userMapper.userIdCheck", userVO);
		return result;
	}


}