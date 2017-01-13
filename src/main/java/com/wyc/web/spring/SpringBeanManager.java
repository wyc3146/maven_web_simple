package com.wyc.web.spring;/**
 * Created by wyc on 2017/01/13.
 */

import org.springframework.context.ApplicationContext;

/**
 * Spring对象管理类，可以直接通过beanName查找容器中的对象
 * @author wangyongcan
 * @Date 2017/01/13 16:56
 */
public class SpringBeanManager {
    private static ApplicationContext context;

    public static void initContext(ApplicationContext ctx) {
        context = ctx;
    }

    public static Object getBean(String name) {
        return context.getBean(name);
    }

    public static <T> T getBean(String name, Class<T> cls) {
        return context.getBean(name, cls);
    }

    /**
     * 根据类型获取bean,bean名称为class.getSimpleName(首字母改为小写)
     * @param cls
     * @return
     */
    public static <T> T getBean(Class<T> cls) {
        String name = cls.getSimpleName();
        if(name !=null&&name.length()>1){
            name = name.substring(0,1).toLowerCase()+name.substring(1);
        }
        return context.getBean(name, cls);
    }
}
