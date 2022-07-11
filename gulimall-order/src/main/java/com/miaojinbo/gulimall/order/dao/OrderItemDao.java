package com.miaojinbo.gulimall.order.dao;

import com.miaojinbo.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author miaojinbo
 * @email miao122015@163.com
 * @date 2022-07-11 21:13:36
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
