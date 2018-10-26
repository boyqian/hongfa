package com.hongfa.app.interceptor;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Copyright (c) 2018,重庆扬讯软件技术股份有限公司&lt;br&gt;
 * All rights reserved.&lt;br&gt;
 * <p>
 * 描述：简要描述本文件的内容&lt;br&gt;
 *
 * @author boyqian
 * Create time 2018/10/26 14:06
 * <p>
 * Date           Author   Version  Description
 * ----------------------------------------------------------------------
 * 2018/10/26   boyqian       1.0      首次新增
 */
@Configuration
public class SpringConfigInterceptor implements WebMvcConfigurer{

    @Bean
    public HandlerInterceptor loginInterceptor(){
        return new LoginInterceptor();
    }
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(loginInterceptor()).addPathPatterns("/**").excludePathPatterns("/login","/loginOut");
    }
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")//设置允许跨域的路径
                .allowedOrigins("*")//设置允许跨域请求的域名
                .allowCredentials(true)//是否允许证书 不再默认开启
                .allowedMethods("GET", "POST", "PUT", "DELETE")//设置允许的方法
                .maxAge(3600);//跨域允许时间
    }
}
