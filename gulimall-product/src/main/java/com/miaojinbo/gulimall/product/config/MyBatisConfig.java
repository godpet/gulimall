package com.miaojinbo.gulimall.product.config;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Auther miaojinbo
 * @Create 2022-07-28-19:22
 */
@Configuration
@EnableTransactionManagement //开启事务
@MapperScan("com.miaojinbo.gulimall.product.dao")
public class MyBatisConfig {

    //引入分页插件
    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor(){
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();

        paginationInnerInterceptor.setOverflow(true);
        paginationInnerInterceptor.setMaxLimit(1000L);
        return  paginationInnerInterceptor;
    }
}
