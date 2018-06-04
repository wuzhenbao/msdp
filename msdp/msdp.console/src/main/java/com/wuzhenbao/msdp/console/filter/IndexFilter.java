package com.wuzhenbao.msdp.console.filter;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wuzhenbao.msdp.user.api.service.MsdpUserService;
import com.wuzhenbao.sb.it.commons.vo.UserVO;

public class IndexFilter implements Filter {
	private static Logger log = Logger.getLogger(IndexFilter.class);
	//@Autowired
	private MsdpUserService userService;
	private ClassPathXmlApplicationContext context ;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		 context  = new ClassPathXmlApplicationContext("applicationContext.xml");
         context.start();
         userService = context.getBean(MsdpUserService.class);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		String url = req.getRequestURL().toString();
		String uri = req.getRequestURI();
		log.info("跳转到："+url);
		UserVO user = null;
		if(null != userService) {
			
			try {
				user = userService.getUser();
			} catch (SQLException e) {
			}
			log.info("登录用户："+user.getUserNameCn());
		}
		if(uri.equals("/msdp/")) {
		}
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		context.close();
	}

}
