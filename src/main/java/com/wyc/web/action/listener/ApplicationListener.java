package com.wyc.web.action.listener;/**
 * Created by wyc on 2017/01/13.
 */

import com.wyc.web.spring.SpringBeanManager;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 做一些项目初始操作
 * @author wangyongcan
 * @Date 2017/01/13 16:54
 */
public class ApplicationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        // 通过ServletContext来得到Spring的ApplicationContext对象
        ServletContext servletContext = servletContextEvent.getServletContext();
        SpringBeanManager.initContext(WebApplicationContextUtils.getWebApplicationContext(servletContext));
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
}
