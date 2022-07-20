package com.miaojinbo.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miaojinbo.common.utils.PageUtils;
import com.miaojinbo.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author miaojinbo
 * @email miao122015@163.com
 * @date 2022-07-11 16:54:46
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

