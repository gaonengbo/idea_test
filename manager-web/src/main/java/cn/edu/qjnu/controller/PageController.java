package cn.edu.qjnu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: 高能波
 * @Date: 2019/4/3 19:32
 * Description: cn.edu.qjnu.controller
 * version: 1.0
 */
@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){

        return page;
    }
}
