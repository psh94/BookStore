package com.psh.mapper;

import java.util.List;

import com.psh.model.BookVO;
import com.psh.model.CateVO;

public interface AdminMapper {
	
	public void bookEnroll(BookVO book);
	
	public List<CateVO> cateList();

}
