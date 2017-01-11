package com.bupummarket.controls;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bupummarket.bind.DataBinding;
import com.bupummarket.dao.MemberDao;
import com.bupummarket.vo.Member;

//스프링 애노테이션(@Component)으로 변경
@Component("/member/memberAdd.do")
public class MemberAddController implements Controller, DataBinding {
	MemberDao memberDao;

	@Autowired
	public MemberAddController setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
		return this;
	}

	public Object[] getDataBinders() {
		return new Object[] { "member", com.bupummarket.vo.Member.class };
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		Member member = (Member) model.get("member");
		if (member.getEmail() == null) { // 입력폼을 요청할 때 로그인이 안되었는데 이리로 오면 에러!
			return "/member/memberAdd.jsp";
		} else { // 회원 등록을 요청할 때
			memberDao.insert(member);
			member = memberDao.selectOne(member); 
			if (member != null) {
				HttpSession session = (HttpSession) model.get("session");
				session.setAttribute("member", member);
				return "redirect:../view/main.do";
			} else {
				return "../member/LogInFail.jsp";
			}
		}
	}
}
