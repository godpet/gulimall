package com.miaojinbo.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.miaojinbo.common.utils.PageUtils;
import com.miaojinbo.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author miaojinbo
 * @email miao122015@163.com
 * @date 2022-07-11 21:13:35
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

