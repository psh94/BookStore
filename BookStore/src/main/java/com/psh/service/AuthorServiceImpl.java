package com.psh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psh.mapper.AuthorMapper;
import com.psh.model.AuthorVO;

@Service
public class AuthorServiceImpl implements AuthorService{
	
	@Autowired
	private AuthorMapper authorMapper;
	
	@Override
	public void authorEnroll(AuthorVO author) throws Exception {
	
		authorMapper.authorEnroll(author);
		
	}

}
