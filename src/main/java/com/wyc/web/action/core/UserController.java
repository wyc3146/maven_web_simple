package com.wyc.web.action.core;/**
 * Created by wyc on 2017/01/13.
 */

import com.wyc.web.action.base.GenericController;
import com.wyc.web.persistence.model.User;
import com.wyc.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangyongcan
 * @Date 2017/01/13 17:16
 */
@Controller
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequestMapping(value = "/user")
public class UserController extends GenericController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = {"insertUser"}, method = RequestMethod.GET)
    public Map<String,Object> insertUser(User user,String username) {
        userService.insert(user);

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("code",0);
        map.put("message","添加成功");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = {"queryUser"}, method = RequestMethod.GET)
    public Map<String,Object> queryUser(Integer id) {
        User user = userService.find(id);

        Map<String,Object> map = new HashMap<String, Object>();
        map.put("code",0);
        map.put("message","查询成功");
        map.put("data",user);
        return map;
    }

}
