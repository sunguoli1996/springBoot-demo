package com.stt.blog.interceptor;

import com.stt.blog.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BackInterceptor implements HandlerInterceptor {

    private static String username = "stt";
    private static String password = "123456";

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        boolean flag = true;
        User user = (User) request.getSession().getAttribute("user");
        if (null == user) {
            flag = false;
        } else {
            if (!user.getUsername().equals(username) || !user.getPassword().equals(password)) {
                flag = false;
            }
        }
        return flag;
    }
}
