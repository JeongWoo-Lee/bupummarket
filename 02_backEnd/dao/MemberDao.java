package com.bupummarket.dao;

import java.util.HashMap;
import java.util.List;

import com.bupummarket.vo.Member;

public interface MemberDao {
  List<Member> selectList(HashMap<String,Object> paramMap) throws Exception;
  int insert(Member member) throws Exception;
  int delete(int no) throws Exception;
  Member selectOne(Member member) throws Exception;
  int update(Member member) throws Exception;
  public Member exist(String email, String pw) throws Exception;
}
