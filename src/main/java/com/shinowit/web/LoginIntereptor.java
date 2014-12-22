package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2014/12/22.
 */
@Controller
@RequestMapping("/intercep")
public class LoginIntereptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        String msgname = (String)session.getAttribute("status");
        if((msgname!=null)&&(session!=null)){
            return true;
        }
        String uri = request.getRequestURI();
        if(uri.endsWith("/login2")||(uri.endsWith("/showlogin"))){
            return true;
        }

        response.sendRedirect(request.getContextPath()+"/fuck/showlogin");

            return false;
    }
}
