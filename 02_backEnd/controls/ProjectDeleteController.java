package com.bupummarket.controls;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bupummarket.bind.DataBinding;
import com.bupummarket.dao.ArticleDao;

//스프링 애노테이션(@Component)으로 변경
@Component("/project/delete.do")
public class ProjectDeleteController implements Controller, DataBinding {
  ArticleDao projectDao;
  
  @Autowired
  public ProjectDeleteController setProjectDao(ArticleDao projectDao) {
    this.projectDao = projectDao;
    return this;
  }
  
  public Object[] getDataBinders() {
    return new Object[]{
        "no", Integer.class
    };
  }
  
  @Override
  public String execute(Map<String, Object> model) throws Exception {
    Integer no = (Integer)model.get("no");
    projectDao.delete(no);
    
    return "redirect:list.do";
  }
}
