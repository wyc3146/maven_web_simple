package com.wyc.web.action.core;/**
 * Created by wyc on 2017/01/13.
 */

import com.wyc.web.action.base.GenericController;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author wangyongcan
 * @Date 2017/01/13 17:16
 */
@Controller
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequestMapping(value = "/")
public class HelloController extends GenericController {

    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public String index(ModelMap model, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + "haha" + "</h1>");
        return null;
    }

    @RequestMapping(value = {"helloSimpleView"}, method = RequestMethod.GET)
    public String helloSimpleView(ModelMap model, HttpServletResponse response) throws IOException {
        model.addAttribute("name","wyc");
        // 简单的模板处理，会匹配到com.wyc.web.action.view.SimpleViewResolver
        return "/my_name.simple";
    }

}
