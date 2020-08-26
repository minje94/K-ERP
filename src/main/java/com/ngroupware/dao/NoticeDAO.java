package com.ngroupware.dao;

import java.util.List;

import com.ngroupware.vo.GroupVO;
import com.ngroupware.vo.NoticeVO;

public interface NoticeDAO {
	
	public List<NoticeVO> noticeList(GroupVO groupVO) throws Exception;

	public int noticeListCount(GroupVO groupVO) throws Exception;
	
	public void noticeWrite(NoticeVO noticeVO) throws Exception;
	
	public List<NoticeVO> noticeListMini(GroupVO groupVO) throws Exception;
	
	public NoticeVO noticeRead(NoticeVO noticeVO) throws Exception;
	
	public void noticeDelete(NoticeVO noticeVO) throws Exception;
}
