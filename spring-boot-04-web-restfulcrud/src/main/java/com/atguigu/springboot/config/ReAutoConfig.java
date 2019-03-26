package com.atguigu.springboot.config;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

/**
 * create by liuliang on 2019/3/25.
 */
@SuppressWarnings("all")
@Configuration
public class ReAutoConfig {

    /**
     * 定制视图解析器
     */
    @Bean
    public ViewResolver myViewResolver() {
        return new ViewResolver() {
            @Override
            public View resolveViewName(String s, Locale locale) throws Exception {
                return null;
            }
        };
    }

    /**
     * 转换Http请求和响应的
     */
//    @Bean
//    public Converter myConverter() {
//        return new Converter() {
//            @Override
//            public Object convert(Object source) {
//                return source;
//            }
//        };
//    }

    /**
     * 定制转换器（如：把String "1"转为Integer 1）
     */
//    @Bean
//    public HttpMessageConverter myHttpMessageConverter() {
//        return new HttpMessageConverter() {
//
//            @Override
//            public List<MediaType> getSupportedMediaTypes() {
//                return null;
//            }
//
//            @Override
//            public Object read(Class aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
//                return null;
//            }
//
//            @Override
//            public void write(Object o, MediaType mediaType, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
//
//            }
//
//            @Override
//            public boolean canWrite(Class aClass, MediaType mediaType) {
//                return false;
//            }
//
//            @Override
//            public boolean canRead(Class aClass, MediaType mediaType) {
//                return false;
//            }
//        };
//    }

    /**
     * 定义错误代码生成规则
     */
    @Bean
    public MessageCodesResolver myMessageCodesResolver() {
        return new MessageCodesResolver() {

            @Override
            public String[] resolveMessageCodes(String errorCode, String objectName) {
                return new String[0];
            }

            @Override
            public String[] resolveMessageCodes(String errorCode, String objectName, String field, Class<?> fieldType) {
                return new String[0];
            }
        };
    }

    /**
     * 注意！！重写这个可能使spring.mvc.date-format=yyyy-MM-dd 失效
     */
//    @Bean
//    public ConfigurableWebBindingInitializer myConfigurableWebBindingInitializer() {
//        return new ConfigurableWebBindingInitializer() {
//
//        };
//    }


}
