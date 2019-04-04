package cn.edu.qjnu.service.impl;

import cn.edu.qjnu.mapper.UsersMapper;
import cn.edu.qjnu.pojo.Users;
import cn.edu.qjnu.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: 高能波
 * @Date: 2019/4/3 19:36
 * Description: cn.edu.qjnu.service.impl
 * version: 1.0
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;
    @Override
    public void addUser(Users users) {
        this.usersMapper.insertUser(users);
    }
}
