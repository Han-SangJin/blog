package kr.or.ddit.blog.service;

import java.util.List;

import kr.or.ddit.blog.dao.BlogDao;
import kr.or.ddit.blog.dao.BlogDaoI;
import kr.or.ddit.blog.model.BlogVO;

public class BlogService implements BlogServiceI {

	private BlogDaoI blogDao;
	
	public BlogService() {
		blogDao = new BlogDao();
	}
	
	@Override
	public List<BlogVO> selectAllBlog() {
		return blogDao.selectAllBlog();
	}

}
