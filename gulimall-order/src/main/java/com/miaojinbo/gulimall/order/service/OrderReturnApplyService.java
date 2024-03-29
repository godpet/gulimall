package com.miaojinbo.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miaojinbo.common.utils.PageUtils;
import com.miaojinbo.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author miaojinbo
 * @email miao122015@163.com
 * @date 2022-07-11 21:13:35
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

