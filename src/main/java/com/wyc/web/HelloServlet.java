package com.wyc.web;/**
 * Created by wyc on 2017/01/13.
 */

import com.wyc.web.config.CommonConfig;
import com.wyc.web.spring.SpringBeanManager;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author wangyongcan
 * @Date 2017/01/13 14:52
 */
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() throws ServletException {
        // 执行必需的初始化
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        CommonConfig commonConfig = SpringBeanManager.getBean("commonConfig", CommonConfig.class);
        // 设置响应内容类型
        response.setContentType("text/html");

        // 实际的逻辑是在这里
        PrintWriter out = response.getWriter();
        out.println("<h1>" + commonConfig.getInitMessage() + "</h1>");
    }

    public void destroy() {
        // 什么也不做
    }
}
