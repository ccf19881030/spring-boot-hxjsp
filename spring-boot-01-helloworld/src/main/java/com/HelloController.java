package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    /**
     * 不生效因为只扫描MainApplication所在包（atguigu）下的Controller
     * 此类在包外
     */
    @ResponseBody
    @RequestMapping("/hello2")
    public String helloFailed(){
        return "Hello World!";
    }
}
