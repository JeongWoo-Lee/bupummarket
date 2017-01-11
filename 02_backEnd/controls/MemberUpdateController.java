package com.bupummarket.controls;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bupummarket.bind.DataBinding;
import com.bupummarket.dao.MemberDao;
import com.bupummarket.vo.Member;

//스프링 애노테이션(@Component)으로 변경
@Component("/member/memberUpdate.do")
public class MemberUpdateController implements Controller, DataBinding {
	MemberDao memberDao;

	@Autowired
	public MemberUpdateController setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
		return this;
	}

	public Object[] getDataBinders() {
		return new Object[] { "member", com.bupummarket.vo.Member.class };
	}

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		HttpSession session = (HttpSession) model.get("session");
		Member sessionMember = (Member) session.getAttribute("member");
		Member member = (Member)model.get("member");
		member.setEmail(sessionMember.getEmail());
		if (sessionMember.getPw() == null) { // 입력폼을 요청할 때
			Member memberInfo = memberDao.selectOne(sessionMember);
			model.put("member", memberInfo);
			session.setAttribute("member", memberInfo);
			return "/member/memberUpdate.jsp"; 
		} else {
			memberDao.update(member);
			member.setPw(null);
			session.setAttribute("member", member);
			return "redirect:../member/memberUpdate.do";
		}
	}
}
