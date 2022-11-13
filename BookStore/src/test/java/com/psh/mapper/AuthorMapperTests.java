package com.psh.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.psh.model.AuthorVO;
import com.psh.model.Criteria;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class AuthorMapperTests {
 
    @Autowired
    private AuthorMapper mapper;
    
//    /* 작가 등록 테스트 */
//    @Test
//    public void authorEnroll() throws Exception{
//        
//        AuthorVO author = new AuthorVO();
//        
//        author.setNationId("01");
//        author.setAuthorName("테스트");
//        author.setAuthorIntro("테스트 소개");
//        
//        mapper.authorEnroll(author);
//        
//    }    
//  
//    @Test
//    public void authorGetListTest() throws Exception{
//        
//        Criteria cri = new Criteria(1,10);    // 3페이지 & 10개 행 표시
//        cri.setKeyword("test");
//        
//        List<AuthorVO> list = mapper.authorGetList(cri);
//        
//        for(int i = 0; i < list.size(); i++) {
//            System.out.println("list" + i + ".........." + list.get(i));
//        }
//        
//    }
//    
    @Test
    public void authorGetTotalTest() throws Exception{
        
        Criteria cri = new Criteria();
        cri.setKeyword("test");
        
        int total = mapper.authorGetTotal(cri);
        
        System.out.println("total....." + total);
        
    }
}
