package kr.or.ddit.blog.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.blog.model.BlogVO;
import kr.or.ddit.blog.service.BlogService;
import kr.or.ddit.blog.service.BlogServiceI;
  	
@WebServlet("/bloglist")
public class BlogListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private BlogServiceI blogService;
	
	@Override
	public void init() throws ServletException {
		blogService = new BlogService();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<BlogVO> blogList = blogService.selectAllBlog();
		System.out.println(blogList.get(0).getBgNo());
		request.setAttribute("blogList", blogList);
		  
		request.getRequestDispatcher("/blog/bloglist.jsp").forward(request, response);;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
