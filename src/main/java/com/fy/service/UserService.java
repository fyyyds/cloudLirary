package com.fy.service;
import com.fy.domain.User;
/**
 *用户接口
 */
public interface UserService{
    //通过User的用户账号和用户密码查询用户信息
    User login(User user);
}
