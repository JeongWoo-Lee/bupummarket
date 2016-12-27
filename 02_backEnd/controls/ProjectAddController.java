package com.bupummarket.controls;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bupummarket.bind.DataBinding;
import com.bupummarket.dao.ArticleDao;
import com.bupummarket.vo.Article;

//스프링 애노테이션(@Component)으로 변경
@Component("/project/add.do")
public class ProjectAddController implements Controller, DataBinding {
  ArticleDao projectDao;
  
  @Autowired
  public ProjectAddController setProjectDao(ArticleDao projectDao) {
    this.projectDao = projectDao;
    return this;
  }
  
  public Object[] getDataBinders() {
    return new Object[]{
        "project", com.bupummarket.vo.Article.class
    };
  }
  
  @Override
  public String execute(Map<String, Object> model) throws Exception {
    Article project = (Article)model.get("project");
    if (project.getTitle() == null) {
      return "/project/ProjectForm.jsp";
      
    } else {
      projectDao.insert(project);
      return "redirect:list.do";
    }
  }
}
