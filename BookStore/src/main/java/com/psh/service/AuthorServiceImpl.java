package com.psh.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psh.mapper.AuthorMapper;
import com.psh.model.AuthorVO;
import com.psh.model.Criteria;

@Service
public class AuthorServiceImpl implements AuthorService{
	
    private static final Logger log = LoggerFactory.getLogger(AuthorServiceImpl.class);

	
	@Autowired
	private AuthorMapper authorMapper;
	
	@Override
	public void authorEnroll(AuthorVO author) throws Exception {
	
		authorMapper.authorEnroll(author);
		
	}
	
    /* 작가 목록 */
    @Override
    public List<AuthorVO> authorGetList(Criteria cri) throws Exception {
        
        return authorMapper.authorGetList(cri);
    }
    
    @Override
    public int authorGetTotal(Criteria cri) throws Exception {
        log.info("(service)authorGetTotal()......." + cri);
        return authorMapper.authorGetTotal(cri);
    }

}
