package com.psh.mapper;

import com.psh.model.MemberVO;

public interface MemberMapper {
	
	//회원가입
	public void memberJoin(MemberVO member);

	public int idCheck(String id);
	
	public MemberVO memberLogin(MemberVO member);

}
