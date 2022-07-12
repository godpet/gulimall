package com.miaojinbo.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther miaojinbo
 * @Create 2022-07-11-21:04
 *
 * 1、远程调用服务的步骤：
 *      1)引入open-feign
 *      2)编写接口，告诉springcloud改接口需要调用远程服务
 *          1)声明接口的每个方法都是调用哪个远程服务的哪个请求
 *      3)开启远程调用功能
 */

@EnableFeignClients(basePackages = "com.miaojinbo.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
