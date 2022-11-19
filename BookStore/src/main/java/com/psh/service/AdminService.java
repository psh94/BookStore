package com.psh.service;

import java.util.List;

import com.psh.model.BookVO;
import com.psh.model.CateVO;
import com.psh.model.Criteria;

public interface AdminService {
	
	public void bookEnroll(BookVO book);
	
	/* 카테고리 리스트 */
	public List<CateVO> cateList();
	
	/* 상품 리스트 */
	public List<BookVO> goodsGetList(Criteria cri);
	
	/* 상품 총 개수 */
	public int goodsGetTotal(Criteria cri);	
	
	/* 상품 조회 페이지 */
	public BookVO goodsGetDetail(int bookId);	

	/* 상품 수정 */
	public int goodsModify(BookVO vo);	
	
	/* 상품 정보 삭제 */
	public int goodsDelete(int bookId);
}
