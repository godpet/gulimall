package com.miaojinbo.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miaojinbo.common.utils.PageUtils;
import com.miaojinbo.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author miaojinbo
 * @email miao122015@163.com
 * @date 2022-07-11 20:39:05
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

