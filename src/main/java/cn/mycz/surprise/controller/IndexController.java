package cn.mycz.surprise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 木已成舟
 * @date 2020/2/13
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String redirect() {
        System.out.println("hehah");
        return "index";
    }
}
