package com.bupummarket.controls;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bupummarket.bind.DataBinding;
import com.bupummarket.dao.ArticleDao;
import com.bupummarket.vo.Article;

//스프링 애노테이션(@Component)으로 변경
@Component("/project/update.do")
public class ProjectUpdateController implements Controller, DataBinding {
  ArticleDao projectDao;
  
  @Autowired
  public ProjectUpdateController setProjectDao(ArticleDao projectDao) {
    this.projectDao = projectDao;
    return this;
  }
  
  public Object[] getDataBinders() {
    return new Object[]{
        "no", Integer.class,
        "project", com.bupummarket.vo.Article.class
    };
  }
  
  @Override
  public String execute(Map<String, Object> model) throws Exception {
    Article project = (Article)model.get("project");
    
    if (project.getTitle() == null) { 
      Integer no = (Integer)model.get("no");
      Article detailInfo = projectDao.selectOne(no);
      model.put("project", detailInfo);
      return "/project/ProjectUpdateForm.jsp";

    } else { 
      projectDao.update(project);
      return "redirect:list.do";
    }
  }
}
