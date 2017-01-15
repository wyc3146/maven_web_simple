package com.wyc.web.service;/**
 * Created by wyc on 2017/01/15.
 */

import com.wyc.web.persistence.mapper.BaseEntityMapper;
import com.wyc.web.persistence.mapper.UserMapper;
import com.wyc.web.persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangyongcan
 * @Date 2017/01/15 19:39
 */
@Service
public class UserService extends BaseService<User,Integer> {
    @Autowired
    private UserMapper userMapper;

    @Override
    protected BaseEntityMapper<User, Integer> getBaseMapper() {
        return userMapper;
    }
}
