package com.atguigu.gmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
/**
 * @author xinyu
 * @date 2019-09-22 20:53
 */
@Configuration
public class GmallCorsConfiguration {

    @Bean
    public CorsWebFilter CorsWebFilter(){
        //初始化配置对象
        CorsConfiguration configuration=new CorsConfiguration();
        configuration.addAllowedOrigin("http://localhost:1000");//允许跨域的域名
        configuration.addAllowedMethod("*");//允许跨域的请求方法
        configuration.addAllowedHeader("*");//允许所有的头信息
        configuration.setAllowCredentials(true);//是否允许携带cookie

        //初始化cors配置源
        UrlBasedCorsConfigurationSource configurationSource=new UrlBasedCorsConfigurationSource();
        //允许所有请求走这个过滤器
        configurationSource.registerCorsConfiguration("/**",configuration);

        //初始化cors过滤器
         CorsWebFilter corsWebFilter= new CorsWebFilter(configurationSource);
         return corsWebFilter;




    }
}
