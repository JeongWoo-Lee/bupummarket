package com.bupummarket.dao;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bupummarket.vo.Member;

//스프링 애노테이션(@Component)으로 변경
@Component("memberDao")
public class MySqlMemberDao implements MemberDao {
  SqlSessionFactory sqlSessionFactory;

  @Autowired
  public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  public List<Member> selectList(HashMap<String,Object> paramMap) 
  		throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      return sqlSession.selectList("spms.dao.MemberDao.selectList", paramMap);
    } finally {
      sqlSession.close();
    }
  }

  public int insert(Member member) throws Exception  {
  	SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      int count = sqlSession.insert("com.bupummarket.dao.MemberDao.insert", member);
      sqlSession.commit();
      return count;
    } finally {
      sqlSession.close();
    }
  }

  public Member selectOne(Member member) throws Exception { 
  	SqlSession sqlSession = sqlSessionFactory.openSession();
  	try {
  		member = sqlSession.selectOne("com.bupummarket.dao.MemberDao.selectOne", member);
  		return member;
  	} finally {
  		sqlSession.close();
  	}
  }

  public int update(Member member) throws Exception { 
    SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
//    	Member original = sqlSession.selectOne(
//    			"com.bupummarket.dao.MemberDao.selectOne", member.getEmail());
//    	
//    	Hashtable<String,Object> paramMap = new Hashtable<String,Object>();
//    	if (!member.getEmail().equals(original.getEmail())) {
//    		paramMap.put("email", member.getEmail());
//    	}
    	
    	if (true) {
    		int count = sqlSession.update("com.bupummarket.dao.MemberDao.update", member);
    		sqlSession.commit(); 
    		return count;
    	} else {
    		return 0;
    	}
    } finally {
      sqlSession.close();
    }
  }
  
  public int delete(int no) throws Exception {  
  	SqlSession sqlSession = sqlSessionFactory.openSession();
    try {
      int count = sqlSession.delete("com.bupummarket.dao.MemberDao.delete", no);
      sqlSession.commit();
      return count;
    } finally {
      sqlSession.close();
    }
  }
  
  public Member exist(String email, String pw) throws Exception {
  	HashMap<String,String> paramMap = new HashMap<String,String>(); 
  	paramMap.put("email", email);
  	paramMap.put("pw", pw);
  	
  	SqlSession sqlSession = sqlSessionFactory.openSession(); 
  	try {
  		Member member = sqlSession.selectOne("com.bupummarket.dao.MemberDao.exist", paramMap);
  		if (member.getNo() > 0){
  			paramMap.put("no", Integer.toString(member.getNo()));
  			sqlSession.update("com.bupummarket.dao.MemberDao.login", paramMap);
  		}
  		return member;
  	} finally {
  		sqlSession.close();
  	}
  }
}
