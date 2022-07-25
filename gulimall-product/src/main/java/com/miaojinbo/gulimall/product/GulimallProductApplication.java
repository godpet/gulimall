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
 * 2、逻辑删除
 *      1)配置全局的逻辑删除规则
 *      2)配置逻辑删除组件
 *      3)为Bean添加逻辑删除注解@TableLogic
 *
 * 3、JSR303
 *      1)给Bean添加校验注解，自定义message提示
 *      2)开启校验功能 @Valid
 *      3)校验的Bean后紧跟BindingResult，获取校验的结果
 *      4)分组校验
 *          1)校验注解添加分组
 *          2)@Validated({AddGroup.class})
 *          3)没有指定分组的校验注解，分组校验时不生效，只会在Validated时生效
 *      5)自定义校验
 *          1)编写一个自定义的校验注解
 *          2)编写一个自定义的校验器 ConstraintValidator
 *          3)关联自定义的校验器和自定义的校验注解
 *
 * 4、统一的异常处理
 * @ControllerAdvice
 *      1)编写异常处理类，使用@ControllerAdvice
 *      2)使用@ExceptionHandler标注方法可以处理的异常
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
