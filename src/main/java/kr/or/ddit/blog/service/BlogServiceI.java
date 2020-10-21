package kr.or.ddit.blog.service;

import java.util.List;

import kr.or.ddit.blog.model.BlogVO;

public interface BlogServiceI {
	
	List<BlogVO> selectAllBlog();
}
