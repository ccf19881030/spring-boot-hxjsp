package com.atguigu.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

/**
 * create by liuliang on 2019/3/25.
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    /**
     * 定义拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("注册拦截器");
        HandlerInterceptor myInterceptor = new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                System.out.println("my interceptor preHandle...");
                //通过返回true
                return true;
            }

            @Override
            public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
                System.out.println("my interceptor postHandle...");
            }

            @Override
            public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
                System.out.println("my interceptor afterCompletion...");
            }
        };
        registry.addInterceptor(myInterceptor).excludePathPatterns(Arrays.asList("/public/**", "/static/**")); //排除静态资源
    }

    /**
     * 映射静态资源链接
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index2").setViewName("index2");
    }


}
