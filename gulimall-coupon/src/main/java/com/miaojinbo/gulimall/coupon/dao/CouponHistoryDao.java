package com.miaojinbo.gulimall.coupon.dao;

import com.miaojinbo.gulimall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author miaojinbo
 * @email miao122015@163.com
 * @date 2022-07-11 20:39:07
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
