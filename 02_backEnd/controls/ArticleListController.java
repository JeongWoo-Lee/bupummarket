package com.bupummarket.controls;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bupummarket.bind.DataBinding;
import com.bupummarket.dao.ArticleDao;

//스프링 애노테이션(@Component)으로 변경
@Component("/article/list.do")
public class ArticleListController implements Controller, DataBinding {
  ArticleDao articleDao;
  
  @Autowired
  public ArticleListController setMemberDao(ArticleDao articleDao) {
    this.articleDao = articleDao;
    return this; 
  }
  
  public Object[] getDataBinders() {
    return new Object[]{
        //"orderCond", String.class
    };
  } 

  @Override
  public String execute(Map<String, Object> model) throws Exception {
  	HashMap<String,Object> paramMap = new HashMap<String,Object>();
  	//paramMap.put("orderCond", model.get("orderCond"));
    model.put("article", articleDao.selectList(paramMap));
    return "/article/ArticleList.jsp";
  }
}
