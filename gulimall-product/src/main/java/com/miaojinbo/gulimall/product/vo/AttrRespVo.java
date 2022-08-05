package com.miaojinbo.gulimall.product.vo;

import lombok.Data;
import org.aspectj.weaver.ast.Or;

/**
 * @Auther miaojinbo
 * @Create 2022-07-28-22:14
 */

@Data
public class AttrRespVo extends AttrVo{

    /**
     * 所属分类名字
     */
    private String catelogName;

    /**
     * 所属分组名字
     */
    private String groupName;


    private Long[] catelogPath;




}
