package cn.edu.qjnu.controller;

import cn.edu.qjnu.pojo.Users;
import cn.edu.qjnu.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: 高能波
 * @Date: 2019/4/3 19:35
 * Description: cn.edu.qjnu.controller
 * version: 1.0
 */
@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/addUser")
    public String addUser(Users users) {
        this.usersService.addUser(users);
        return "ok";
    }
}
