package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

    /**
     * 查出用户数据，在页面展示  三种方式都可以给页面传值
     */
    @RequestMapping("/success")
    public String success(HttpServletRequest request, Map<String, Object> map, Model model) {
        Map<String, String> obj = new HashMap();
        obj.put("name", "阿佐");
        obj.put("sex", "女");

        request.setAttribute("obj", obj);

        model.addAttribute("hello", "<h1>你好</h1>");

        map.put("users", Arrays.asList("zhangsan", "lisi", "wangwu"));

        return "success";
    }

}
