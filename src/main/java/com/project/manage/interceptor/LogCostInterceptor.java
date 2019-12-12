package com.project.manage.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截器
 * @author Administrator
 *
 */
public class LogCostInterceptor implements HandlerInterceptor{

	private static final Logger logger = LoggerFactory.getLogger(LogCostInterceptor.class);
	
	long start = System.currentTimeMillis();
	
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, 
    		Object o) throws Exception {
        start = System.currentTimeMillis();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, 
    		Object o, ModelAndView modelAndView) throws Exception {
    	logger.info("Interceptor cost="+(System.currentTimeMillis()-start));
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, 
    		Object o, Exception e) throws Exception {
    }
}
