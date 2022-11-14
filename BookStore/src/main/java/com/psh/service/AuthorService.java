package com.psh.service;

import java.util.List;

import com.psh.model.AuthorVO;
import com.psh.model.Criteria;

public interface AuthorService {
	
	public void authorEnroll(AuthorVO author) throws Exception;
	
    public List<AuthorVO> authorGetList(Criteria cri) throws Exception;
    
    public int authorGetTotal(Criteria cri) throws Exception;    
    
	public AuthorVO authorGetDetail(int authorId) throws Exception;

	public int authorModify(AuthorVO author) throws Exception;




}
