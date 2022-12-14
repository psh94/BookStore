package com.psh.mapper;

import java.util.List;

import com.psh.model.BookVO;
import com.psh.model.CateVO;
import com.psh.model.Criteria;

public interface AdminMapper {
	
	public void bookEnroll(BookVO book);
	
	public List<CateVO> cateList();
	
	public List<BookVO> goodsGetList(Criteria cri);
	
	public int goodsGetTotal(Criteria cri);
	
	public BookVO goodsGetDetail(int bookId);
	
	public int goodsModify(BookVO vo);
	
	public int goodsDelete(int bookId);


}
