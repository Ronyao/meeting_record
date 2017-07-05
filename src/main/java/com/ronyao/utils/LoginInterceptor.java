package com.ronyao.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{
	
    public void afterCompletion(HttpServletRequest arg0,  
            HttpServletResponse arg1, Object arg2, Exception arg3)  
            throws Exception {  
    }  
  
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,  
            Object arg2, ModelAndView arg3) throws Exception {  
    }  
   
    public boolean preHandle(HttpServletRequest request, HttpServletResponse arg1,  
            Object arg2) throws Exception {  
    	
    	//获取url判断是否只想login，是则不拦截，否则判断是否存在session，是则跳过登录，否则都跳转到login
    	String reqUrl=request.getRequestURI().replace(request.getContextPath(), "");
    	if(reqUrl.contains("login")||reqUrl.contains("static")){
    		return true;
    	}else{
    		HttpSession session = request.getSession();
    		String username = (String) session.getAttribute("username");
    		if(username!=null){
    			return true;
    		}else{
    			request.getRequestDispatcher("login").forward(request,arg1);  
                return false; 
    		}
    	}
    } 
}
