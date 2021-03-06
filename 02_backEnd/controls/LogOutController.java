package com.bupummarket.controls;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

//스프링 애노테이션(@Component)으로 변경
@Component("/member/logout.do")
public class LogOutController implements Controller {
  @Override
  public String execute(Map<String, Object> model) throws Exception {
    HttpSession session = (HttpSession)model.get("session");
    session.invalidate();
    
    return "redirect:../view/main.do";
  }
}
