package com.miaojinbo.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Auther miaojinbo
 * @Create 2022-07-11-20:47
 *
 * 1、使用Nacos作为配置中心进行统一管理
 *      1)引入依赖
 *      2)创建bootstrap.properties
 *      3)给配置中心默认添加 当前应用名.properties 的数据集
 *      4)添加配置
 *      5)@RefreshScope @Value("${配置项key}") 动态获取配置
 *      6)配置中心优先于配置文件
 *
 * 2、细节
 *      1)命名空间：配置隔离
 *          默认：public
 *          开发、测试、生产可以创建自己的命名空间 利用命名空间进行环境隔离
 *          在bootstrap.properties配置需要使用的命名空间
 *          每个微服务之间相互隔离配置，每个微服务创建自己的命名空间，只加载自己命名空间下的所有配置
 *      2)配置集--一组配置
 *      3)配置集ID--类似于配置文件名
 *      4)配置分组
 *          默认所有的配置集都属于DEFAULT_GROUP
 *
 * 3、同时加载多个配置集
 *      1)微服务任何配置文件都可以放在配置中心
 *      2)只需要在bootstrap.properties说明加载配置中心的哪些配置文件即可
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
