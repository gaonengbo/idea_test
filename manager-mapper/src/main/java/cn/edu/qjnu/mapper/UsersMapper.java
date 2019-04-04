package cn.edu.qjnu.mapper;

import cn.edu.qjnu.pojo.Users;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 高能波
 * @Date: 2019/4/2 15:11
 * Description: cn.edu.qjnu.mapper
 * version: 1.0
 */
public interface UsersMapper {

    void insertUser(Users user);

    List<Users> selectUserAll();
}
