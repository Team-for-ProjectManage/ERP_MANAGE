package com.project.manage.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;

import com.project.manage.controller.UserController;

/**
 * 使用 ApplicationListener 来初始化一些数据到 application 域中的监听器
 * @author shgaozhanguo
 * @date 2018/07/05
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Override
    public void contextDestroyed(ServletContextEvent arg0) {
		
    }
	
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
    	logger.info("MyListener ...init......");
    }

}
