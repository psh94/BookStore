package com.psh.service;

import java.util.List;

import com.psh.model.BookVO;
import com.psh.model.CateVO;

public interface AdminService {
	
	public void bookEnroll(BookVO book);
	
	/* 카테고리 리스트 */
	public List<CateVO> cateList();

}
