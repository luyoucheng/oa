package com.yousheng.oa.global;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ Auther:卢宥晟
 * @ Date:2019/4/29
 * @ Description:com.yousheng.oa.global
 * @ version:1.0
 */
public class EncodingFilter implements Filter {
    private String encoding ="utf-8";

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
                  if(filterConfig.getInitParameter("encoding")!=null){
                      encoding=filterConfig.getInitParameter("encoding");
                  }

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest  request=(HttpServletRequest)servletRequest;
        HttpServletResponse response =(HttpServletResponse)servletResponse;
        request.setCharacterEncoding(encoding);
        response.setCharacterEncoding(encoding);
        filterChain.doFilter(request,response);

    }

    @Override
    public void destroy() {

    }
}
