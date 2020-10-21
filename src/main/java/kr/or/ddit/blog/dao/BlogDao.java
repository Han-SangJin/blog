package kr.or.ddit.blog.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.blog.model.BlogVO;
//import kr.or.ddit.db.MybatisUtil;
//import kr.or.ddit.member.model.MemberVo;
import kr.or.ddit.db.MybatisUtil;

public class BlogDao implements BlogDaoI {

	@Override
	public List<BlogVO> selectAllBlog() {
		SqlSession sqlSession = MybatisUtil.getSession();
		List<BlogVO> memberList =  sqlSession.selectList("blog.selectAllBlog");
		 	
		sqlSession.close();
		return memberList;
	}
  
}
