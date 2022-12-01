package com.psh.service;

import com.psh.model.CartDTO;

import java.util.List;

public interface CartService {

	/* 장바구니 추가 */
	public int addCart(CartDTO cart);	
	
	/* 장바구니 정보 리스트 */
	public List<CartDTO> getCartList(String memberId);	
	
	/* 카트 수량 수정 */
	public int modifyCount(CartDTO cart);	
	
	/* 카트 삭제 */
	public int deleteCart(int cartId);		
	
}