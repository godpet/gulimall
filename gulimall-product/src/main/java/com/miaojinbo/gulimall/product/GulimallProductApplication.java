package com.miaojinbo.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther miaojinbo
 * @Create 2022-07-11-18:29
 *
 * 1、整合MyBatis-plus
 *      1)导入依赖
 *      2)配置
 *          1、配置数据源
 *              1)导入数据库驱动
 *              2)配置数据源相关信息-yaml
 *          2、配置myBatis-plus
 *              1)MapperScan
 *              2）告诉myBatis-plus  sql映射文件的位置
 *
 *
 *
 */

@EnableDiscoveryClient
@MapperScan("com.miaojinbo.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }
}
