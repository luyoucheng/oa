package com.yousheng.oa.global;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ Auther:卢宥晟
 * @ Date:2019/5/1
 * @ Description:com.yousheng.oa.global
 * @ version:1.0
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        String url =httpServletRequest.getRequestURI();
        if(url.toLowerCase().contains("login")){
            return true;
        }
       HttpSession session = httpServletRequest.getSession();
        if(session.getAttribute("employee")!=null){
            return true;
        }
        httpServletResponse.sendRedirect("/to_login");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
