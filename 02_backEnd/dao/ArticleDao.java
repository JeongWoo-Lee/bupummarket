package com.bupummarket.dao;

import java.util.HashMap;
import java.util.List;

import com.bupummarket.vo.Article;

public interface ArticleDao {
  List<Article> selectList(HashMap<String,Object> paramMap) throws Exception;
  int insert(Article project) throws Exception;
  Article selectOne(int no) throws Exception;
  int update(Article project) throws Exception;
  int delete(int no) throws Exception;
}
