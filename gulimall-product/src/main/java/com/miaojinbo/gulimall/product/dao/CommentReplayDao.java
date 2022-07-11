package com.miaojinbo.gulimall.product.dao;

import com.miaojinbo.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author miaojinbo
 * @email miao122015@163.com
 * @date 2022-07-11 16:54:46
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
