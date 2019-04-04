package cn.edu.qjnu.test;

import cn.edu.qjnu.mapper.UsersMapper;
import cn.edu.qjnu.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: 高能波
 * @Date: 2019/4/2 16:33
 * Description: cn.edu.qjnu.test
 * version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUser(){
        Users users = new Users();
        users.setUserage(22);
        users.setUsername("高能波");
        this.usersMapper.insertUser(users);
    }
}
