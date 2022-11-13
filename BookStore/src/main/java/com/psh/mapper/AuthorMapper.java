package com.psh.mapper;

import java.util.List;

import com.psh.model.AuthorVO;
import com.psh.model.Criteria;

public interface AuthorMapper {
	
	public void authorEnroll(AuthorVO author);
	
	public List<AuthorVO> authorGetList(Criteria cri);
	
    public int authorGetTotal(Criteria cri);
    
    public AuthorVO authorGetDetail(int authorId);


}
