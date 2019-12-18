package com.project.manage.controller;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.manage.redis.RedisUtil;

import io.swagger.annotations.Api;

@Controller
@RequestMapping(value = "/v1")
@Api(description = "接口测试")
public class TestController {

    @Resource
	private RedisUtil redisUtil; 
	
    /**
 	 * 获得数据库信息
 	 * @param request
 	 * @return
 	 */
 	@RequestMapping(value = "/html",method = RequestMethod.GET)
     public String html() {
         return "login";
     }
 	
 	/**
 	 * 获得数据库信息
 	 * @param request
 	 * @return
 	 */
 	@RequestMapping(value = "/jsp",method = RequestMethod.GET)
     public String jsp() {
 		return "login";
     }
    
	/**
	 * 获得数据库信息
	 * @param request
	 * @return
	 */
	/*
	 * @RequestMapping(value = "/user",method = RequestMethod.GET) public UserEntity
	 * getUser(HttpServletRequest request) { ServletContext application =
	 * request.getServletContext(); return (UserEntity)
	 * application.getAttribute("users"); }
	 */
	
	/**
             * 获取当前在线人数，该方法有bug
     * @param request
     * @return
     */
    @RequestMapping(value = "/total",method = RequestMethod.GET)
    public String getTotalUser(HttpServletRequest request) {
        Integer count = (Integer) request.getSession().getServletContext().getAttribute("count");
        return "当前在线人数：" + count;
    }
	
    /**
	 * 获得数据库信息
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/redis",method = RequestMethod.GET)
    public String redis(HttpServletRequest request) {
		redisUtil.get("runoobkey");
		redisUtil.set("1123", "asdfasdf");
        return (String) redisUtil.get("1123");
    }
}
