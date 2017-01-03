package com.bupummarket.dao;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bupummarket.vo.Article;

//스프링 애노테이션(@Component)으로 변경
@Component("articleDao")
public class MySqlArticleDao implements ArticleDao {
	SqlSessionFactory sqlSessionFactory;

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public List<Article> selectList(HashMap<String, Object> paramMap)
			throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			return sqlSession.selectList("com.bupummarket.dao.articleDao.selectList", paramMap);
		} finally {
			sqlSession.close();
		}
	}

	public int insert(Article article) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int count = sqlSession.insert(
					"com.bupummarket.dao.articleDao.insert", article);
			sqlSession.commit();
			return count;
		} finally {
			sqlSession.close();
		}
	}

	public Article selectOne(int no) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			return sqlSession.selectOne(
					"com.bupummarket.dao.articleDao.selectOne", no);
		} finally {
			sqlSession.close();
		}
	}

	public int update(Article article) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			Article original = sqlSession.selectOne(
					"spms.dao.articleDao.selectOne", article.getNo());

			Hashtable<String, Object> paramMap = new Hashtable<String, Object>();
			if (!article.getTitle().equals(original.getTitle())) {
				paramMap.put("title", article.getTitle());
			}
			if (!article.getContent().equals(original.getContent())) {
				paramMap.put("content", article.getContent());
			}
			// if (article.getStartDate().compareTo(original.getStartDate()) !=
			// 0) {
			// paramMap.put("startDate", article.getStartDate());
			// }
			// if (article.getEndDate().compareTo(original.getEndDate()) != 0) {
			// paramMap.put("endDate", article.getEndDate());
			// }
			// if (article.getState() != original.getState()) {
			// paramMap.put("state", article.getState());
			// }
			// if (!article.getTags().equals(original.getTags())) {
			// paramMap.put("tags", article.getTags());
			// }

			if (paramMap.size() > 0) {
				paramMap.put("no", article.getNo());
				int count = sqlSession.update(
						"com.bupummarket.dao.articleDao.update", paramMap);
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
			int count = sqlSession.delete(
					"com.bupummarket.dao.articleDao.delete", no);
			sqlSession.commit();
			return count;
		} finally {
			sqlSession.close();
		}
	}
}
