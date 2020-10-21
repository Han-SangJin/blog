package kr.or.ddit.blog.dao;

import java.util.List;

import kr.or.ddit.blog.model.BlogVO;

public interface BlogDaoI {
	
	List<BlogVO> selectAllBlog();
}
